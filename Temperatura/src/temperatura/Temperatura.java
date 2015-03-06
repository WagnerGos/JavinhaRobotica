package temperatura;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 9 e 10
 */
public class Temperatura {

    public static void main(String[] args) {
       
        double farenheit, celsius, decisao;
        
        decisao = Double.parseDouble(JOptionPane.showInputDialog("Digite 1 para converter de Farenheit para Celsius e 2 de Celsius para Farenheit"));
        
        if(decisao == 1){
            farenheit = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em Farenheit"));

            celsius = 5 * (farenheit-32) / 9;

            JOptionPane.showMessageDialog(null, "A temperatura "+farenheit+" Farenheit corresponde a "+celsius+" celsius");
        }else if(decisao == 2){
            celsius = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em celsius"));
            
            farenheit = celsius * 1.8 + 32;
            
            JOptionPane.showMessageDialog(null, "A temperatura "+celsius+" Celsius corresponde a "+farenheit+" Farenheit");
        }else{
            JOptionPane.showMessageDialog(null, "Numero Invalido");
        }
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite 1 para converter de Farenheit para Celsius e 2 de Celsius para Farenheit");
        decisao = in.nextDouble();
        
        if(decisao == 1){
            System.out.println("Informe a temperatura em Farenheit");
            farenheit = in.nextDouble();

            celsius = 5 * (farenheit-32) / 9;

            System.out.println("A temperatura "+farenheit+" Farenheit corresponde a "+celsius+" celsius");
        }else if(decisao == 2){
            System.out.println("Informe a temperatura em celsius");
            celsius = in.nextDouble();
            
            farenheit = celsius * 1.8 + 32;
            
            System.out.println("A temperatura "+celsius+" Celsius corresponde a "+farenheit+" Farenheit");
        }else{
            System.out.println("Numero Invalido");
        }
       
    }
    
}
