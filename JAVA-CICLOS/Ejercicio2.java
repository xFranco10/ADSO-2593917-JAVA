import java.util.Scanner;

public class Ejercicio2{
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese aqui la cantidad de materias");
        int cant_materias = entrada.nextInt();

        float sumatoria = 0;
        float total_creditos = 0;
        float promedio=0;

        for (int i=1 ; i<=cant_materias; i++){

            System.out.println("Ingrese aqui la nota de la materia"+i+": ");
            float notas_materias = entrada.nextFloat();
            System.out.println("------------------------------------");
            System.out.println("Ingrese aqui el credito de la materia"+i+": ");
            float credito_materias = entrada.nextFloat();

            total_creditos= total_creditos+credito_materias;
            sumatoria = sumatoria + (notas_materias*credito_materias);
            

        }
            promedio = (sumatoria/total_creditos);
            System.out.println("Total de creditos:  " + total_creditos);
            System.out.println("Promedio del semestre: " + sumatoria);
            System.out.println("Promedio ponderado:  " + promedio);
    }
}
