import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        var menu = "1 - Cadastrar\n2 - Listar\n3 - Atualizar\n4 - Apagar\n0 - Sair\n";
        int op = 0;
        do { 
            op = Integer.parseInt(
                JOptionPane.showInputDialog(menu)
            );
            switch (op) {
                case 1:{
                    var nome = JOptionPane.showInputDialog("Digite o nome: ");
                    var fone = JOptionPane.showInputDialog("Digite o telefone: ");
                    var email = JOptionPane.showInputDialog("Digite o email: ");
                    var p = new Pessoa(0,nome, fone, email);
                    var dao = new PessoaDAO();
                    dao.cadastrar(p);
                    JOptionPane.showMessageDialog(null,"Cadastrado!");
                    break;
                } 
                case 2:{
                    var pessoas = new PessoaDAO().listar();
                    JOptionPane.showMessageDialog(null, pessoas);
                    break;
                }
                case 4:{
                    var codigo = Integer.parseInt(
                        JOptionPane.showInputDialog("Digite o codigo: ")
                    );
                    var p = new Pessoa(codigo);
                    var dao = new PessoaDAO();
                    dao.apagar(p);
                    JOptionPane.showMessageDialog(null,"Excluido!");
                    break;
                }
                    
            }
        } while (op != 0);
    }
}
