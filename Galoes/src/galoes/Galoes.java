package galoes;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Wagner
 * Exercício 17
 */
public class Galoes {

    public static void main(String[] args) {
        
        double area, latas, galoes, totalGaloes, totalLatas, misturaGaloes, misturaLatas, totalMistura;
        
        area = Double.parseDouble(JOptionPane.showInputDialog("Informe em metros quadrados o tamanho da area a ser pintada"));
        
        latas = area / 108;
        galoes = area / 21.6;
        totalLatas = latas *80;
        totalGaloes = galoes * 25;
        misturaGaloes = latas % 108;
        misturaLatas = misturaGaloes * 21.6 - latas;
        totalMistura = misturaGaloes * 25 + misturaLatas * 80;
        
        JOptionPane.showMessageDialog(null, "você precisara de "+latas+" latas de tinta que custara:R$ "+totalLatas+'\n'+"ou você pode comprar"+galoes+" galoes de tinta que custara:R$ "+totalGaloes+
                '\n'+"ou você poderia comprar "+misturaGaloes+" Galoes e "+misturaLatas+" que custara:R$ "+totalMistura);
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe em metros quadrados o tamanho da area a ser pintada");
        area = in.nextDouble();
        
        latas = area / 108;
        galoes = area / 21.6;
        totalLatas = latas * 80;
        totalGaloes = galoes * 25;
        misturaGaloes = area % 108;
        misturaLatas = misturaGaloes * 21.6 - latas;
        totalMistura = misturaGaloes * 25 + misturaLatas * 80;
        
        System.out.println("você precisara de "+latas+" latas de tinta que custara:R$ "+totalLatas+'\n'+"ou você pode comprar"+galoes+" galoes de tinta que custara:R$ "+totalGaloes+
                '\n'+"ou você poderia comprar "+misturaGaloes+" Galoes e "+misturaLatas+" que custara:R$ "+totalMistura);
    }
    
}
