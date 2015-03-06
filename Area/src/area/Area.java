package area;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 6 e 7
 */
public class Area {

    public static void main(String[] args) {
        
        double area, raio, decisao, lado;
       
        decisao = Double.parseDouble(JOptionPane.showInputDialog("1 para calcular a area do quadrado e 2 para a area do circulo"));
        
        if(decisao == 1){
            
            lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado do quadrado"));
            
            area = Math.pow(lado, lado);
            
            JOptionPane.showMessageDialog(null ,"A area do seu quadrado é:"+area+"m²");
        }else if(decisao == 2){
        
            raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do circulo"));

            area = Math.pow(raio, raio) * 3.1416;

            JOptionPane.showMessageDialog(null, "A area do seu circulo é:"+area);
        }else{
            
            JOptionPane.showMessageDialog(null, "O numero que você digitou não corresponde a circulo ou quadrado.");
        }
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("1 para calcular a area do quadrado e 2 para a area do circulo");
        decisao = in.nextDouble();
        
        if(decisao == 1){
            
            System.out.println("Digite o lado do quadrado");
            lado = in.nextDouble();
            
            area = Math.pow(lado, lado);
            
            System.out.println("A area do seu quadrado é:"+area+"m²");
        }else if(decisao == 2){
        
            System.out.println("Digite o raio do circulo");
            raio = in.nextDouble();

            area = Math.pow(raio, raio) * 3.1416;

            System.out.println("A area do seu circulo é:"+area);
        }else{
            
            System.out.println("O numero que você digitou não corresponde a circulo ou quadrado.");
        }
        
    }
    
}
