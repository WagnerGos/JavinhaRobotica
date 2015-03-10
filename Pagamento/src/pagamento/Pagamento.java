package pagamento;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 12 - Estrutura de Decisão
 */
public class Pagamento {

    public static void main(String[] args) {
        double valorHora, horas, salarioBruto, impostoRenda, inss, fgts, salarioLiquido;
        
        horas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de sua hora")); //Criando uma caixa de texto e armazenando o valor na variavel
        valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite quantas horas você trabalha no mês"));
        
        salarioBruto = horas * valorHora;
        inss = (salarioBruto * 10) / 100;
        fgts = (salarioBruto * 11) / 100;
        
        if(salarioBruto <= 900){
           impostoRenda = 0; 
        }else if(salarioBruto > 900 && salarioBruto <= 1500){
            impostoRenda = (salarioBruto * 5) / 100;
        }else{
            impostoRenda = (salarioBruto * 10) / 100;
        }
        
        JOptionPane.showMessageDialog(null, "Salário Bruto: R$ " + salarioBruto + " Imposto de Renda: R$ " + impostoRenda + " INSS: R$ " + inss + " FGTS: R$ " + fgts + " Salário Liquido: R$ " + (salarioBruto - impostoRenda - inss));
        
        Scanner valor = new Scanner(System.in); //Criando um objeto de leitura de dados do teclado
        
        System.out.println("Digite o valor de sua hora");
        horas = valor.nextDouble(); //Armazenando o valor na variavel
        System.out.println("Digite quantas horas você trabalha no mês");
        valorHora = valor.nextDouble(); //Armazenando o valor na variavel
        
        salarioBruto = horas * valorHora;
        inss = (salarioBruto * 10) / 100;
        fgts = (salarioBruto * 11) / 100;
        
        if(salarioBruto <= 900){
           impostoRenda = 0; 
        }else if(salarioBruto > 900 && salarioBruto <= 1500){
            impostoRenda = (salarioBruto * 5) / 100;
        }else{
            impostoRenda = (salarioBruto * 10) / 100;
        }
        
        System.out.println("Salário Bruto: R$ " + salarioBruto + " Imposto de Renda: R$ " + impostoRenda + " INSS: R$ " + inss + " FGTS: R$ " + fgts + " Salário Liquido: R$ " + (salarioBruto - impostoRenda - inss));
    }
    
}
