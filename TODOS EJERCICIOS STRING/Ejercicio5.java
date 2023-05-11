import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio5{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println(" Señor usuario ingrese aqui su nombre: ");
        String nombre = entrada.nextLine();


        for (int i=0;i<50;i++){
            System.out.println(" -- Escoja una opcion -- ");
            System.out.println(" -- 1. Inicar Juego -- ");
            System.out.println(" -- 0. Salir -- ");
            int opcion = entrada.nextInt();

            String palabra = "python";

            char [] letras = palabra.toCharArray();
            char [] letras_con_guiones_bajos = new char[letras.length];


            if(opcion==1){

                for(int j=0; j<letras.length; j++){
                    letras_con_guiones_bajos[j]='_';

                }
                System.out.println(letras_con_guiones_bajos);


                boolean hemos_ganado = false;   

                while(hemos_ganado==false){
                    System.out.println(" Ingrese una letra: ");

                    char letra_introducida = entrada.next().charAt(0);

                    for (int a=0;a<letras.length;a++){
                        if(letras[a]==letra_introducida){
                            letras_con_guiones_bajos[i]=letra_introducida;
                        }

                    }

                    if(Arrays.equals(letras, letras_con_guiones_bajos)){
                        System.out.println(" -- Has Ganado -- ");
                    }
                    System.out.println(letras_con_guiones_bajos);

                }

                

               

                
            }


        }


        


    }

}