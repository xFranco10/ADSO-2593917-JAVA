import java.util.Scanner;

public class Ejercicio1{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese aqui numero N para saber que filas desea saber");
        int n = entrada.nextInt();
        System.out.println("Ingrese aqui un Numero X para saber las columnas que desea saber");
        int x = entrada.nextInt();


        int numeros_filas_columnas[][] = new int [n][x];

        for (int i=0; i<x ; i++){
            for (int j=0 ; j<x ; j++){

                System.out.println(" Ingrese aqui los numeros de la fila "+i+ " de la columna "+j);
                numeros_filas_columnas[i][j] = entrada.nextInt();

            }

        }


        for (int i=0; i<x ; i++){
            for (int j=0 ; j<x ; j++){

               System.out.println("Estos son los datos almacenados de la fila "+i+ "columna "+j+ " : "+numeros_filas_columnas[i][j]);

            }

        }










    }
}