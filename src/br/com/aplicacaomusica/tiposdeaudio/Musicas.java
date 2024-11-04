package br.com.aplicacaomusica.tiposdeaudio;

public class Musicas extends Audio {
    private String album;
    private String cantor;
    private String genero;

    public Musicas(String titulo, String cantor) {
        super(titulo);
        this.cantor = cantor;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public double getClassificacao() {
        return getTotalReproducoes() > 2000 ? 10 : 7;
    }
}
