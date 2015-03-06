package media;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 4
 */
public class Media {

    public static void main(String[] args) {
        
       double nota1, nota2, nota3, nota4, media;
       
       nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua primeira nota"));
       nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua segunda nota"));
       nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua terceira nota"));
       nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua quarta nota"));
       
       media = (nota1 + nota2 + nota3 + nota4) / 4;
       
       if(media >= 7){
            JOptionPane.showMessageDialog(null, "Parabéns você foi Aprovado. Sua media é:\"+media");
       }else{
            JOptionPane.showMessageDialog(null, "Você Foi Reprovado. Sua media é: "+media);
       }
        
       Scanner nota = new Scanner(System.in);
      
       System.out.println("Digite sua primeira nota");
       nota1 = nota.nextDouble();
       System.out.println("Digite sua segunda nota");
       nota2 = nota.nextDouble();        
       System.out.println("Digite sua terceira nota");
       nota3 = nota.nextDouble();
       System.out.println("Digite sua quarta nota");
       nota4 = nota.nextDouble();
       
       media = (nota1 + nota2 + nota3 + nota4) / 4;
       
       if(media >= 7){
           System.out.println("Parabéns você foi Aprovado. Sua media é:"+media);
       }else{
            System.out.println("Você Foi Reprovado. Sua media é:"+media);
       }
    }
    
}
