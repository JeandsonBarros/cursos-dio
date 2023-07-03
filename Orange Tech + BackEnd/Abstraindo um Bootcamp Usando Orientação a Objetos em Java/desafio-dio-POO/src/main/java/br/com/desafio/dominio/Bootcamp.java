package br.com.desafio.dominio;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicio = LocalDate.now();
    private LocalDate dataFinal = dataInicio.plusDays(45);
    private Set<Dev> devInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Set<Dev> getDevInscritos() {
        return devInscritos;
    }

    public void setDevInscritos(Set<Dev> devInscritos) {
        this.devInscritos = devInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public void setConteudos(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return nome.equals(bootcamp.nome) && descricao.equals(bootcamp.descricao) && dataInicio.equals(bootcamp.dataInicio) && dataFinal.equals(bootcamp.dataFinal) && devInscritos.equals(bootcamp.devInscritos) && conteudos.equals(bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicio, dataFinal, devInscritos, conteudos);
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataFinal=" + dataFinal +
                ", devInscritos=" + devInscritos +
                ", conteudos=" + conteudos +
                '}';
    }
}
