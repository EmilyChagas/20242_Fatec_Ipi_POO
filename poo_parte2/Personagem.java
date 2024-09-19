public class Personagem{
    String nome;
    private int energia;
    private int fome;
    private int sono;

    Personagem(){
        System.out.println("Contruindo novo Perosnagem");
        energia = 10;
        fome = 0;
        sono = 0;
    }

    Personagem(int energia, int fome, int sono) {
        System.out.println("Contruindo novo Perosnagem");
        this.energia = energia < 0 || energia > 10 ? 10 : energia;
        this.fome = fome >= 0 && fome <= 10? fome : 0;
        this.sono = sono >= 0 && sono <= 10? sono : 0;
    }
 
    void cacar(){
        if(energia >=2){
            System.out.printf("%s cacando\n", nome);
            energia -= 2; //energia = energia - 2
        }else{
            System.out.printf("%s sem energia para cacar\n", nome);
            
        }
       if(fome < 10) fome = fome + 1; // fome +=1 fome++ fome++
        sono = sono == 10 ? sono : sono + 1;
    }
   
    //método comer
    void comer(){
        if(fome >= 1){
            System.out.println(nome + " comendo");
            energia = Math.min(energia + 1, 10);
            fome--;
        }else{
            System.out.println(nome + " sem fome");
        }
       
    }
   
    //método dormir
    void dormir(){
        if(sono >= 1){
            System.out.print(nome + " dormindo\n");
            energia = Math.min(energia + 1, 10);
            sono -= 1;
        }else{
            System.out.println(nome + " sem sono");
        }
       
    }

    public String toString(){
        return String.format("%s: e:%d, f:%d, s:%d",nome, energia, fome, sono);
    }
}