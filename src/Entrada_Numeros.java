import javax.swing.JOptionPane;

public class Entrada_Numeros {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Introduce un numero");
        double num2 = Double.parseDouble(num1);
        System.out.print("la raiz de " + num2 + " es ");
        System.out.printf("%1.4f", Math.sqrt(num2));

    }
}
