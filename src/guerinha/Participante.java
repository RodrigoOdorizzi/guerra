package guerinha;

public class Participante {

 

     private int cod;
    private String nome;

 
    
    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
 
       @Override
    public String toString() {
        return "Participante{" + "cod=" + cod + ", nome=" + nome + '}';
    }
   
}
