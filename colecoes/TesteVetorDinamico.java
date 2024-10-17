import java.util.Random;

public class TesteVetorDinamico{
    public static void main(String[] args) throws Exception {
        var teste = new VetorDinamico(4);
        var gerador = new Random();

        while (true) { 
            var valor = gerador.nextInt(10) + 1;
            var oQueFazer = gerador.nextDouble();
            if(oQueFazer <= 0.5){
                System.out.println("Removendo...");
                teste.remover();
            } else {
                System.out.println("Adicionando...");
                teste.adicionar(valor);
            }

            //Inserir
            //teste.adicionar(valor);
            System.out.println(teste);
            System.out.println("=============================================");
            Thread.sleep(5000);
        }
    }
}