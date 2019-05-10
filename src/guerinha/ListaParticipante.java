package guerinha;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class ListaParticipante {
    
   
	static List<Participante> listandoPa = new ArrayList<Participante>();

        public static void inserir(Participante par) {
		listandoPa.add(par);
	}

	public static List getLista() {

		return listandoPa;
	}
        
        public void remove(Participante par) {
		listandoPa.remove(par);
	}
        
        public String toString() {
		StringBuilder b = new StringBuilder();
		for (Iterator<Vendedor> iterator = listandoVe.iterator(); iterator.hasNext();) {
			Vendedor Vendedor = (Vendedor) iterator.next();
			b.append(Vendedor.toString());
			b.append("\n");
		}
		return b.toString();
	}
	
	public void gravarJSON() throws IOException {
		GsonBuilder builder = new GsonBuilder();
		// Classe base do GSON
	    Gson gson = builder.create();
	    // Classe para escrita de arquivo
	    FileWriter writer = new FileWriter("arquivos/Vendedores.json");
	    // Escreve o arquivo
	    writer.write(gson.toJson(listandoVe));
	    // Fecha o arquivo
	    writer.close();
	}

	public void lerJSON() throws FileNotFoundException {
	    // Lê o arquivo
	    BufferedReader bufferedReader = new BufferedReader(new FileReader("arquivos/Vendedores.json"));

	    // Cria um divisor de partes específico para a lista de objetos (Coleção Genérica)
	    Type listType = new TypeToken<ArrayList<Vendedor>>(){}.getType();

	    // Pega os dados do arquivo respeitando o divisor criado
	    listandoVe = new Gson().fromJson(bufferedReader, listType);
	}
	
        
        
	}

 