package org.example;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {

    private String nome;
   private int anoDeCriacao;
   private String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao='" + anoDeCriacao + '\'' +
                ", ide='" + ide + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(int anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public int compareTo(LinguagemFavorita linguagem) {

        int nome = this.getNome().compareToIgnoreCase(linguagem.getNome());
        if(nome != 0) return nome;

        int anoDeCriacao = Integer.compare(this.getAnoDeCriacao(), linguagem.getAnoDeCriacao());
        if(anoDeCriacao != 0) return anoDeCriacao;

        return this.getIde().compareToIgnoreCase(linguagem.getIde());
    }
}
