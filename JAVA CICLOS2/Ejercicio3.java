import java.util.Scanner;

public class Ejercicio3{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int e=1;
        System.out.println (" => Ingrese un numero entero: ");
        int entero = entrada.nextInt();
        while(e<=entero){
            int count=0;
            int j=1;
            int aleatorio = (int)(Math.random()*999);
            while(j<=aleatorio){
                if(aleatorio%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("El primo "+e+"generado es: "+aleatorio);
                e++;
            }
        }
    }
}