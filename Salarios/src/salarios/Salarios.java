package salarios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 15
 */
public class Salarios {

    public static void main(String[] args) {
        
        double ganhoHora, hora, salarioBruto, impostoRenda, inss, sindicato, salarioLiquido;
        
        ganhoHora = Double.parseDouble(JOptionPane.showInputDialog("Informe quanto você ganha por hora"));
        hora = Double.parseDouble(JOptionPane.showInputDialog("Informe quantas horas você trabalha no mês"));
        
        salarioBruto = ganhoHora * hora;
        impostoRenda = salarioBruto * 11 / 100;
        inss = salarioBruto * 8 / 100;
        sindicato = salarioBruto * 5 / 100;
        salarioLiquido = salarioBruto - (impostoRenda + inss + sindicato);
        
        JOptionPane.showMessageDialog(null, "Salario Bruto:R$ "+salarioBruto+'\n'+"Imposto de Renda:R$ "+impostoRenda+'\n'+"INSS:R$ "+inss+'\n'+"Sindicato:R$ "+sindicato+'\n'
                +"Salario Liquido:R$ "+salarioLiquido);
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe quanto você ganha por hora");
        ganhoHora = in.nextDouble();
        System.out.println("Informe quantas horas você trabalha no mês");
        hora = in.nextDouble();
        
        salarioBruto = ganhoHora * hora;
        impostoRenda = salarioBruto * 11 / 100;
        inss = salarioBruto * 8 / 100;
        sindicato = salarioBruto * 5 / 100;
        salarioLiquido = salarioBruto - (impostoRenda + inss + sindicato);
        
        System.out.println("Salario Bruto:R$ "+salarioBruto+'\n'+"Imposto de Renda:R$ "+impostoRenda+'\n'+"INSS:R$ "+inss+'\n'+"Sindicato:R$ "+sindicato+'\n'+"Salario Liquido:R$ "+salarioLiquido);
        
    }
    
}
