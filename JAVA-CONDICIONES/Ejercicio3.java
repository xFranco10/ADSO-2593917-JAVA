import java.util.Scanner;

public class Ejercicio3{
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        int valor_x;
        int valor_y;

        System.out.println("Ingrese aqui el valor de X");
        valor_x = entrada.nextInt();

        System.out.println("Ingrese aqui el valor de Y");
        valor_y = entrada.nextInt();

        if (valor_x>0 && valor_y>0){
            System.out.println("La coordenada ingresada se encuentra en el primer cuadrante");
        }else if(valor_x<0 && valor_y>0){
            System.out.println("La coordenada ingresada se encuentra en el segundo cuadrante");
        }else if(valor_x<0 && valor_y<0){
            System.out.println("La coordenada ingresada se encuentra en el tercer cuadrante");
        }else if(valor_x>0 && valor_y<0){
            System.out.println("La coordenada ingresada se encuentra en el cuarto cuadrante");
        }else if(valor_x==0 && valor_y==0){
            System.out.println("La coordenada ingresada se encuentra en el centro del plano cartesiano");
        }

        System.out.println("Modificacion");
    }
}