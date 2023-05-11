import java.util.Scanner;

public class Ejercicio1{
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);


        int valor_x;
        int valor_y;
        int suma;

        

        System.out.println(" Ingresando coordenadas del punto A");

        System.out.println(" Ingrese aqui el valor de X: ");
        int valor_x_a = entrada.nextInt();

        System.out.println(" Ingrese aqui el valor de Y: ");
        int valor_y_a = entrada.nextInt();

        System.out.println(" Ingresando coordenadas del punto B");

        System.out.println(" Ingrese aqui el valor de X: ");
        int valor_x_b = entrada.nextInt();

        System.out.println(" Ingrese aqui el valor de Y: ");
        int valor_y_b = entrada.nextInt();


        int resta_a = (valor_x_a - valor_y_a);
        int resta_b = (valor_x_b - valor_y_b );

        suma = (resta_a/resta_b);

        System.out.println(" El valor pendiente es: "+suma);

        if ( suma > 0){
            System.out.println("Positiva");
        }else{
         System.out.println(" Negativa ");
        }

        
    



    }
}

