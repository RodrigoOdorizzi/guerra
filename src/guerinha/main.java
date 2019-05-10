package guerinha;
import java.time.Clock;
import java.util.Scanner;

/**
 *
 * @author rodrigo
 */
public class main {
 
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        Participante part = new Participante();
        int cod;
        String nome;
        
        System.out.println(" INforme o código do Participante");
        cod = entrada.nextInt();
        
        part.setCod(cod);
        
        entrada.nextLine();
        
        System.out.println(" Informe o nome do Participante");
        nome = entrada.nextLine();
        
        part.setNome(nome);
    }
    
    
    
    
}
