import java.util.Scanner;

public class Ejercicio7{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);


        System.out.println("Ingrese aqui un numero: ");
        int numero_1 = entrada.nextInt();
        System.out.println("Ingrese aqui un numero: ");
        int numero_2 = entrada.nextInt();
        System.out.println("Ingrese aqui un numero: ");
        int numero_3 = entrada.nextInt();

        int contador = 1;
        boolean buscando = true;

        while (buscando){
            if (contador%numero_1==0 && contador%numero_2==0 && contador%numero_3==0){
            buscando = false;

            }else{
            contador++;
            }
        
        }
        System.out.println(" => MCM SERIA : " + contador);
        
    }
}