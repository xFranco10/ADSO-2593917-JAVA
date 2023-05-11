import java.util.Scanner;
import java.io.IOException;

public class Ejercicio2{
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        //Definiendo mapa del laberinto
        int matriz[][] ={
                            {1,1,1,1,1,1,1},
                            {1,0,0,0,1,0,3},
                            {1,0,1,0,1,0,1},
                            {1,0,1,0,1,0,1},
                            {2,0,1,0,0,0,1},
                            {1,1,1,1,1,1,1}
                        };
        //Ciclo del juego
        boolean jugando = true;
        int pos_f = 4;
        int pos_c = 0;
        while (jugando){
            try { new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); } catch (Exception e) {}
            //Imprimir Laberinto
            for (int i=0 ; i<matriz.length; i++){
                for (int j=0 ; j<matriz[i].length ; j++){
                    System.out.print(" " +matriz[i][j]+ " ");
                }
                System.out.println(" ");
            }

            //Imprimir el Menu
            System.out.println(" ");
            System.out.println(" Ingrese aqui a que direccion se desea mover :");
            System.out.println(" 1. Arriba ");
            System.out.println(" 2. Abajo ");
            System.out.println(" 3. Derecha ");
            System.out.println(" 4. Izquierda ");
            int opciones = entrada.nextInt();

            //Condiciones segun la seleccion del usuario

            //Codigo para mover arriba
            if (opciones==1){
                //Preguntar si el movimiento es valido
                if( matriz[pos_f-1][pos_c]== 0){
                    matriz[pos_f-1][pos_c] = 2;
                    matriz[pos_f][pos_c]= 0;
                    pos_f = pos_f-1 ;
                    pos_c = pos_c;
                }else if(matriz[pos_f-1][pos_c] == 3){
                    jugando = false ;
                }

                    
            }
            //Codigo para mover abajo
            if (opciones==2){
                if( matriz[pos_f+1][pos_c]== 0){
                    matriz[pos_f+1][pos_c] = 2;
                    matriz[pos_f][pos_c]= 0;
                    pos_f = pos_f+1;
                    pos_c = pos_c;
                }else if (matriz[pos_f+1][pos_c] == 3){
                    jugando = false;
                }
                
            }
            //codigo para mover a derecha
            if (opciones==3){
                if( matriz[pos_f][pos_c+1] == 0){
                    matriz[pos_f][pos_c+1] = 2;
                    matriz[pos_f][pos_c]= 0;
                    pos_f = pos_f;
                    pos_c = pos_c+1;
                }else if (matriz[pos_f][pos_c+1] == 3){
                    jugando = false;
                }
                
            }
            //codigo para mover a izquierda
            if (opciones==4){
                
                if( matriz[pos_f][pos_c-1] == 0){
                    matriz[pos_f][pos_c-1] = 2;
                    matriz[pos_f][pos_c]= 0;
                    pos_f = pos_f;
                    pos_c = pos_c-1;
                }else if (matriz[pos_f][pos_c-1] == 3){
                    jugando = false;
                }
                
            }
            //Condicion de movimiento invalido
            if (opciones<1 || opciones>4){
                System.out.print(" MOVIMIENTO INCORRECTO ");
            }

            System.out.println(" ");
            System.out.println(" GAME OVER - JUEGO COMPLETADO ");

        }

        
    }
}