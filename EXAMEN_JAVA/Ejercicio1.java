import java.util.Scanner;

public class Ejercicio1{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println(" Ingrese aqui el limite del vector ");
        int n = entrada.nextInt();

        int [] arreglo = new int [n];

        for (int i=1 ; i<=n ; i++){
            int multi = n*n;
            for (int j=1 ; j<=multi ; j++){
                System.out.print(" "+j);
            }
            System.out.println(" ");
        }
        System.out.println(" ");

    }
}