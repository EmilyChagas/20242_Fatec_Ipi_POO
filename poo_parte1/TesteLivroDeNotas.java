import javax.swing.JOptionPane;

public class TesteLivroDeNotas {
    public static void main(String...args){
        //Construir o livro de notas
        var disciplina1 = JOptionPane.showInputDialog("Digite o nome da disciplina: ");
        var meuLivro = new LivroDeNotas();

        //Acionar o coportamento sobre ele
        meuLivro.nomeDisciplina = disciplina1;
        meuLivro.exibirMensagem();

        //Construir novo livro e comportamento
        var disciplina2 = JOptionPane.showInputDialog("Digite o nome da disciplina 2: ");
        var outroLivro = new LivroDeNotas();
        outroLivro.nomeDisciplina = disciplina2;
        outroLivro.exibirMensagem();

    }
}
