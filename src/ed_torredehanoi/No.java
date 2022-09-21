package ed_torredehanoi;

/**
 *  Trabalho Estrutura de Dados - Torre de Hanoi
 * @author Pedro Henrique de Oliveira
 */

public class No {
    private Integer dado;
    private No proximo;
    
    public No getProximo(){
        return this.proximo;
    }
    
    public void setProximo(No proximo){
        this.proximo = proximo;
    }
    
    public int getDado(){
        return this.dado;
    }
    
    //Constructor
    public No(int newD){
        dado = newD;
        proximo = null;
    }
    public No(int newD, No conect){
        dado = newD;
        proximo = null;
    }
    
}
