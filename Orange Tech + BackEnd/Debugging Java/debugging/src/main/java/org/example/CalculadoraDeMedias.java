package org.example;
import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        //TODO: É preciso por um breakpoint aqui para debugar e descobrir por que o resulto é int e não double
        int media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %d", media);
    }

    public static int calculaMediaDaTurma(String[] alunos, Scanner scanner) {

        int soma = 0;
        for(String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            int nota = scanner.nextInt();
            soma += nota;
        }

        return soma / alunos.length;
    }

}