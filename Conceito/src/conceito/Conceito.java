package conceito;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 14 - Estrutura de Decisão
 */
public class Conceito {

    public static void main(String[] args) {
        double nota1, nota2, media;
        
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua primeira nota")); //Criando uma caixa de texto e armazenando o valor na variavel
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua segunda nota"));
        
        media = (nota1 + nota2) / 2; //Tirando a media do aluno
        
        //Atribuindo o conceito do aluno de acordo com sua nota
        if(media >= 9 && media == 10){
            JOptionPane.showMessageDialog(null, "Suas notas é: " + " Primeira Nota " + nota1 + " Segunda Nota " + nota2 + "Sua media é igual a: " + media + "Seu conceito é A, Parabéns você foi APROVADO");
        }else if(media >= 7.5 && media < 9){
            JOptionPane.showMessageDialog(null, "Suas notas é: " + " Primeira Nota " + nota1 + " Segunda Nota " + nota2 + "Sua media é igual a: " + media + "Seu conceito é B, Parabéns você foi APROVADO");
        }else if(media >= 6 && media < 7.5){
            JOptionPane.showMessageDialog(null, "Suas notas é: " + " Primeira Nota " + nota1 + " Segunda Nota " + nota2 + "Sua media é igual a: " + media + "Seu conceito é C, Parabéns você foi APROVADO");
        }else if(media >= 4 && media < 6){
            JOptionPane.showMessageDialog(null, "Suas notas é: " + " Primeira Nota " + nota1 + " Segunda Nota " + nota2 + "Sua media é igual a: " + media + "Seu conceito é D, Você foi REPROVADO");
        }else{
            JOptionPane.showMessageDialog(null, "Suas notas é: " + " Primeira Nota " + nota1 + " Segunda Nota " + nota2 + "Sua media é igual a: " + media + "Seu conceito é E, Você foi REPROVADO");
        }
        
        Scanner conceito = new Scanner(System.in); //Criando um objeto de leitura de dados do teclado
        
        System.out.println("Digite sua primeira nota");
        nota1 = conceito.nextDouble(); //Chamando o objeto de leitura e armazenando o valor na variavel
        System.out.println("Digite sua segunda nota");
        nota2 = conceito.nextDouble();
        
        media = (nota1 + nota2) / 2; //Tirando a media do aluno
        
        //Atribuindo o conceito do aluno de acordo com sua nota
        if(media >= 9 || media == 10){
            System.out.println("Suas notas é: " + " Primeira Nota " + nota1 + " Segunda Nota " + nota2 + "Sua media é igual a: " + media + "Seu conceito é A, Parabéns você foi APROVADO");
        }else if(media >= 7.5 && media < 9){
            System.out.println("Suas notas é: " + " Primeira Nota " + nota1 + " Segunda Nota " + nota2 + "Sua media é igual a: " + media + "Seu conceito é B, Parabéns você foi APROVADO");
        }else if(media >= 6 && media < 7.5){
            System.out.println("Suas notas é: " + " Primeira Nota " + nota1 + " Segunda Nota " + nota2 + "Sua media é igual a: " + media + "Seu conceito é C, Parabéns você foi APROVADO");
        }else if(media >= 4 && media < 6){
            System.out.println("Suas notas é: " + " Primeira Nota " + nota1 + " Segunda Nota " + nota2 + "Sua media é igual a: " + media + "Seu conceito é D, Você foi REPROVADO");
        }else{
            System.out.println("Suas notas é: " + " Primeira Nota " + nota1 + " Segunda Nota " + nota2 + "Sua media é igual a: " + media + "Seu conceito é E, Você foi REPROVADO");
        }
    }
    
}
