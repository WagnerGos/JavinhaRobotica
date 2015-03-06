package pesca;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 14
 */
public class Pesca {

    public static void main(String[] args) {
        
        double peso, excesso = 0, multa = 0;
        
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso de peixes"));
        
        if(peso > 50){
            excesso = peso - 50;
            multa = excesso * 4;
            
            JOptionPane.showMessageDialog(null ,"O excesso de peso é igual a:"+excesso+" KG a multa a ser paga é: R$ "+multa);
        }else{
            
            JOptionPane.showMessageDialog(null, "O excesso de peso é igual a:"+excesso+" KG a multa a ser paga é: R$ "+multa);
        }
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o peso de peixes");
        peso = in.nextDouble();
        
        if(peso > 50){
            excesso = peso - 50;
            multa = excesso * 4;
            
            System.out.println("O excesso de peso é igual a:"+excesso+" KG a multa a ser paga é: R$ "+multa);
        }else{
            
            System.out.println("O excesso de peso é igual a:"+excesso+" KG a multa a ser paga é: R$ "+multa);
        }
    }
    
}
