import java.util.Scanner;

public class Cedulas{
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println(" Ingrese aqui la cantidad de cedulas que desea saber");
        int cant_cedulas = entrada.nextInt();

        long [] arreglo = new long[cant_cedulas];

        for (int i=0 ; i<arreglo.length ; i++){
            System.out.println("Ingrese aqui su numero de cedula");
            long num_cedula = entrada.nextLong();

            boolean valido = true;
            for (int j=0; j<arreglo.length; j++){
                if (cedula == arreglo[j]){
                    valido = false;
                }
            }

            if(valido){
                arreglo[i]=cedula;
            }else{
                System.out.println(" -- La Cedula se encuentra repetida -- ");
            }
            

        }

        for (int i=0; i<arreglo.length ; i++){
            System.out.println(" - Cedula "+i+ ": "+arreglo[i]);
        }


        


    }
}