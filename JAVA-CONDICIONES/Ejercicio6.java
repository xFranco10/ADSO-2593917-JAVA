import java.util.Scanner;

public class Ejercicio6{
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        int numero;
        int opcion;

        System.out.println("Ingrese aqui un numero de seis digitos");
        numero = entrada.nextInt();





        

        System.out.println("---------------------------");
        System.out.println("Menu");
        System.out.println("1. Primer Digito");
        System.out.println("2. Segundo Digito");
        System.out.println("3. Tercer Digito");
        System.out.println("4. Cuarto Digito"); 
        System.out.println("5. Quinto Digito");           
        System.out.println("6. Sexto Digito");
        System.out.println("--------------------------------");

        System.out.println("Ingrese aqui una opcion");
        opcion = entrada.nextInt();

        if (opcion==1){
            int primer_digito = (numero/1)%10;
            System.out.println("Este es el primer digito  " + primer_digito);
        } else if (opcion==2){
            int segundo_digito = (numero/10)%10;
            System.out.println("Este es el segundo Digito  " + segundo_digito);
        }else if (opcion==3){
            int tercer_digito = (numero/100)%10;
            System.out.println("Este es el tercer Digito  " + tercer_digito);
        }else if (opcion==4){
            int cuarto_digito = (numero/1000)%10;
            System.out.println("Este es el cuarto Digito  " + cuarto_digito);
        }else if (opcion==5){
            int quinto_digito = (numero/10000)%10;
            System.out.println("Este es el quinto Digito   " + quinto_digito);
        }else if (opcion==6){
            int sexto_digito = (numero/100000)%10;
            System.out.println("Este es el sexto Digito  " + sexto_digito);
        }






    }
}