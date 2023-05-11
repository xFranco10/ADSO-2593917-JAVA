import java.util.Scanner;

public class Ejercicio8{
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el Numero: ");
        int numero = entrada.nextInt();

         //Obtener todos los digitos por separado
        int digito_1 = numero%10;
        int digito_2 = (numero/10)%10;
        int digito_3 = (numero/100)%10;
        int digito_4 = (numero%1000;)%10;
        int digito_5 = (numero/10000)%10;
        int digito_6 = (numero/100000);

        //Algoritmo para imprimir el texgto del 6to Digito

        if (digito_6==9){
            System.out.print(" NOVECIENTOS "):
        }else if (digito_6==8){
            System.out.print(" OCHOCIENTOS ");
        }else if (digito_6==7){
            System.out.print(" SETECIENTOS ");
        }else if (digito_6==6){
            System.out.print(" SEISCIENTOS ");
        }else if (digito_6==5){
            System.out.print(" QUINIENTOS ");
        }else if (digito_6==4){
            System.out.print(" CUATROCIENTOS ");
        }else if (digito_6==3){
            System.out.print(" TRECIENTOS ");
        }else if (digito_6==2){
            System.out.print(" CUATROCIENTOS ");
        }else if (digito_6==1){
            if (digito_5==0 && digito_4==0);
            System.out.print(" CIEN ");
        }else{
            System.out.print(" CIENTO ");
        }else if (digito_6==0){
            System.out.print("");
        }
        }
        




        




    }
}
