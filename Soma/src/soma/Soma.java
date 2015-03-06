package soma;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 3
 */
public class Soma {

    public static void main(String[] args) {
        
       double num1, num2, soma;
       
       num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
       num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero"));
       
       soma = num1 + num2;
       
       JOptionPane.showMessageDialog(null, "O resultado é: "+soma);
        
       Scanner number = new Scanner(System.in);
      
       System.out.println("Digite um numero");
       num1 = number.nextDouble();
       System.out.println("Digite outro numero");
       num2 = number.nextDouble();
       
       soma = num1 + num2;
       
       System.out.println("O Resultado é:"+soma);
    }
    
}
