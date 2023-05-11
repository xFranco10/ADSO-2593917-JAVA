import java.util.Scanner;

public class Ejercicio1{
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de materias");
        int cant_materias = entrada.nextInt();

        float sumatoria = 0;

        for(int i = 1; i<=cant_materias; i++){
            System.out.print( " Ingrese la nota "+i+": ");
            float nota = entrada.nextFloat();

            sumatoria=sumatoria+nota;
        }
        
        float promedio = sumatoria/cant_materias;
        System.out.println("Este seria el promedio "+promedio);
    }
}