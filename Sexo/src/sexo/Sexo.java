package sexo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 03 - Estrutura de Decisão
 */
public class Sexo {

    public static void main(String[] args) {
        String sexo;
        
        sexo = JOptionPane.showInputDialog("Digite F ou M para Feminino ou Masculino"); //Criando uma caixa de texto
        
        switch(sexo){
            case "F":
                JOptionPane.showMessageDialog(null, "Feminino");
                break;
            case "f":
                JOptionPane.showMessageDialog(null, "Feminino");
                break;
            case "M":
                JOptionPane.showMessageDialog(null, "Masculino");
                break;
            case "m":
                JOptionPane.showMessageDialog(null, "Masculino");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Sexo Invalido"); //Definindo sexo invalido para qualquer outros valores alem de F,f,M,m
        }
        
        Scanner genero = new Scanner(System.in); //Criando um objeto de leitura de dados(Teclado)
        
        System.out.println("Digite F ou M para Feminino ou Masculino");
        sexo = genero.next(); //Leitura do sexo
        
        switch(sexo){
            case "F":
                System.out.println("Feminino");
                break;
            case "f":
                System.out.println("Feminino");
                break;
            case "M":
                System.out.println("Masculino");
                break;
            case "m":
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Sexo Invalido"); //Definindo sexo invalido para qualquer outros valores alem de F,f,M,m
        }
    }
    
}
