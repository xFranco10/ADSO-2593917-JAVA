import java.util.Scanner;

public class Ejercicio2{
    public static void main (String [] args){

        int dias_aleatorios = 0;
        int meses_aleatorios = 0;
        int ano_aleatorio = 0;


        boolean search = true;
        while (search==true){
            meses_aleatorios=(int)(Math.random()*12);
            if (meses_aleatorios<=12 && meses_aleatorios > 0){
                if (dias_aleatorios == 31 && (meses_aleatorios == 1 || meses_aleatorios = 3 || meses_aleatorios == 5 || meses_aleatorios == 7 || meses_aleatorios == 8 || meses_aleatorios == 10 || meses_aleatorios == 12)){
                    search=false;
                }else if (dias_aleatorios == 30 && (meses_aleatorios == 4 || meses_aleatorios == 6 || meses_aleatorios == 11)){
                    search=false;
                }else  if ( dias_aleatorios == 28 && (meses_aleatorios == 2)){
                    search=false;
                }
                search=false;
            }
        }

        boolean buscar = true;
        while (buscar==true){
            ano_aleatorio=(int)(Math.random()*9999);
            if(ano_aleatorio>=1000 && ano_aleatorio<=9999){
                buscar = false;
            }
        }
        if(dias_aleatorios>0 && dias_aleatorios<10 && meses_aleatorios>0 && meses_aleatorios<10){
            System.out.println("0"+dias_aleatorios+"/0"+meses_aleatorios+"/"+ano_aleatorio);
        }else if (dias_aleatorios > 0 && dias_aleatorios < 10 ){
            System.out.println("0"+dias_aleatorios+"/"+meses_aleatorios+"/"+ano_aleatorio);
        }else if (meses_aleatorios > 0 && dias_aleatorios < 10){
            System.out.println(dias_aleatorios+"/0"+meses_aleatorios+"/"+ano_aleatorio);
        }else{
            System.out.println(dias_aleatorios+"/"+meses_aleatorios+"/"+ano_aleatorio);
        }

        

        

        


    }

}