import java.util.Scanner;

public class Ejercicio1{
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println(" Ingrese aqui su contraseña => ");
        String cadena = entrada.nextLine();

        int contador_8_caracteres = 0;
        int contador_mayuscula = 0;
        int contador_minuscula = 0;
        int contador_digito_numerico= 0;
        int contador_caracter_especial= 0;
        int contador_espacio = 0;


        for (int i=0 ; i<cadena.length() ; i++){


            // Minimo 8 caracteres
            if (cadena.length() >= 8 ){
                contador_8_caracteres++;
            }

            //Al menos una letra mayuscula
            if(cadena.charAt(i)>=65 && cadena.charAt(i)<=90){
                contador_mayuscula++;
            //al Menos una letra minuscula
            }else if(cadena.charAt(i)>=97 && cadena.charAt(i)<=122){
                contador_minuscula++;
            }

            // Al menos un digito numerico
            if(cadena.charAt(i)>=48 && cadena.charAt(i)<=57){
                contador_digito_numerico++;
            }

            // Al menos un caracter especial
            if (cadena.charAt(i)>=33 && cadena.charAt(i)<=47){
                contador_caracter_especial++;
            }


            //No contener espacio
            if(cadena.charAt(i)==32){
                contador_espacio++;
            }


            

        }

        if (contador_8_caracteres>1 && contador_mayuscula>1 && contador_minuscula>1 && contador_digito_numerico>1 && contador_caracter_especial>1 && contador_espacio==0  ){
            System.out.println(" La contraseña es valida ");
        }else{
            System.out.println(" La contraseña NO es valida ");

        }

        

        

    }    

}

