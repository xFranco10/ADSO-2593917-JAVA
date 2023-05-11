import java.util.Scanner;

public class Ejercicio2{
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        char nuevo = ' ';

        System.out.println(" Ingrese una oracion: ");
        String cadena = entrada.nextLine();

        for (int i=0 ; i<cadena.length() ; i++){

            int pos = (int)cadena.charAt(i);

            if(pos>=65 && pos<=90){
                nuevo =(char) (pos+32);
            }else if(pos>=97 && pos<=122){
                nuevo = (char) (pos-32);
            }else if(pos==32){
                nuevo = ' ';
            }

            System.out.print(nuevo);
        }



    }
    

}
    
