package positivonegativo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 2  - Estrutura de Decisao
 */
public class PositivoNegativo {

    public static void main(String[] args) {
        double num;
        
        num = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero")); //Lendo o número
        
        if(num < 0){
            JOptionPane.showMessageDialog(null, "O número " + num + " é negativo");
        }else{
            JOptionPane.showMessageDialog(null, "O número " + num + " é positivo");
        } //Declarando se o número é positivo ou negativo
        
        Scanner numero = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        num = numero.nextDouble();
        
        if(num < 0){
            System.out.println("O número " + num + " é negativo");
        }else{
            System.out.println("O número " + num + " é positivo");
        } //Declarando se o número é positivo ou negativo
    }
    
}
