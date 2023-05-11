import java.util.Scanner;

public class Ejercicio15{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int n = entrada.nextInt();

        String arreglo [] = new String [n];
        entrada.nextLine();

        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Ingrese alguna frase o palabra: ");
            arreglo[i]=entrada.nextLine();
        }
        for(int i = 0; i < arreglo.length; i++){
            System.out.println(arreglo[i]);
        }
        System.out.println("Ingrese la palabra que desea eliminar: ");
        String pal = entrada.nextLine();

        int pos = -1;
        for(int i = 0; i < arreglo.length; i++){
            
            if(arreglo[i].equalsIgnoreCase(pal)){
                pos=i;
            }
        }
        if(pos>=0){
            for(int i = pos; i<arreglo.length-1; i++){
                arreglo[i]=arreglo[i+1];
            }
            arreglo[arreglo.length-1]=" ";
        }

        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i]);
        }




    }
}    