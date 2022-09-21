package ed_torredehanoi;
import java.util.Scanner;

/**
 *  Trabalho Estrutura de Dados - Torre de Hanoi
 * @author Pedro Henrique de Oliveira
 */
public class TorreDeHanoi {
    static Pilha pilhaX = new Pilha();
    static Pilha pilhaY = new Pilha();
    static Pilha pilhaZ = new Pilha();
    public static void main(String[] args) {

        
        for(int i = 6; i > 0; i--){
            pilhaX.Empilha(i);
        }
        int opcao;
        int origem;
        int destino;
        Scanner teclado = new Scanner(System.in);
        do{
            menu();
            opcao = teclado.nextInt();
            if(opcao == 1){
                msg();
                System.out.print("\n ### Pilha de Origem ### -> Digite: (1 / 2 / 3): ");
                origem = teclado.nextInt();
                do{
                    System.out.print(" # Informe a Pilha de Destino: ");
                    destino = teclado.nextInt();
                }while(origem == destino);
                if(origem == 1 && destino == 2){
                    if(pilhaY.exibeUltimo() == null || pilhaX.exibeUltimo() < pilhaY.exibeUltimo()){
                        pilhaY.Empilha(pilhaX.Desempilha());
                    }else{
                        System.out.println("\n !!! Um objeto maior não pode ser empilhado a cima de um menor !!!");
                    }
                }
                if(origem == 1 && destino == 3){
                    if(pilhaZ.exibeUltimo() == null || pilhaX.exibeUltimo() < pilhaZ.exibeUltimo()){
                        pilhaZ.Empilha(pilhaX.Desempilha());
                    }else{
                        System.out.println("\n !!! Um objeto maior não pode ser empilhado a cima de um menor !!! ");
                    }
                }
                if(origem == 2 && destino == 3){
                    if(pilhaZ.exibeUltimo() == null || pilhaY.exibeUltimo() < pilhaZ.exibeUltimo()){
                        pilhaZ.Empilha(pilhaY.Desempilha());
                    }else{
                        System.out.println("\n !!! Um objeto maior não pode ser empilhado a cima de um menor !!! ");
                    }
                }
                if(origem == 3 && destino == 2){
                    if(pilhaY.exibeUltimo() == null || pilhaZ.exibeUltimo() < pilhaY.exibeUltimo()){
                        pilhaY.Empilha(pilhaZ.Desempilha());
                    }else{
                        System.out.println("\n !!! Um objeto maior não pode ser empilhado a cima de um menor !!! ");
                    }
                }
                if(origem == 3 && destino == 1){
                    if(pilhaX.exibeUltimo() == null || pilhaZ.exibeUltimo() < pilhaX.exibeUltimo()){
                        pilhaX.Empilha(pilhaZ.Desempilha());
                    }else{
                        System.out.println("\n !!! Um objeto maior não pode ser empilhado a cima de um menor !!! ");
                    }
                }
                if(origem == 2 && destino == 1){
                    if(pilhaX.exibeUltimo() == null || pilhaY.exibeUltimo() < pilhaX.exibeUltimo()){
                        pilhaX.Empilha(pilhaY.Desempilha());
                    }else{
                        System.out.println("\n !!! Um objeto maior não pode ser empilhado a cima de um menor !!! ");
                    }
                }
                if(pilhaX.Vazia() && pilhaY.Vazia()){
                    System.out.println("\n  ------------ ! Fim de Jogo ! ------------ ");
                    msg();
                    break;
                }
                msg();
            }
        }while(opcao != 0); 
    }
    
    public static void menu(){
            System.out.println("#############################################");
            System.out.println("                TORRE DE HANOI               ");
            System.out.println("#############################################");
            System.out.println(" Iniciar jogado = [1] ");
            System.out.println(" Encerrar jogo  = [0] \n");
            System.out.print(" -> Informe uma ação: ");
    }
    public static void msg(){
        System.out.print("\n Pino X: " + pilhaX.exibePilha());
        System.out.print("\n Pino Y: " + pilhaY.exibePilha());
        System.out.print("\n Pino Z: " + pilhaZ.exibePilha() + "\n");
    }
    
}
