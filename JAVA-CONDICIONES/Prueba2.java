import java.util.Scanner;

public class Prueba2{
    public static void main(String [] args ){


        //Creacion de variables de entrada.
        Scanner entrada = new Scanner(System.in);

        // Creacion  de variable
        int cant_poblacion_col = 0;
        int cant_poblacion_usa = 350000000;

        //Instruccion de Salida
        System.out.println("La poblacion de COL es: " + cant_poblacion_col);
        System.out.println("La poblacion de USA es: " + cant_poblacion_usa);

        //Lectura de datos
        System.out.print("Ingrese Poblacion de COL:  ");
        cant_poblacion_col = entrada.nextInt();

        System.out.println("La nueva poblacion de COL es: " + cant_poblacion_col);


    }



}