package download;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 18
 */
public class Download {

    public static void main(String[] args) {
        
        double tamanho, velocidade, tempo;
        
        tamanho = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho do arquivo em MB"));
        velocidade = Double.parseDouble(JOptionPane.showInputDialog("Informe a velocidade da sua internet em Mbps"));
        
        tempo = (tamanho / velocidade) / 60;
        
        JOptionPane.showMessageDialog(null, "O tempo de download vai ser "+tempo+" minutos");
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe o tamanho do arquivo em MB");
        tamanho = in.nextDouble();
        System.out.println("Informe a velocidade da sua internet em Mbps");
        velocidade = in.nextDouble();
        
        tempo = (tamanho / velocidade) / 60;
        
        System.out.println("O tempo de download vai ser "+tempo+" minutos");
    }
    
}
