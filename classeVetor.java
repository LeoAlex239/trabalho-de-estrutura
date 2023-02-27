import java.util.Scanner;
public class classeVetor {
    int OpcaoEscolhida;
    int tamanho = 10;
    int [] vetor = new int[tamanho];
    
    public int getOpcaoEscolhida() {
        return OpcaoEscolhida;
    }

    static boolean pesquisa(int p, int [] vetor){
        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] == p){
                return true;
            }
            
        }
        return false;
    }
    public void opcao1(){
    
    int opcaoEscolhida;
    Scanner s = new Scanner(System.in);
    
     
    String opcoes2 = "------------------------------\n"+
                      "|           Vetor            |\n"+
                      "------------------------------\n"+
                      "|   1 -  Inserir dado        |\n"+
                      "|   2 -  Alterar dado        |\n"+
                      "|   3 -  Pesquisar dado      |\n"+
                      "|   4 -  Mostrar dados       |\n"+
                      "|   5 -  Voltar              |\n"+
                      "------------------------------\n"+
                      "Selecione a opção desejada: ";
        
        System.out.println(opcoes2);
        opcaoEscolhida = s.nextInt();
        while (opcaoEscolhida < 5){
            if(opcaoEscolhida == 1){
                System.out.println("Insira um número inteiro de cada vez(Máx = 10): ");
                for( int i = 0; i < tamanho; i++ ){
                    System.out.println("Insira o "+(i+1)+ "° numero:");
                    vetor[i] = (s.nextInt());
                    
                } 
                break;                           
            }
            else if (opcaoEscolhida == 2) {
               System.out.println("Insira um índice: ");
               int indice = s.nextInt();
               System.out.println("Insira o número substituto: ");
               int numeroUsuario;
               numeroUsuario = s.nextInt();
               vetor[indice] = numeroUsuario; 
               break;
            }
            else if (opcaoEscolhida == 3) {
              System.out.println("Insira o número procurado: ");
              int p = s.nextInt();
              System.out.println(pesquisa(p, vetor));
              if(p != -1){
                  System.out.println(p);
              }else{
                  System.out.println("Número não encontrado: " +  p); //mudar a frase
              }
              break;
            } 
            else if (opcaoEscolhida == 4) {
                System.out.println("Dados armazenados no vetor: ");
                for (int i = 0; i < tamanho; i++) {
                    System.out.println(vetor[i]);
                 }
                 break;
            }
            
        }
           System.out.println(opcoes2);
            opcaoEscolhida = s.nextInt();


}
}
