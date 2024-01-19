public class Musica {

    String nome;
    String artista;
    int ano;
    int numAvaliacoes;
    double somaAvaliacoes;

    void exibeFicha() {
        System.out.println("Nome da música: " + nome);
        System.out.println("Nome do artista: " + artista);
        System.out.println("Ano de lançamento: " + ano);
        System.out.println();

    }

    void avalia (double nota){
        somaAvaliacoes += nota;
        numAvaliacoes++;
    }

    double pegaMedia(){
        return somaAvaliacoes / numAvaliacoes;
    }
}


