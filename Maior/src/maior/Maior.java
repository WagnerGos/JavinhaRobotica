package maior;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 1 - Estrutura de Decisao
 */
public class Maior {

    public static void main(String[] args) {
        double maior;
        
        maior = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero")); //Lendo o primeiro numero através de caixa de texto
        
        for(int i = 0; i < 1; i++){
            double intermediario = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero")); //Lendo o segundo numero através de uma variavel local
            if(maior < intermediario){
                maior = intermediario;
            }
        }
        
        JOptionPane.showMessageDialog(null, "O maior numero é: " + maior);
        
        Scanner numero = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        maior = numero.nextInt(); //Lendo o primeiro numero
        
        for(int i = 0; i < 1; i++){
            System.out.println("Digite outro numero");
            double intermediario = numero.nextInt(); // Lendo o segundo numero através de uma variavel local
            if(maior < intermediario){
                maior = intermediario;
            }
        
        }
        System.out.println("O maior numero é: " + maior);
    }    
    
}
