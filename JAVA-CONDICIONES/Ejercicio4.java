import java.util.Scanner;

public class Ejercicio4{
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        int primer_numero;
        int segundo_numero;
        int tercer_numero;

        System.out.println("Ingrese aqui el primer numero");
        primer_numero = entrada.nextInt();

        System.out.println("Ingrese aqui el segundo numero");
        segundo_numero = entrada.nextInt();

        System.out.println("Ingrese aqui el tercer numero");
        tercer_numero = entrada.nextInt();

        if (primer_numero>segundo_numero && primer_numero>tercer_numero){
           System.out.println("El numero mayor es este:  " + primer_numero);
        }else if (segundo_numero>primer_numero && segundo_numero>tercer_numero){
            System.out.println("El numero mayor es este:  " + segundo_numero);
        }else if (tercer_numero>primer_numero && tercer_numero>segundo_numero){
            System.out.println("El numero mayor es este:  " + tercer_numero);
        }

        if (primer_numero<segundo_numero && primer_numero<tercer_numero){
            System.out.println("El numero menor es este:  "+ primer_numero);
        }else if (segundo_numero<primer_numero && segundo_numero<tercer_numero){
            System.out.println("El numero menor es este:  " + segundo_numero);
        }else if (tercer_numero<primer_numero && tercer_numero<segundo_numero){
            System.out.println("El numero menor es este:  " + tercer_numero);
        }
    }
}