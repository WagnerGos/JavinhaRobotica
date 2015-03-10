package turno;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 10 - Estrutura de Decisão
 */
public class Turno {

    public static void main(String[] args) {
        String turno;
        
        turno = JOptionPane.showInputDialog("Digite M,V ou N para Matutino, Vespertino ou Noturno"); //Criando uma caixa de texto
        
        switch(turno){
            case "V":
                JOptionPane.showMessageDialog(null, "Boa Tarde!");
                break;
            case "v":
                JOptionPane.showMessageDialog(null, "Boa Tarde!");
                break;
            case "M":
                JOptionPane.showMessageDialog(null, "Bom Dia!");
                break;
            case "m":
                JOptionPane.showMessageDialog(null, "Bom dia!");
                break;
            case "N":
                JOptionPane.showMessageDialog(null, "Boa Noite!");
                break;
            case "n":
                JOptionPane.showMessageDialog(null, "Boa Noite!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Valor Invalido"); //Definindo valor invalido para qualquer outros valores alem de V,v,M,m,N,n
        }
        
        Scanner genero = new Scanner(System.in); //Criando um objeto de leitura de dados(Teclado)
        
        System.out.println("Digite M,V ou N para Matutino, Vespertino ou Noturno");
        turno = genero.next(); //Leitura do turno
        
        switch(turno){
            case "V":
                System.out.println("Boa Tarde!");
                break;
            case "v":
                System.out.println("Boa Tarde!");
                break;
            case "M":
                System.out.println("Bom Dia!");
                break;
            case "m":
                System.out.println("Bom dia!");
                break;
            case "N":
                System.out.println("Boa Noite!");
                break;
            case "n":
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Valor Invalido"); //Definindo valor invalido para qualquer outros valores alem de V,v,M,m,N,n
        }
    }
    
}
