public class TesteGenerics {
    public static void main(String[] args) {
        VetorDinamico <Integer> inteiros = new VetorDinamico<Integer>(8);
        inteiros.adicionar(1);
        //inteiros.adicionar("string qualquer");
        VetorDinamico <String> strings = new VetorDinamico<String>(8);
        strings.adicionar("string qualquer");
        //strings.adicionar(1);
        var reais = new VetorDinamico<Double>(4); //java 10+
        reais.adicionar(2.0);
        //reais.adicionar(new Musica("One"));
        VetorDinamico <Musica> musicas = new VetorDinamico<Musica>(4);
        //var teste = new VetorDinamico<>(8);
    }
    
}
