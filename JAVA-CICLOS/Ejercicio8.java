import java.util.Scanner;

public class Ejercicio8{
    public static void main (String [] args){

        Scanner entrada = new Scanner (System.in);

        int numero;
        int n;
        int invertido = 0;
        int valor;

        System.out.println(" => Ingrese aqui la cantidad que desea repetir el ciclo");
        n = entrada.nextInt();


        
        //Invertir el numero
        for (int k=1; k<=6;k++){

            valor = ( numero%10);
            invertido = (invertido*10)+valor;
            numero=numero/10; 

            if(numero==0){
                break;
            }              
        }




        // Imprimir Resultado
        for (int i=1; i<=n; i++){

            System.out.println(" => Ingrese aqui un numero");
            numero = entrada.nextInt();
            System.out.println(" ---------------- // ---------------");

            valor = ( numero%10 );
            System.out.println("=> El digito" + i +" es:  " + valor);
            numero=numero/10;

            if (numero==0){
                break;
            }

        }
        

    }
}