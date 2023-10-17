import java.util.Scanner;

//import java.util.*;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Indie World! iam the constructor matrix");

        String nombre, apellido;

        // Scanner nombres;

        nombre = "david";
        apellido = "david";

        System.out.println(nombre.equalsIgnoreCase(apellido));

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Introduce tu name, por favor");
            String nombre_usuario = entrada.nextLine();
            System.out.println("Introduce tu edad, por favor");
            int edad = entrada.nextInt();
            System.out.println("hola" + nombre_usuario + "tu edad " + (edad + 1) + "anos");
        }

    }
}
