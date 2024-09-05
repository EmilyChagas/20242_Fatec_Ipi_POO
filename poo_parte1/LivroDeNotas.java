
import javax.swing.JOptionPane;

public class LivroDeNotas{
    //variaveis de instâncias
    String nomeDisciplina;

    //Metodo de instância
    public void exibirMensagem(){
        //System.out.println("Bem Vindo ao Livro de Notas!");
        JOptionPane.showMessageDialog(
            null,
            String.format(
                "Bem vindo ao Livro de Notas da disciplina %s",
                nomeDisciplina
            )
        );
    }
}
