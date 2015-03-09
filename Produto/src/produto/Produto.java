package produto;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 8 - Estrutura de Decisão
 */
public class Produto {

    public static void main(String[] args) {
        double preco;
        
        preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de um produto")); //Criando uma caixa de texto e armazendo o valor
        
        for(int i = 0; i < 2; i++){
            double intermediario = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de outro produto")); //Criando uma variavel local para armazenar os outros valores
            
            if(preco > intermediario){ //Verificando qual o menor preço
                preco = intermediario;
            }
        }
        JOptionPane.showMessageDialog(null, "Você deve comprar o produto de preço: " + preco);
        
        Scanner produto = new Scanner(System.in); //Criando um objeto de leitura de dados do teclado
        
        System.out.println("Digite o preço de um produto");
        preco = produto.nextDouble(); //Armazenando o valor na variavel
        
        for(int i = 0; i < 2; i++){
            System.out.println("Digite o preço de outro produto");
            double intermediario = produto.nextDouble(); //Criando uma variavel local para armazenar os outros valores
            
            if(preco > intermediario){ //Verificando qual o menor preço
                preco = intermediario;
            }
        }
        System.out.println("Você deve comprar o produto de preço: " + preco);
    }
    
}
