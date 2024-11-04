import br.com.aplicacaomusica.tiposdeaudio.Audio;
import br.com.aplicacaomusica.tiposdeaudio.Musicas;
import br.com.aplicacaomusica.tiposdeaudio.Podcasts;

public class Main {
    public static void main(String[] args) {
        Musicas minhaMusica = new Musicas("Forever", "Kiss");
        executarAcoes(minhaMusica, 1000, 50);

        Podcasts meuPodcast = new Podcasts("Podpah", "Igor e Mítico");
        executarAcoes(meuPodcast, 5000, 1000);

        System.out.println("Música:");
        System.out.println("Título: " + minhaMusica.getTitulo());
        System.out.println("Cantor: " + minhaMusica.getCantor());
        System.out.println("Reproduções: " + minhaMusica.getTotalReproducoes());
        System.out.println("Curtidas: " + minhaMusica.getTotalCurtidas());
        System.out.println("Classificação: " + minhaMusica.getClassificacao());

        System.out.println("\nPodcast:");
        System.out.println("Título: " + meuPodcast.getTitulo());
        System.out.println("Apresentador: " + meuPodcast.getApresentador());
        System.out.println("Reproduções: " + meuPodcast.getTotalReproducoes());
        System.out.println("Curtidas: " + meuPodcast.getTotalCurtidas());
        System.out.println("Classificação: " + meuPodcast.getClassificacao());
    }

    private static void executarAcoes(Audio audio, int reproducoes, int curtidas) {
        for (int i = 0; i < reproducoes; i++) {
            audio.reproduz();
        }
        for (int i = 0; i < curtidas; i++) {
            audio.curte();
        }
    }
}
