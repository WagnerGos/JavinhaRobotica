package conversor;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 5
 */
public class Conversor {

    public static void main(String[] args) {
        
        double metros, conversor;
        
        metros = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de metros"));
        
        conversor = metros * 100;
        
        if(metros == 1){
            JOptionPane.showMessageDialog(null, metros+" metro equivale a: "+conversor+" centimetros");
        }else{
            JOptionPane.showMessageDialog(null, metros+" metros equivale a: "+conversor+" centimetros");
        }
        
        Scanner metro = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de metros");
        metros = metro.nextDouble();
        
        conversor = metros * 100;
        
        if(metros == 1){
            System.out.println(metros+" metro equivale a: "+conversor+" centimetros");
        }else{
            System.out.println(metros+" metros equivale a: "+conversor+" centimetros");
        }
    }
    
}
