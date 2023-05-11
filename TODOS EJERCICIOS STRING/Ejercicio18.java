import java.util.Scanner;

public class Ejercicio12{
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println(" Ingrese el tamaño del arreglo 1");
        int num_tamano = entrada.nextInt();

        int arreglo1[] = new int[num_tamano];
        int arreglo2[] = new int[num_tamano];
        int arreglo3[] = new int[num_tamano*2];


        for (int i=0 ; i<arreglo1.length; i++){

            System.out.println(" Ingrese un numero para el arreglo 1");
            int num1 = entrada.nextInt();
            
            System.out.println(" Ingrese un numero para el arreglo 2");
            int num2 = entrada.nextInt();

            arreglo1[i]=num1;
            arreglo2[i]=num2;



        }

        for (int j=0 ; j<arreglo1.length; j++){
            arreglo3[j]=arreglo1[j];
            for (int a=0 ; a<arreglo3.length ; a++){
                arreglo3[a]=arreglo2[a];
                break;

            }

        }

        for (int x=0 ; x<arreglo3.length; x++){

            System.out.print(" Arreglo 1: "+arreglo1[x]+",");
            System.out.print(" Arreglo 2: "+arreglo2[x]+",");
            System.out.print(" Arreglo 3: "+arreglo3[x]+",");
           
        }

        
        


    }    

}
    