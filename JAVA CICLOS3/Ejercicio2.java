import java.util.Scanner;

public class Ejercicio2{
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);


        System.out.println(" Ingrese aqui la cantidad total financiada: ");
        int cantidad_total = entrada.nextInt();
        System.out.println(" Ingrese aqui la cantidad de cuotas pagadas ");
        int cant_cuotas = entrada.nextInt();
        System.out.println(" Ingrese aqui el valor de cada cuota: ");
        int valor_cuotas = entrada.nextInt();

        int multi = cant_cuotas * valor_cuotas;
        int nuevo = multi - cantidad_total;
        float multiplicacion = (float)nuevo/(float)cantidad_total;
        float porcentaje = multi*100;

        
        System.out.println(" Este es el porcentaje del interes " + porcentaje + "%");

    }
}