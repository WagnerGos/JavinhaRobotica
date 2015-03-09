package notas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 5 - Estrutura de Decisão
 */
public class Notas {

    public static void main(String[] args) {
        double nota1, nota2, media;
        
        //Armazenando as duas notas do aluno
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua primeira nota"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua segunda nota"));
        
        media = (nota1 + nota2) / 2; //Tirando a media do aluno
        
        //Conferindo se o aluno foi aprovado, aprovado com distinção ou reprovado
        if(media >= 7 && media < 10){
            JOptionPane.showMessageDialog(null, "Parabéns você foi Aprovado");
        }else if(media == 10){
            JOptionPane.showMessageDialog(null, "Parabéns você foi Aprovado com Distinção");
        }else{
            JOptionPane.showMessageDialog(null, "Você foi Reprovado");
        }
        
        Scanner notas = new Scanner(System.in);
        
        //Armazenando as duas notas do aluno
        System.out.println("Digite sua primeira nota");
        nota1 = notas.nextDouble();
        System.out.println("Digite sua segunda nota");
        nota2 = notas.nextDouble();
        
        media = (nota1 + nota2) / 2; //Tirando a media do aluno
       
        //Conferindo se o aluno foi aprovado, aprovado com distinção ou reprovado
        if(media >= 7 && media < 10){
            System.out.println("Parabéns você foi Aprovado");
        }else if(media == 10){
            System.out.println("Parabéns você foi Aprovado com Distinção");
        }else{
            System.out.println("Você foi Reprovado");
        }
    }
    
}
