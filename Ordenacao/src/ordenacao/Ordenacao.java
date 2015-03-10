package ordenacao;

import java.util.Scanner;

/**
 *
 * @author Wagner
 * Exercício 9 - Estrutura de Decisão
 */
public class Ordenacao {

    public static void main(String[] args) {
        double[] numeros = new double[3]; //Criando um array com 3 valores
        
        Scanner num = new Scanner(System.in); //Criando objeto de leitura de dados de teclado
        
        //Adicionando valores ao array
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite um numero");
            numeros[i] = num.nextDouble();
        }
        
        //Fazendo a ordenação dos valores em decrescente
        for(int j = 0; j < numeros.length; j++){
            double auxiliar = numeros[j]; //Criando uma variavel auxilar para a troca de valores
            if(numeros[j+1] < auxiliar){
                numeros[j] = numeros[j+1];
                numeros[j+1] = auxiliar;
            }
        }
        System.out.println(numeros);
    }
    
}
