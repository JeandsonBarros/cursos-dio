package org.example;

import javax.swing.*;
import java.io.*;

public class ExceptionPersonalizada_1 {
    public static void main(String[] args) {
        String nomeArquivo = JOptionPane.showInputDialog("Informe o nome do arquivo");
        imprimirArquivoNoConsole(nomeArquivo);

        System.out.println("\nA pesar da exception, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {

        try {

            BufferedReader bufferedReader = lerArquivo(nomeDoArquivo);
            String line = bufferedReader.readLine();

            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

            do {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                line = bufferedReader.readLine();
            } while (line != null);

            bufferedWriter.flush();
            bufferedReader.close();

        } catch (ImpossívelAberturaDeArquivoException e) {
            JOptionPane.showMessageDialog(null,  e.getMessage());
            e.printStackTrace();

        } catch (IOException e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ouve um erro inesperado. " + e.getCause());

        } finally {
            System.out.println("\nChegou no finally");
        }

    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossívelAberturaDeArquivoException {
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(file.getName()));
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            throw new ImpossívelAberturaDeArquivoException(file.getName(), file.getPath());
        }
    }
}

class ImpossívelAberturaDeArquivoException extends Exception{

    private String nomeDoArquivo;
    private String diretorioDoArquivo;

    public ImpossívelAberturaDeArquivoException(String nomeDoArquivo, String diretorioDoArquivo) {
        super("O arquivo "+ nomeDoArquivo +" não foi encontrado no diretório " + diretorioDoArquivo);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorioDoArquivo = diretorioDoArquivo;
    }

    @Override
    public String toString() {
        return "ImpossívelAberturaDeArquivoException{" +
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorioDoArquivo='" + diretorioDoArquivo + '\'' +
                '}';
    }
}