package tabajara;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 11 - Estrutura de Decisão
 */
public class Tabajara {

    public static void main(String[] args) {
        double salario, aumento;
        
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário")); //Criando uma caixa de texto e armazenando o valor
        
        if(salario <= 280){
            aumento = (salario * 20) / 100;
            JOptionPane.showMessageDialog(null, "O seu salário era de:R$ " + salario + " Foi aumentado 20% que equivale a:R$ " + aumento + "Seu novo salário equivale a:R$ " + (aumento+salario));
        }else if(salario > 280 || salario <= 700){
            aumento = (salario * 15) / 100;
            JOptionPane.showMessageDialog(null, "O seu salário era de:R$ " + salario + " Foi aumentado 15% que equivale a:R$ " + aumento + "Seu novo salário equivale a:R$ " + (aumento+salario));
        }else if(salario > 700 || salario < 1500){
            aumento = (salario * 10) / 100;
            JOptionPane.showMessageDialog(null, "O seu salário era de:R$ " + salario + " Foi aumentado 10% que equivale a:R$ " + aumento + "Seu novo salário equivale a:R$ " + (aumento+salario));
        }else{
            aumento = (salario * 5) / 100;
            JOptionPane.showMessageDialog(null, "O seu salário era de:R$ " + salario + " Foi aumentado 5% que equivale a:R$ " + aumento + "Seu novo salário equivale a:R$ " + (aumento+salario));
        }
        
        Scanner salarios = new Scanner(System.in); //Criando um objeto de leitura de dados de teclado
        
        System.out.println("Digite o seu salário");
        salario = salarios.nextDouble(); //Armazenando o valor da leitura
        
        if(salario <= 280){
            aumento = (salario * 20) / 100;
            System.out.println("O seu salário era de:R$ " + salario + " Foi aumentado 20% que equivale a:R$ " + aumento + "Seu novo salário equivale a:R$ " + (aumento+salario));
        }else if(salario > 280 || salario <= 700){
            aumento = (salario * 15) / 100;
            System.out.println("O seu salário era de:R$ " + salario + " Foi aumentado 15% que equivale a:R$ " + aumento + "Seu novo salário equivale a:R$ " + (aumento+salario));
        }else if(salario > 700 || salario < 1500){
            aumento = (salario * 10) / 100;
            System.out.println("O seu salário era de:R$ " + salario + " Foi aumentado 10% que equivale a:R$ " + aumento + "Seu novo salário equivale a:R$ " + (aumento+salario));
        }else{
            aumento = (salario * 5) / 100;
            System.out.println("O seu salário era de:R$ " + salario + " Foi aumentado 5% que equivale a:R$ " + aumento + "Seu novo salário equivale a:R$ " + (aumento+salario));
        }
    }
    
}
