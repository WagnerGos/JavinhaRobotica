package maiormenor;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 6 e 7 - Estrutura de Decisão
 */
public class MaiorMenor {

    public static void main(String[] args) {
        double maior, menor;
        
        maior = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero")); //Armazenando o numero na variavel
        menor = maior;
        
        for(int i = 0; i < 2; i++){
            double intermediario = Double.parseDouble(JOptionPane.showInputDialog("Digite outro Numero")); //Criando uma variavel local para os outros numeros
            if(maior < intermediario){ //Verificando se o MAIOR é menor do que o INTERMEDIARIO
                maior = intermediario;
            }
            if(menor > intermediario){ //Verificando se o MENOR é maior do que o INTERMEDIARIO
                menor = intermediario;
            }
        } 
        JOptionPane.showMessageDialog(null, "O maior numero é: " + maior + " e o menor é: " + menor );
                
        Scanner numero = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        maior = numero.nextDouble(); //Armazenando o numero na variavel
        menor = maior;
        
        for(int i = 0; i < 2; i++){
            System.out.println("Digite outro numero");
            double intermediario = numero.nextDouble(); //Criando uma variavel local para os outros numeros
            if(maior < intermediario){ //Verificando se o MAIOR é menor do que o INTERMEDIARIO
                maior = intermediario;
            }
            if(menor > intermediario){ //Verificando se o MENOR é maior do que o INTERMEDIARIO
                menor = intermediario;
            }
        }
    System.out.println("O maior numero é: " + maior + " e o menor é: " + menor);
    }
    
}


