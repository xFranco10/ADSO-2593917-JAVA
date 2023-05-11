import java.util.Scanner;

public class Ejercicio8{
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println(" Ingrese aqui el tamaño del arreglo: ");
        int tamano_arreglo = entrada.nextInt();

        int arreglo_original[] = new int[tamano_arreglo];
        int arreglo_pares[] = new int [tamano_arreglo];
        int arreglo_impares[] = new int [tamano_arreglo];

        for (int i=0; i<tamano_arreglo; i++){

            System.out.println(" Ingrese los numeros ");
            int num_originales = entrada.nextInt();

            arreglo_original[i]=num_originales;

            if(num_originales%2==0){
                arreglo_pares[i]=arreglo_original[i];
            }else{
                arreglo_impares[i]=arreglo_original[i];
            }

        }

        for (int i=0; i<tamano_arreglo; i++){

            System.out.println(" ");
            System.out.print(" Arreglo Original: { "+arreglo_original[i]+" } ");
            System.out.println(" ");
            System.out.print(" Arreglo Pares: { "+arreglo_pares[i]+" } ");
            System.out.println(" ");
            System.out.print(" Arreglo Impares: { "+arreglo_impares[i]+" } ");
             System.out.println(" ");

        }



    }    

}
  