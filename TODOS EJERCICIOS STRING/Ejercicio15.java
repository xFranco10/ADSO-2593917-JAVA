import java.util.Scanner;

public class Ejercicio11{
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int n = entrada.nextInt();

        int arreglo1 [] = new int [n];
        int arreglo2 [] = new int [n];
        int cont = 0;

        for(int i = 0; i < n; i++ ){
            System.out.print("Ingrese el valor que quiere en el primer arreglo: ");
            arreglo1[i]=entrada.nextInt();
        }
        for(int i = 0; i < n; i++ ){
            System.out.print("Ingrese el valor que quiere en el segundo areglo: ");
            arreglo2[i]=entrada.nextInt();
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(arreglo1[i]==arreglo2[j]){
                    cont++;
                }
            }
        }
        if(cont==n){
            System.out.print("Los arreglos son equivalentes");
        }else{
            System.out.print("Los arreglos no son equivalentes");
        }

    }
}
