package ProjetoJava;

import javax.swing.*;

public class ExercicioSalario {

    public static void main(String[] args) {
        String aux = "";
        double salario = 0, aliquota = 0, valorDesconto = 0, valorLiquido = 0;
        try {
            aux = JOptionPane.showInputDialog(null, "Insira o Salário: ", "Salário",3);
            aux = aux.replace(',', '.');
            salario = Double.parseDouble(aux);

            if (salario <= 965.67) {

                valorDesconto = (salario * 8.0 / 100);
                aliquota = 8.0;
                
            } else if (salario >= 965.68 && salario <= 1609.45) {
                valorDesconto = (salario * 9.0 / 100);
                aliquota = 9.0;
                
            } else if (salario >= 1609.46 && salario <= 3218.90) {
                valorDesconto = (salario * 11.0 / 100);
                aliquota = 11.0;
            }
            valorLiquido = (salario - valorDesconto);
            if (salario <= 465.00 || salario >= 3218.91) {
                JOptionPane.showMessageDialog(null, "Salario Inválido \n Minimo é: R$465.00 \n Maximo é: R$3218,90", "Salario Inválido", 0);

            } else {
                JOptionPane.showMessageDialog(null, "Salário R$ " + salario + "\n aliquota INSS: " + aliquota + "\n Valor Desconto R$ " + valorDesconto + "\n Valor Liquido R$  " + valorLiquido, "Saída", -1);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite Apenas Valores Numericos ", "Erro", 0);
            System.exit(0);
        }
    }
}
