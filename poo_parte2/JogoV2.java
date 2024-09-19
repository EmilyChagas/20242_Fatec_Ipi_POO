import java.util.Random;

public class JogoV2 {
    public static void main(String[] args) throws Exception{
        System.out.println("Comecando..");

        var cacador = new Personagem();
        cacador.nome = "HeroBrine";

        var soneca = new Personagem(2, 4, 10);
        soneca.nome = "UrsinhoPooh";
        
        var fominha = new Personagem(6, 10, 2);
        fominha.nome = "Scooby";
        
        var gerador = new Random();

        while (true) {
            var AcaoDoCacador = gerador.nextInt(3) + 1;
            switch(AcaoDoCacador){
                case 1 -> cacador.cacar();
                case 2 -> cacador.comer();
                case 3 -> cacador.dormir();
            }
            System.out.println(cacador);
            System.out.println("-------------------------------------");

            var AcaoDoSoneca = gerador.nextInt(3) + 1;
            
            if(AcaoDoSoneca == 1){
                soneca.comer();
            } 
            else if(AcaoDoSoneca == 2){
                soneca.dormir();
            } 
            else {
                soneca.cacar();
            }
            System.out.println(soneca);
            System.out.println("-------------------------------------");

            switch(gerador.nextInt(3) + 1) {
                case 1 -> fominha.cacar();
                case 2 -> fominha.comer();
                default -> fominha.dormir();
            }
            System.out.println(fominha);
            System.out.println("================================");
            Thread.sleep(5000);
        }
    }
   
}