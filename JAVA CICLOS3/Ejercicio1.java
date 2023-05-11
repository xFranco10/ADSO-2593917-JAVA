import java.util.Scanner;

public class Ejercicio1{
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("=> Ingrese aqui la cantidad de usuarios: ");
        int n = entrada.nextInt();

        for (int i=1; i<=n ; i++) {

            System.out.println(" => Ingrese un sueldo total: ");
            int sueldo_total = entrada.nextInt();

            System.out.println(" => Cantidad de pagos: ");
            int cant_pagos = entrada.nextInt();

            System.out.println("------------- FORMAS DE PAGO ----------------");
            System.out.println(" 1. Pagos de igual valor. ");
            System.out.println(" 2. Primer pago diferente. ");
            System.out.println(" 3. Ultimo pago diferente. ");
            System.out.println(" 4. Primer y ultimo pago diferente. ");
            int forma_pago = entrada.nextInt();

                
            // Pagos de igual valor  
            if (forma_pago==1){
                    
                for (int j=1; j<=cant_pagos ; j++){
                    
                    int calcu= sueldo_total/cant_pagos;

                    System.out.println(" Mes "+ j + " : "+calcu);
                }


            // Primer pago diferente      
            }else if (forma_pago==2){

                System.out.println(" => Ingrese aqui el primer pago del mes ");
                int primer_pago = entrada.nextInt();

                int resta=sueldo_total-primer_pago;
                int resta2=sueldo_total-resta;
                int b=sueldo_total-resta2;

                System.out.println(" Mes 01: "+b);

                int menor=cant_pagos-1;

                for ( int k=1 ; k<=menor; k++){

                    int calcu = resta2/menor;

                    System.out.println(" Mes "+(k+1)+ ": "+calcu);

                }

            
            //Ultimo pago diferente   
            }else if (forma_pago==3){

                System.out.println (" => Ingrese aqui el pago del ultimo mes ");
                int ultimo_pago = entrada.nextInt();

                int resta1=sueldo_total-ultimo_pago;
                int menort=cant_pagos-1;

                for ( int a=1 ; a<=menort ; a++){

                    int calcut = resta1/menort;

                    System.out.println(" Mes "+ a +" : "+calcut);

                }

                System.out.println(" Ultimo Mes : "+ultimo_pago);


            


            //Primer y Ultimo pago diferente
            }else if (forma_pago==4){

                System.out.println(" => Ingrese aqui el primer pago del mes");
                int primer_pago = entrada.nextInt();

                System.out.println (" => Ingrese aqui el pago del ultimo mes ");
                int ultimo_pago = entrada.nextInt();

                int resta = sueldo_total-primer_pago-ultimo_pago;
                int menor=cant_pagos-2;

                System.out.println(" Mes 01: "+primer_pago);

                for  ( int o=1 ; o<=menor ; o++ ){

                    int calcu = resta/menor;
                    System.out.println(" Mes "+(o+1)+ ": "+calcu);
                }

                System.out.println(" Ultimo mes : "+ultimo_pago);


                
            }

        }

        




    }
}