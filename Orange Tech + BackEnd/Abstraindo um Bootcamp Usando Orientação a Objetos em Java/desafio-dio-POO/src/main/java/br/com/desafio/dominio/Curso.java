package br.com.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + this.cargaHoraria + '\'' +
                ", xp=" + calcularXp() + '\'' +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * this.cargaHoraria;
    }
}
