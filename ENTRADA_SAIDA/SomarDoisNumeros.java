import java.util.Scanner;

public class SomarDoisNumeros{
    public static void main(String[] args) {
        try (//Declaração de variaveis
        Scanner leitor = new Scanner(System.in)) {
            int a, b, resultadoDaSoma;
            
            //Entrada de Dados
            System.out.println("Digite um valor: ");
            a = leitor.nextInt();

            System.out.println("Digite outro valor: ");
            b = leitor.nextInt();

            //Processamento
            resultadoDaSoma = a + b;
            
            //Saída
            //System.out.println(a + "+" + b + "=" + resultadoDaSoma);
            System.out.printf("%d + %d = %d\n", a, b, resultadoDaSoma);
        }
    }
}