import java.util.Scanner;

public class Ejercicio2{
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero de 3 digitos y le digo si es IMPAR O PAR");
        int numero = entrada.nextInt();

        if (numero>=1 && numero<=999){
            if (numero % 2 == 0){
                System.out.println("SU NUMERO ES PAR");
            }else if(numero % 2 == 1){
                System.out.println("SU NUMERO ES IMPAR");
            }
        }else{
            System.out.println("ERROR EN LOS DATOS INGRESADOS");
        }

    }
}