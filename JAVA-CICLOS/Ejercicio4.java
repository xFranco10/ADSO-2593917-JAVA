import java.util.Scanner;

public class Ejercicio4{
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        int opcion = 0;

        while (opcion!=3){
            System.out.println(" ----------- BIENVENIDO --------------" );
            System.out.println(" ---- 1. Docente ----");
            System.out.println(" ---- 2. Estudiante ---- ");
            System.out.println(" ---- 3. Salir ---- ");
            System.out.println(" >= Escoja aqui una opcion: ");
            opcion = entrada.nextInt();

            if (opcion==1){

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

            }else if (opcion==2){

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

            }else if(opcion==3){
                System.out.println (" --- SALIENDO --- ");
            }else{
                System.out.println ("--- ERROR EN LOS DATOS INGRESADOS --- ");
            }

        }

    }
}