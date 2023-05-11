import java.util.Scanner;

public class Ejercicio13{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.println(" Ingrese un numero: ");
        int n = entrada.nextInt();

        int arreglo[] = new int [n];
        

        for(int i=0 ; i<n ; i++){
            System.out.println(" Ingrese el valor de la posicion "+i+" del arreglo: ");
            arreglo[i] = entrada.nextInt();

        }

        System.out.println(" Ingrese la posicion que desea buscar: ");
        int pos = entrada.nextInt();

        if(pos>=n || pos<0){
            pos=pos%n-1;
            if(pos<0){
                pos +=n+1;
            }
        }
        System.out.println("Valor: "+arreglo[pos]);

    }
    

}
    