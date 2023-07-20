import java.util.Scanner;

public class CoversorApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int input = 0;
        while(input != 11){
            Conversor.exibirMenu();
            input = entrada.nextInt();

            switch (input){
                case 1:
                    Conversor.conversor("reais", "dolar", 0.21, entrada);
                    break;
                case 2:
                    Conversor.conversor("reais", "euro", 0.19, entrada);
                    break;
                case 3:
                    Conversor.conversor("reais", "librasEsterlinas", 0.16, entrada);
                    break;
                case 4:
                    Conversor.conversor("reais", "pesoArgentino", 55.983, entrada);
                    break;
                case 5:
                    Conversor.conversor("reais", "pesoChileno", 170, entrada);
                    break;
                case 6:
                    Conversor.conversor("dolar", "reais", 4.80, entrada);
                    break;
                case 7:
                    Conversor.conversor("euro", "reais", 5.34, entrada);
                    break;
                case 8:
                    Conversor.conversor("librasEsterlinas", "reais",  6.1760, entrada);
                    break;
                case 9:
                    Conversor.conversor("pesoArgentino", "reais", 0.0179, entrada);
                    break;
                case 10:
                    Conversor.conversor("pesoChileno", "reais", 0.01, entrada);
                    break;
                case 11:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Digite uma opção Válida");
                    break;
            }
        }

        System.out.println();
        entrada.close();

    }
}
