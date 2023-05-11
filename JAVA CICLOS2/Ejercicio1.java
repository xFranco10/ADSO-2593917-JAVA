import java.util.Scanner;

public class Ejercicio1{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

        int numero;
        int n;
        int aleatorio = 0;
        int resultado;
        int valor_aleatorio=0;

        System.out.print(" => Ingrese un numero de 1 a 6:  ");
        n = entrada.nextInt();

        
        for (int i=1; i<=n ; i++){

            aleatorio =(int)(Math.random()*10);
            valor_aleatorio=valor_aleatorio*10+aleatorio;


        }
        
        System.out.print("El numero construido es:    "+valor_aleatorio);

        System.out.println(" ");
        resultado = (valor_aleatorio*2);
        System.out.print(" => Resultado producto es:  "+ resultado);
        
        


    }
}