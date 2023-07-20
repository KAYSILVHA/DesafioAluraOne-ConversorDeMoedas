import java.util.Scanner;

public class Conversor {

    public static void exibirMenu(){
        System.out.println("---------------------");
        System.out.println("1- Converter de Reais a Dólar");
        System.out.println("2- Converter de Reais a Euro");
        System.out.println("3- Converter de Reais a Libras Esterlinas");
        System.out.println("4- Converter de Reais a Peso argentino");
        System.out.println("5- Converter de Reais a Peso Chileno");
        System.out.println("6- Converter de Dólar a Reais");
        System.out.println("7 - Converter de Euro a Reais");
        System.out.println("8- Converter de Libras Esterlinas a Reais");
        System.out.println("9- Converter de Peso argentino a  Reais");
        System.out.println("10- Converter de Peso Chileno a Reais");
        System.out.println("11 - Sair");
        System.out.println("Digite uma opção Válida:");
        System.out.println("---------------------");
    }

    public static void conversor(String unidadeDeOrigem, String unidadeDeDestino, double proporcao, Scanner leitor){
        System.out.println("Você escolheu: " + unidadeDeOrigem + " --> " + unidadeDeDestino);
        System.out.println("Digite o valor a ser convertido: ");
        double valor = leitor.nextDouble();
        double valorFinal = valor * proporcao;
        System.out.println("Valor: " + valorFinal);
    }
}
