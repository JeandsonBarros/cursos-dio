package br.com.desafio;

import br.com.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //Conteudo curso = new Curso();
        //Conteudo mentoria = new Mentoria();

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(6);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria curso java");
        mentoria1.setDescricao("Descrição mentoria curso java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.setConteudos(curso1);
        bootcamp.setConteudos(curso2);
        bootcamp.setConteudos(mentoria1);

        Dev joao = new Dev();
        joao.setNome("João");
        joao.inscreverBootcamp(bootcamp);
        joao.progredir();
        //System.out.println(joao.getConteudosInscritos());
        listarConteudos(joao.getConteudosInscritos(), "Conteúdos inscritos de " + joao.getNome());
        joao.progredir();
        listarConteudos(joao.getConteudosInscritos(), "Conteúdos inscritos de " + joao.getNome());
        listarConteudos(joao.getConteudosConcluidos(), "Conteúdos concluídos de " + joao.getNome());
        System.out.println("\nXp total: " + joao.calcularXpTotal());

        System.out.println("\n==========================================================");

        Dev jeu = new Dev();
        jeu.setNome("Jeu");
        jeu.inscreverBootcamp(bootcamp);
        jeu.progredir();
        listarConteudos(jeu.getConteudosInscritos(), "Conteúdos inscritos de " + jeu.getNome());
        jeu.progredir();
        jeu.progredir();
        listarConteudos(jeu.getConteudosInscritos(), "Conteúdos inscritos de " + jeu.getNome());
        listarConteudos(jeu.getConteudosConcluidos(), "Conteúdos concluídos de " + jeu.getNome());
        System.out.println("\nXp total: " + jeu.calcularXpTotal());

        System.out.println("\n==========================================================\n");

        System.out.println(bootcamp);

    }

    public static void listarConteudos(Set<Conteudo> conteudos, String nomeDaLista) {
        System.out.println("\n++++ " + nomeDaLista + " ++++");

        if (conteudos.size() == 0) {
            System.out.println("--------------------");
            System.out.println("| Não a conteúdos! |");
            System.out.println("--------------------");
        }

        conteudos.forEach(conteudo -> {
            System.out.println("Título: " + conteudo.getTitulo());
            System.out.println("Descrição: " + conteudo.getDescricao());
            System.out.println("_________________________________");
        });
    }

}