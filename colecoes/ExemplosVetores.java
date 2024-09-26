
import java.util.Random;


public class ExemplosVetores {
    public static void main(String[] args) {
        int notas [] = new int[4];
        var gerador = new Random();

        //preencher vetor
        //notas[0] = 10;
        //notas = new int[] {10, 7, 7, 9};
        for(int i = 0; i < notas.length; i++){
            notas[i] = gerador.nextInt(11);
        }

        //exibir valor
        // for(int i = 0; i < notas.length; i++){
        //     System.out.println(notas[i]);
        // }

        // int i = 0;
        // while(i < notas.length){
        //     System.out.println(notas[i]);
        //     i++;
        // }

        for(int nota : notas){
            System.out.println(nota);
        }

        int soma = 0;
        //soma dos valores
        for(var nota : notas){
             soma += nota;
        }

        System.out.println(notas.length == 0? "Sem notas" : soma / notas.length);


        //Calcular media
    }
}

