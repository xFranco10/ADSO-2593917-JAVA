import java.util.Scanner;

public class Ejercicio3{

    public static void main(String [] args) {

        Scanner entrada =  new Scanner (System.in);

        System.out.println(" Ingrese aqui la cantidad de primos que desea saber : ");
        int n = entrada.nextInt();
        
        int arreglo[] = new int[n];
        int posicion=0;

        //hallando un numero primo
        int divisibles;
        for(int i=2;posicion<n;i++){ //no sale de este for si no esta lleno el vector
            divisibles=0;
            for(int j=1;j<=i;j++){ // aqui este for, recorre todos los numeros detras de el
                if(i%j==0){ //los numero primos solo son divisible por 1 y por ellos mismos
                    divisibles++;
                }
            }
            if(divisibles==2){ //si es divisible por el y por 1 entrara
                arreglo[posicion]=i; // guardo numero en el vector
                posicion++; // aumento una posicion para el sgte numero
            }
        }


        for(int i=0;i<arreglo.length;i++) {
            System.out.println(" " + arreglo[i]);
        }

    }

    



}
    
