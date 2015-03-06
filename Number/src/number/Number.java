package number;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 2
 */
public class Number {

    public static void main(String[] args) {
        
        double num;
        
        num = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
        JOptionPane.showMessageDialog(null, "O número informado foi: "+num);
        
        System.out.println("Digite um numero");
        Scanner number = new Scanner(System.in);
        num = number.nextDouble();
        System.out.println("O número informado foi: "+num);
    }
    
}
