package salario;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 8
 */
public class Salario {

    public static void main(String[] args) {
        
        double salario, horas, total;
        
        salario = Double.parseDouble(JOptionPane.showInputDialog("Informe quanto você ganha por hora"));
        horas = Double.parseDouble(JOptionPane.showInputDialog("Informe quantas horas você trabalha no mês"));
        
        total = salario * horas;
        
        JOptionPane.showMessageDialog(null, "Seu salario total é referente a: R$ "+total);
        
        Scanner valor = new Scanner(System.in);
        
        System.out.println("Informe quanto você ganha por hora");
        salario = valor.nextDouble();
        System.out.println("Informe quantas horas você trabalha no mês");
        horas = valor.nextDouble();
        
        total = salario * horas;
        
        System.out.println("Seu salario total é referente a: R$ "+total);
    }
    
}
