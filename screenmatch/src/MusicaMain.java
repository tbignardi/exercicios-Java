public class MusicaMain {
    public static void main(String[] args) {


        Musica minhaMusica = new Musica();

        minhaMusica.exibeFicha();
        minhaMusica.nome = "Sultans of Swing";
        minhaMusica.artista = "Dire Straits";
        minhaMusica.ano = 1977;

        minhaMusica.exibeFicha();

        minhaMusica.avalia(10);
        minhaMusica.avalia(9.5);
        minhaMusica.avalia(10);
        System.out.println(minhaMusica.somaAvaliacoes);
        System.out.println(minhaMusica.numAvaliacoes);
    }
}
