import java.util.Scanner;

public class Prueba1{
    public static void main(String[] args){

        //Elemento para Entrada 
        Scanner entrada = new Scanner(System.in);


        System.out.print("Ingrese la base: ");
        int base = entrada.nextInt();

        System.out.print("Ingrese la altura: ");
        int altura= entrada.nextInt();

        int area_rectangulo= base * altura;
        System.out.println("El area es:  " + area_rectangulo);

        
    }
}