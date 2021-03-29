import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao = 0;

        //Do while bom para uso de opções 
        do {
            System.out.println("Escolha uma opção");
            System.out.println("1 - Iniciar Jogo");
            System.out.println("2 - Ajuda");
            System.out.println("3 - Sair");
            System.out.println("Opção:");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a opção 1");
                    break;
                case 2:
                    System.out.println("Você escolheu a opção 2");
                    break;
                default:
                    System.out.println("Saindo!");
                    break;
            }

        }   while(opcao != 3);
    }
}
