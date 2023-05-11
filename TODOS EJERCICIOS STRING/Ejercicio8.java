import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio4{
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        //Pedir al usuario el numero entero
        System.out.println(" => Ingrese aqui el tamaño del arreglo: ");
        int n = entrada.nextInt();
        String[] total_nombres = new String [n];
        entrada.nextLine();


        //Pedirle al usuario que ingrese los nombres y llenar el arreglo
        for (int i=0 ; i<n ; i++){
            System.out.println(" Ingrese aqui el nombre: ");
            String nombres= entrada.nextLine();

            total_nombres[i]=nombres;

        }

        //Imprimir El arreglo
        Arrays.sort(total_nombres);
        for (int i=0 ; i<n ; i++){
            System.out.println(" Arreglo: "+total_nombres[i]);
        }

       





    }
        

}
    