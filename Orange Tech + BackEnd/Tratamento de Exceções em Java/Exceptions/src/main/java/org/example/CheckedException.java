package org.example;


/* Resumidamente as exceções Checked são aquelas no qual você é obrigado a tratá-la,
seja com um bloco try-catch ou mesmo com um throws (relançando a mesma para outro local). */

import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        String nomeArquivo = "texto_testep.txt";

        try {
            imprimirArquivoNoConsole(nomeArquivo);

        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Arquivo informado não existe ou o nome está errado! " + e.getCause());

        } catch (IOException e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ouve um erro inesperado. " + e.getCause());

        } finally {
            System.out.println("Chegou no finally");
        }

        System.out.println("A pesar da exception, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getName()));
        String line = bufferedReader.readLine();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            line = bufferedReader.readLine();
        } while (line != null);

        bufferedWriter.flush();
        bufferedReader.close();
    }
}
