import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declarar vars
        String nombre, apellido, apellido_dos;
        float altura;
        int edad, an_Actual = 2024;
        Scanner leer = new Scanner(System.in); // instanciar la clase Scanner

        String saludo = "Hola Mundo!!";
        System.out.println(saludo);

        System.out.println("Introduzca nombre:");
        nombre = leer.nextLine();
        System.out.println("Introduzca apellido:");
        apellido = leer.nextLine();
        System.out.println("Introduzca segundo apellido:");
        apellido_dos = leer.nextLine();

        System.out.println("Introduzca su altura:");
        altura = leer.nextFloat();

        System.out.println("Introduzca su edad:");
        edad = leer.nextInt();

        System.out.println("Bienvenido: " + nombre + ' ' + apellido + ' ' + apellido_dos);
        System.out.println("de altura: " + altura);
        System.out.println("y nacido en: " +(an_Actual-edad));

        // sout //System.out.println();

        /*
        int [] arr = {45, 32,26, 14};

        do {
            System.out.println(edad);

            edad = edad-1;
            System.out.println(arr[edad]);
            arr[edad] = edad - 1;
        } while (edad > 0);
        //System.out.println(arr);
        System.out.println(Arrays.toString(arr));

         */


    }

}

// java src/Main.java