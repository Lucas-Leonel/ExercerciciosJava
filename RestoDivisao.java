package ProjetoJava;

import javax.swing.*;

public class RestoDivisao {

    public static void main(String[] args) {
        String aux = "";
        double num1, num2, resto;

        aux = JOptionPane.showInputDialog(null, "Número 1");
        num1 = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog(null, "Número 2");
        num2 = Double.parseDouble(aux);

        resto = (num1 % num2);
        JOptionPane.showMessageDialog(null,"Resto da divisão: " + resto);

    }
}
