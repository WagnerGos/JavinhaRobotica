package vogalconsoante;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 4 - Estrutura de Decisao
 */
public class VogalConsoante {

    public static void main(String[] args) {
        char letra;
        String entrada;
        
        entrada = JOptionPane.showInputDialog("Digite uma letra"); //Criando uma caixa de texto e armazenando o valor na variavel entrada
        
        letra = entrada.charAt(0); //Convertendo para Char para pegar só uma letra
        
        if((letra == 'A' || letra == 'a') || (letra == 'e' || letra == 'E') || (letra == 'i' || letra == 'I') || (letra == 'o' || letra == 'O') || (letra == 'u' || letra == 'U')){
            JOptionPane.showMessageDialog(null, "Vogal");
        }else{
            JOptionPane.showMessageDialog(null, "Consoante");
        }
        
        Scanner vogal = new Scanner(System.in); //Criando um objeto para leitura de dados do teclado
        
        System.out.println("Digite uma letra");
        letra = vogal.next().charAt(0); //gravando a letra na variavel
        
        if((letra == 'A' || letra == 'a') || (letra == 'e' || letra == 'E') || (letra == 'i' || letra == 'I') || (letra == 'o' || letra == 'O') || (letra == 'u' || letra == 'U')){
            System.out.println("Vogal");
        }else{
            System.out.println("Consoante");
        }
    }
    
}
