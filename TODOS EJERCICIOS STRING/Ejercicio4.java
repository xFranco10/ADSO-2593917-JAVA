import java.util.Scanner;

public class Ejercicio4{
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println(" Ingrese una oracion: ");
        String cadena = entrada.nextLine();

        int letras = cadena.length();
        int j=0;
        int contador=0;

        String acum_cadena_invertido = "";

        for(int i=letras-1;i>=0;i--){

            if(cadena.charAt(j)==cadena.charAt(i)){
                contador++;
            }
            j++;

        }


        if (contador==letras){
            System.out.println(" -- La Palabra es Palindroma -- ");
        }else{
            System.out.println("-- La Palabra no es Palindroma -- ");
        }



    }
    

}
    