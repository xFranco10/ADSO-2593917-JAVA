import java.util.Scanner;

public class Ejercicio1{
    public static void main (String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.println(" => Ingrese aqui la cantidad de numeros ");
        int n = entrada.nextInt();

        int [] arreglo_1 = new int [n];

        // LLenar arreglo con numeros Pares
        for ( int i=0;i<arreglo_1.length; i++){
            arreglo_1[i]= (i+1)*2-1;
        }

        //Imprimir el arreglo
        for ( int i=0;i<arreglo_1.length; i++){
            System.out.println("Este seria Numero Impar"+"["+arreglo_1[i]+"]");
        }



    }
}