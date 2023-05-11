import java.util.Scanner;

public class Ejercicio3{
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese aqui la altura de la piramide");
        int altura_piramide = entrada.nextInt();

        for (int i=1 ; i<=altura_piramide; i++){
            for (int k=1;k<=altura_piramide -i;k++){
                System.out.print(" ");
            }
            for (int a=1;a<=(i*2)-1;a++){
                System.out.print("X");
            }
            System.out.println();
        }
    }
    

}
    