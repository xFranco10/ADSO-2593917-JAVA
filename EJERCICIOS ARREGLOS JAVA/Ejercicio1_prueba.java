import java.util.Scanner;

public class Ejercicio1{
    
    public static void main (String [] args){

        Scanner entrada = new Scanner (System.in);

        // Crear arreglo Vacio
        int [] arreglo_1 = new int [5];

        // LLenar arreglo con numeros Pares
        for ( int i=0;i<arreglo_1.length; i++){
            arreglo_1[i]= (i+1)*2;
        }

        //Imprimir el arreglo
        for ( int i=0;i<arreglo_1.length; i++){
            System.out.print("["+arreglo_1[i]+"]");
        }
        
    }
}