//data acces object

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {
    public void cadastrar(Pessoa p) throws Exception{
        //1. Especificar o comando SQL(Insert)
        var sql = "INSERT INTO tb_pessoa(nome, fone, email) VALUES (?,?,?)";
        
        //2. Estabelecer uma conexão com o bd
        var conexao = ConnectionFactory.conectar();
        
        //3. Preparar o comando
        var ps = conexao.prepareStatement(sql);
       
        //4. Substituir os eventuais placeholders
        ps.setString(1, p.getNome());
        ps.setString(2, p.getFone());
        ps.setString(3, p.getEmail());

        //5. Executar o comando
        ps.execute();

        //6. Fechar conexão
        ps.close();
    }

    public void apagar(Pessoa p) throws Exception{
        var sql = "DELETE FROM tb_pessoa WHERE cod_pessoa = ?";
        try (var conexao = ConnectionFactory.conectar() ) {
            var ps = conexao.prepareStatement(sql);
            ps.setInt(1,p.getCodigo());
            ps.execute();
        }
    }

    public List<Pessoa> listar() throws Exception{
        var pessoas = new ArrayList<Pessoa>();
        var sql = "SELECT * FROM tb_pessoa";
        try(var conexao = ConnectionFactory.conectar()) {
            var ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                var codigo = rs.getInt("cod_pessoa");
                var nome = rs.getString("nome");
                var fone = rs.getString("fone");
                var email = rs.getString("email");
                var p = new Pessoa(codigo,nome,fone,email);
                pessoas.add(p);
            }

        } 
        return pessoas;
    } 
}
