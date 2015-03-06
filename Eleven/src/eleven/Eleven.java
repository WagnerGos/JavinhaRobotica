package eleven;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 11
 */
public class Eleven {

    public static void main(String[] args) {
       
        int num1, num2;
        double real, produto, soma, cubo;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do numero 1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do numero 2"));
        real = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero Real"));
        
        produto = (num1 * 2) * (num2 / 2);
        soma = num1 * 3 + real;
        cubo = Math.pow(real, 3);
        
        JOptionPane.showMessageDialog(null, "O produto do dobro do primeiro com metade do segundo é igual a:"+produto+
                '\n'+"a soma do triplo do primeiro com o terceiro é igual a:"+soma+
                '\n'+"o terceiro elevado ao cubo é igual a:"+cubo);
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o valor do numero 1");
        num1 = in.nextInt();
        System.out.println("Digite o valor do numero 2");
        num2 = in.nextInt();
        System.out.println("Digite um numero Real");
        real = in.nextDouble();
        
        produto = (num1 * 2) * (num2 / 2);
        soma = num1 * 3 + real;
        cubo = Math.pow(real, 3);
        
        System.out.println("O produto do dobro do primeiro com metade do segundo é igual a:"+produto+
                '\n'+"a soma do triplo do primeiro com o terceiro é igual a:"+soma+
                '\n'+"o terceiro elevado ao cubo é igual a:"+cubo);
        
    }
    
}
