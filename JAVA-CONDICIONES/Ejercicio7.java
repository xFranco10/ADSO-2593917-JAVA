import java.util.Scanner;

public class Ejercicio7{
    public static void main(String [] args){
        
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Ingrese aqui el numero max 10 Digitos");
        numero = entrada.nextInt();

        System.out.println("//---------- FORMATO DE MONEDA -----------//");
        int primer_digito=(numero/1)%10;
        int segundo_digito=(numero/10)%10;
        int tercer_digito=(numero/100)%10;
        int cuarto_digito=(numero/1000)%10;
        int quinto_digito=(numero/10000)%10;
        int sexto_digito=(numero/100000)%10;
        int septimo_digito=(numero/1000000)%10;
        int octavo_digito=(numero/10000000)%10;
        int noveno_digito=(numero/100000000)%10;
        int decimo_digito=(numero/1000000000)%10;

        System.out.println("Moneda : "+decimo_digito"."+noveno_digito+octavo_digito+septimo_digito"."+sexto_digito+quinto_digito+cuarto_digito"."+tercer_digito+segundo_digito+primer_digito);
    }
}