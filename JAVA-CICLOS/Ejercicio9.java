import java.util.Scanner;

public class Ejercicio9{
    public static void main (String [] args){

        Scanner entrada = new Scanner (System.in);

        int numero;
        int n;

        System.out.println("Ingrese aqui  la cantidad que desea que se repita el ciclo");
        n = entrada.nextInt();

        for (int i=1 ; i<=n ; i++ ){

            System.out.println("=> Ingrese un numero ");
            numero = entrada.nextInt();
            System.out.println("----------------------");

            if (numero/numero && numero/1){
                System.out.println(" => Numero Ingresado es primo");
            }else{
                System.out.println("=> Numero Ingresado no es primo");
            }

        }


    }

}
    