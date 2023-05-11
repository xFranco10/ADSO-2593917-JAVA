import java.util.Scanner;

public class Ejercicio2{
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese  la cantidad de numeros primos que desea saber: ");
        int n = entrada.nextInt();

        int [] numero = new int[n];
        int aleatorio = 0;
        int i = 0;
        while (i<n){
            aleatorio = (int)(Math.random()*999);
            //calculo para saber si el numero es primo
            int contador = 0;
            int a=1;
            while (a<=aleatorio){
                if (aleatorio%a==0){
                    contador++;
                }
                a++;
            }
            if (contador==2){
                boolean valido = true;
                for (int j=0;j<n;j++){
                    if (numero[j] == aleatorio){
                        valido = false;
                    }
                }
                if (valido){
                    numero[i]=aleatorio;
                    i++;
                }
            }
        }
        for (i=0;i<n;i++){
            System.out.println(" => Numero Primo : "+numero[i]);
        }
    }
}