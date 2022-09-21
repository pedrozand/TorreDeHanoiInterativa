package ed_torredehanoi;

/**
 *  Trabalho Estrutura de Dados - Torre de Hanoi
 * @author Pedro Henrique de Oliveira
 */

public class Pilha {
    private No base;
    private No topo;
    
    public Pilha(){
        base =  topo = null;
    }
    
    public void Empilha(Integer item){
        if(Vazia()){
            base = topo = new No(item);
        }else{
            topo.setProximo(new No(item));
            topo = topo.getProximo();
        }
    }
    
    public Integer Desempilha(){
        if(Vazia()){
            return null;
        }
        int item = topo.getDado();
        if(base == topo){
            base = topo = null;
        }else{
            No atual = base;
            while(atual.getProximo() != topo){
                atual = atual.getProximo();
            }
            topo = atual;
            atual.setProximo(null);
        }
        return item;
    }
    
     public String exibePilha(){
        String temp = "";
        if(Vazia()){
            return temp;
        }
        No atual = base;
        while (atual != null){
            temp += atual.getDado() + ", ";
            atual = atual.getProximo();
        }
        temp += "\n";
        return temp;
    }
     
    public Integer exibeUltimo(){
        if(topo == null){
            return null;
        }else{
            return topo.getDado();
        }
    }
    
    public boolean Vazia(){
        return base == null;
    }
    
}
