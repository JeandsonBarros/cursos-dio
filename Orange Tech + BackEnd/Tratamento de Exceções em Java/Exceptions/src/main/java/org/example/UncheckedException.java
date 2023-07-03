package org.example;

import javax.swing.*;

/*
Exceções do tipo Unchecked não é obrigatório o tratamento da mesma, você pode tratar apenas se quiser,
se sentir que é necessário para o bom funcionamento da sua aplicação.
 */

public class UncheckedException {
    public static void main(String[] args) {

        boolean continuaDoWhile = true;

        do{

            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                //System.out.println("Resultado: " + resultado);
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                continuaDoWhile = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor informado invalido, informe um valor inteiro! " + e.getMessage());
                //e.printStackTrace();

            } catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Impossuível dividir um número por 0!" + e.getMessage());
                e.printStackTrace();

            }
            finally {
                System.out.println("Chegou no finally");
            }

        }while (continuaDoWhile);

        System.out.println("O código continua...");
    }

    private static int dividir(int a, int b) {
        return a / b;
    }
}
