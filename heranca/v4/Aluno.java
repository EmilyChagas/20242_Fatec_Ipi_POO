package heranca.v4;

public class Aluno extends Pessoa {

    private int ra;
    public Aluno(String nome, int idade, int ra){
        super(nome, idade);
        this.ra = ra;
        System.out.println("Construindo um aluno...");
    }
    public void estudar(){
        System.out.println(getNome() + "estudando");
    }
    
}
