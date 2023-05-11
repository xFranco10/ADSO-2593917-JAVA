import java.util.Scanner;

public class Ejercicio4{
    public static void main (String [] args){

        Scanner entrada= new Scanner (System.in);

        System.out.println(" Ingrese aqui por favor el area inicial: ");
        double area_inicial = entrada.nextInt();
        System.out.print(" Ingrese aqui por favor el area total: ");
        double area_total =entrada.nextInt();



        double acum=0;
        double num1=0;
        double num2=0;
        double num3=0;


        boolean creciente = true;
        for (int i=0; creciente ; i++){
            num1= (area_inicial*300)/100;
            num2 = num1*0.30;
            num3 = num1 - num2;
            area_inicial=num3;

            System.out.println ( "Dia: "+ i);
            System.out.println( " Creciente: "+num1);
            acum++;
            if (num1>area_total){
                creciente=false;
            }else{
                System.out.println( " Decreciente: "+num3);
            }
        }
        System.out.println(" Total de dias consumidos fue : "+(acum-0.5));

    }
}