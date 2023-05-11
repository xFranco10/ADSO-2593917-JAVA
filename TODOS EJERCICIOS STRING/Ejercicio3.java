import java.util.Scanner;

public class Ejercicio3{
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println(" Ingrese su nombre completo: ");
        String cadena = entrada.nextLine();
        String acum_cadena_invertido = "";

        for(int i=cadena.length()-1;i>=0;i--){
            acum_cadena_invertido = acum_cadena_invertido + cadena.charAt(i);
        }
        System.out.println(" Nombre Invertido: "+acum_cadena_invertido);



    }
}