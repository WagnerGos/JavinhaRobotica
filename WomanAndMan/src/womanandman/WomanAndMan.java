package womanandman;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 13
 */
public class WomanAndMan {

    public static void main(String[] args) {
        
        double decisao, altura, peso;
        
        decisao = Double.parseDouble(JOptionPane.showInputDialog("Se o seu sexo for homem digite 1 e se for mulher digite 2"));
        
        if(decisao == 1){
            altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura (Use o ponto em vez de virgula)"));
            
            peso = 72.7 * altura - 58;
            
            JOptionPane.showMessageDialog(null, "Seu peso ideal é:"+peso);
        }else{
            altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
            
            peso = 62.1 * altura - 44.7;
            
            JOptionPane.showMessageDialog(null, "Seu peso ideal é:"+peso);
        }
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Se o seu sexo for homem digite 1 e se for mulher digite 2");
        decisao = in.nextDouble();
        
        if(decisao == 1){
            System.out.println("Informe sua altura");
            altura = in.nextDouble();
            
            peso = 72.7 * altura - 58;
            
            System.out.println("Seu peso ideal é:"+peso);
        }else{
            System.out.println("Informe sua altura");
            altura = in.nextDouble();
            
            peso = 62.1 * altura - 44.7;
            
            System.out.println("Seu peso ideal é:"+peso);
        }
    }
    
}
