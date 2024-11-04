package br.com.aplicacaomusica.tiposdeaudio;

public abstract class Audio {
    private String titulo;
    private int totalReproducoes = 0;
    private int totalCurtidas = 0;

    public Audio(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void curte() {
        totalCurtidas++;
    }

    public void reproduz() {
        totalReproducoes++;
    }

    public abstract double getClassificacao();
}
