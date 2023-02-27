import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        int opcaoEscolhida = 0, numopcaoDoVetor, numopcaoDaLista;
        classeVetor opcaoDoVetor = new classeVetor();
        numopcaoDoVetor = opcaoDoVetor.getOpcaoEscolhida();
        
        
        Scanner opcoes = new Scanner(System.in);
            while  (true) {
                
            
            System.out.println("-------------------------");
            System.out.println("|      1 - Vetor        |");
            System.out.println("|      2 - Lista        |");
            System.out.println("-------------------------");
            System.out.println("Selecione a opção desejada: ");
            
            int opcao = opcoes.nextInt();
            
            switch (opcao) {
                case 1: opcaoDoVetor.opcao1();
                break;
            
            }
            }
        }

    
}
    