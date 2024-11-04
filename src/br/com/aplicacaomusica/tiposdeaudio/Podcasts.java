package br.com.aplicacaomusica.tiposdeaudio;

public class Podcasts extends Audio {
    private String apresentador;
    private String descricao;

    public Podcasts(String titulo, String apresentador) {
        super(titulo);
        this.apresentador = apresentador;
    }

    public String getApresentador() {
        return apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public double getClassificacao() {
        return getTotalCurtidas() > 500 ? 10 : 8;
    }
}
