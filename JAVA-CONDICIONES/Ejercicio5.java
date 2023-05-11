import java.util.Scanner;

public class Ejercicio5{
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

        if{ (primer_numero<segundo_numero && segundo_numero<tercer_numero)
            System.out.println("Los numeros se ingresaron en orden Ascendente");
        }else{
            System.out.println("Los numeros se ingresaron en desorden");
    }   }
}