package triangulo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 15 - Estrutura de Decisão
 */
public class Triangulo {

    public static void main(String[] args) {
        double lado1, lado2, lado3;
        
        lado1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor")); //Criando uma caixa de texto e armazenando o valor na variavel
        lado2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor"));
        lado3 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor"));
        
        //Informando qual triangulo se forma de acordo com os valores
        if(lado1 + lado2 > lado3){
            JOptionPane.showMessageDialog(null, "Triângulo");
        }else if(lado1 == lado2 && lado1 == lado3){
            JOptionPane.showMessageDialog(null, "Triângulo Equilátero");
        }else if(lado1 == lado2 && lado2 != lado3 || lado1 == lado3 && lado1 != lado2 || lado2 == lado3 && lado3 != lado1){
            JOptionPane.showMessageDialog(null, "Triângulo Isósceles");
        }else{
            JOptionPane.showMessageDialog(null, "Triângulo Escaleno");
        }
        
        Scanner triangulo = new Scanner(System.in); //Criando um objeto de leitura de dados do teclado
        
        System.out.println("Digite um valor");
        lado1 = triangulo.nextDouble(); //Chamado o objeto de leitura e armazenando o valor na variavel
        System.out.println("Digite outro valor");
        lado2 = triangulo.nextDouble();
        System.out.println("Digite outro valor");
        lado3 = triangulo.nextDouble();
        
        //Informando qual triangulo se forma de acordo com os valores
        if(lado1 + lado2 > lado3){
            System.out.println("Triângulo");
        }else if(lado1 == lado2 && lado1 == lado3){
            System.out.println("Triângulo Equilátero");
        }else if(lado1 == lado2 && lado2 != lado3 || lado1 == lado3 && lado1 != lado2 || lado2 == lado3 && lado3 != lado1){
            System.out.println("Triângulo Isósceles");
        }else{
            System.out.println("Triângulo Escaleno");
        }
    }
    
}
