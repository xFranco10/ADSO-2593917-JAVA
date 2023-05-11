import java.util.Scanner;

public class Ejercicio5{
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        int fib_1 = 0;
        int fib_2 = 1;
        int fib_actual = 0;
        int numero = 0;
        

        System.out.println(" => Ingrese aqui un numero: ");
        numero = entrada.nextInt();
        
        for (int i=1 ; i<=numero ; i++){
            
            if (i==1){
                System.out.print("0 ");
            }else if (i==2){
                System.out.print(", ");
                System.out.print ("1 ");
                System.out.print(", ");
            }else{
                fib_actual = fib_1+fib_2;
                fib_1 = fib_2;
                fib_2 = fib_actual;
                System.out.print (" " + fib_actual);
                System.out.print(", ");
            }
        }
    }
}