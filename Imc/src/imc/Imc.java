package imc;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 12
 */
public class Imc {

    public static void main(String[] args) {
        
        double peso, altura;
        String h;
        
        Scanner in = new Scanner(System.in);
        
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
        
        
        peso = 72.7 * altura - 58;

        JOptionPane.showMessageDialog(null, "Seu peso ideal é"+peso);
        
        System.out.println("Digite sua altura");
        altura = in.nextDouble();
        
         peso =  72.7 *  altura - 58;
        
        System.out.println("Seu peso ideal é:"+peso);
        
    }
    
}
