import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la palabra 1: ");
        String palabra_1 = entrada.nextLine();

        System.out.print("Ingrese la palabra 2: ");
        String palabra_2 = entrada.nextLine();

        int total = Math.min(palabra_1.length(),palabra_2.length());
        
        
        for(int i = 0; i<total;i++){
            
            System.out.print(palabra_1.charAt(i));
            
            System.out.print(palabra_2.charAt(i));
            
        }
        if(palabra_1.length()>palabra_2.length()){
            System.out.print(palabra_1.substring(total));
        }else{
            System.out.print(palabra_2.substring(total));
        }
        
    }
}