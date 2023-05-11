import java.util.Scanner;

public class Ejercicio1{
    public static void main(String [] args ){

          Scanner entrada = new Scanner(System.in);

        System.out.println("BIENVENIDO SEÑOR USUARIO, INGRESE AQUI SU EDAD");
         int edad = entrada.nextInt();

         if (edad>=1 && edad<=120){

            
        if (edad<18){
            System.out.println("USTED RECIBIRA UN AUXILIO DE 800.000 ");

        }else{
            System.out.println("USTED RECIBIRA UN AUXILIO DE 200.000 ");

        }

         }else{
            System.out.println("ERROR EN LOS DATOS INGRESADOS")
         }




    }
}