import javax.swing.*;

public class test {
    public static void main(String args[]) {

        String Nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, joven");
        String edad = JOptionPane.showInputDialog("Introduce tu edad");
        int edad_usuario = Integer.parseInt(edad);
        System.out.println("Hola " + Nombre_usuario + ". el año que viene tendras " + (edad_usuario + 1) + " años");
    }
}
