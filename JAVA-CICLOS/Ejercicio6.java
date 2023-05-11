import java.util.Scanner;

public class Ejercicio6{
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        int fib_1 = 0;
        int fib_2 = 1;
        int fib_actual = 0;
        int numero = 0;
        int sumatoria= 0;
        

        System.out.println(" => Ingrese aqui un numero: ");
        numero = entrada.nextInt();
        
        for (int i=1 ; i<=numero ; i++){
            
            if (i==1){
                System.out.print(" ");
            }else if (i==2){
                System.out.print ("");
            }else{
                fib_actual = fib_1+fib_2;
                fib_1 = fib_2;
                fib_2 = fib_actual;
                sumatoria = fib_2;
                
            }
        }
        System.out.println(" => Este es el n-esimo: "+ sumatoria);

        

    }

}
    


