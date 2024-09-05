import javax.swing.JOptionPane;
public class SomarDoisNumerosV2 {
    public static void main(String [] args){
        // Declarando variáveis
        double a, b, resultado;

        // Entradas dos Dados
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite um Valor:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor:"));

        //Processando
        resultado = a + b;

        //Saida
        JOptionPane.showMessageDialog(
            null, 
            String.format("%.2f + %.2f = %.2f", a, b, resultado)
        );
    }
}