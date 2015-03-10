package semana;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 13 - Estrutura de Decisão
 */
public class Semana {

    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero")); //Criando uma caixa de texto e armazenando a variavel
        
        //Exibindo o dia da semana correspondente ao dia da semana
        switch(numero){
            case 1:
                JOptionPane.showMessageDialog(null, "Domingo");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Segunda");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Terça");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Quarta");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Quinta");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Sexta");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Sabado");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Valor inválido"); //Declarando valor inválido para qualquer outro valor que não seja 1,2,3,4,5,6,7
        }
        
        Scanner semana = new Scanner(System.in); //Criando um objeto de leitura de dados do teclado
        
        System.out.println("Digite um numero");
        numero = semana.nextInt(); //Chamando o objeto de leitura e armazenando o valor na variavel
        
        //Exibindo o dia da semana correspondente ao dia da semana
        switch(numero){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Valor inválido"); //Declarando valor inválido para qualquer outro valor que não seja 1,2,3,4,5,6,7
        }
    }
    
}
