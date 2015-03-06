package tintas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 16
 */
public class Tintas {

    public static void main(String[] args) {
        
        double area, tinta, total;
        
        area = Double.parseDouble(JOptionPane.showInputDialog("Informe em metro quadrados o tamanho da area a ser pintada"));
        
        tinta = area / 54;
        total = tinta * 80;
        
        JOptionPane.showMessageDialog(null, "Você precisara usar "+tinta+" latas de tintas que custara:R$ "+total);
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe em metros quadrados o tamanho da area a ser pintada");
        area = in.nextDouble();
        
        tinta = area / 54;
        total = tinta * 80;
        
        System.out.println("Você precisara usar "+tinta+" latas de tintas que custara:R$ "+total);
    }
    
}
