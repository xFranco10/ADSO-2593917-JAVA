import java.util.Scanner;

public class Ejercicio1{
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println(" Ingrese aqui una oracion: ");
        String cadena = entrada.nextLine();

        System.out.println(" Cantidad de letras en total => "+cadena.length());

        int cont = 0;


        for (int i=0 ; i<cadena.length(); i++){
            System.out.println(" Letra en Posicion "+i+ " => "+cadena.charAt(i));

            if(cadena.charAt(i)=='a' || cadena.charAt(i)=='A'){
                cont++;
            }else if(cadena.charAt(i)=='e' || cadena.charAt(i)=='E'){
                cont++;
            }else if(cadena.charAt(i)=='i' || cadena.charAt(i)=='I'){
                cont++;
            }else if(cadena.charAt(i)=='o' || cadena.charAt(i)=='O'){
                cont++;
            }else if(cadena.charAt(i)=='u' || cadena.charAt(i)=='U'){
                cont++;
            }

            
        }
        System.out.println(" Cantidad de Vocales: "+cont);


    }

}
    