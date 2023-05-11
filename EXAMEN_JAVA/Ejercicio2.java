import java.util.Scanner;

public class Ejercicio2{
    public static void main (String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese aqui las veces que desea calcular");
        int calculo_veces = entrada.nextInt();

        System.out.println("Ingrese aqui cuantos kilometros se gasta el automovil por un litro de gasolina ");
        int litros_gasolina = entrada.nextInt();

        System.out.println("Ingrese aqui el valor del litro de la gasolina");
        int precio_litro = entrada.nextInt();

        System.out.println(" Ingrese aqui el valor de la gasolina ");
        int precio_gasolina = entrada.nextInt();

        
        double kilometros_recorridos = 0;

        //Ciudad Guatica
        double guatica_a_guatica = 5.0;
        double guatica_a_lacelia = 91.1;
        double guatica_a_la_virginia = 60.0;
        double guatica_a_marsella= 98.5;
        double guatica_a_mistrato = 25.1;

        //Ciudad La Celia
        double lacelia_a_guatica = 91.1;
        double lacelia_a_lacelia = 5.0;
        double lacelia_a_la_virginia = 33.9;
        double lacelia_a_marsella = 87.2;
        double lacelia_a_mistrato = 25.1;

        //Ciudad La Virginia
        double lavirginia_a_guatica = 60.0;
        double lavirginia_a_lacelia = 34.0;
        double lavirginia_a_lavirginia = 5.0;
        double lavirginia_a_marsella = 53.3;
        double lavirginia_a_mistrato = 56.9;

        //Ciudad Marsella
        double marsella_a_guatica = 98.4;
        double marsella_a_lacelia = 87.0;
        double marsella_a_lavirginia = 53.0;
        double marsella_a_marsella = 5.0;
        double marsella_a_mistrato = 110.0;

        //Ciudad Mistrato
        double mistrato_a_guatica = 25.1;
        double mistrato_a_lacelia = 88.1;
        double mistrato_a_lavirginia = 57.0;
        double mistrato_a_marsella = 110.0;
        double mistrato_a_mistrato = 5.0;

        for (int i=1 ; i<calculo_veces ; i++){
            System.out.println(" => Ingrese aqui una ciudad origen ");
            System.out.println(" 1. Guatica ");
            System.out.println(" 2. La Celia ");
            System.out.println(" 3. La Virginia ");
            System.out.println(" 4. Marsella ");
            System.out.println(" 5. Mistrato ");
            int origen = entrada.nextInt();

            System.out.println(" Cuantas paradas realizara? ");
            int cant_paradas = entrada.nextInt();

            if (origen==1){
                for ( int j=1 ; j<cant_paradas ; j++){
                    System.out.println(" => Donde sera su parada "+j+ " : ");
                    System.out.println(" 1. Guatica ");
                    System.out.println(" 2. La Celia ");
                    System.out.println(" 3. La Virginia ");
                    System.out.println(" 4. Marsella ");
                    System.out.println(" 5. Mistrato ");
                    int parada = entrada.nextInt();
                    if (parada==1){
                        kilometros_recorridos=kilometros_recorridos+guatica_a_guatica;
                    }else if (parada==2){
                        kilometros_recorridos=kilometros_recorridos+guatica_a_lacelia;
                    }else if (parada==3){
                        kilometros_recorridos=kilometros_recorridos+guatica_a_la_virginia;
                    }else if (parada==4){
                        kilometros_recorridos=kilometros_recorridos+guatica_a_marsella;
                    }else if (parada==5){
                        kilometros_recorridos=kilometros_recorridos+guatica_a_mistrato;
                    }
                    kilometros_recorridos=kilometros_recorridos;
                    System.out.println(" kilometros Recorridos: "+kilometros_recorridos);
                }
            }else if (origen==2){
                for (int j=1 ; j<cant_paradas ; j++){
                    System.out.println(" => Donde sera su parada "+j+ " : ");
                    System.out.println(" 1. Guatica ");
                    System.out.println(" 2. La Celia ");
                    System.out.println(" 3. La Virginia ");
                    System.out.println(" 4. Marsella ");
                    System.out.println(" 5. Mistrato ");
                    int parada = entrada.nextInt();

                    if (parada==1){
                        kilometros_recorridos=kilometros_recorridos+lacelia_a_guatica;
                    }else if (parada==2){
                        kilometros_recorridos=kilometros_recorridos+lacelia_a_lacelia;
                    }else if (parada==3){
                        kilometros_recorridos=kilometros_recorridos+lacelia_a_la_virginia;
                    }else if (parada==4){
                        kilometros_recorridos=kilometros_recorridos+lacelia_a_marsella;
                    }else if (parada==5){
                        kilometros_recorridos=kilometros_recorridos+lacelia_a_mistrato;
                    }
                    kilometros_recorridos=kilometros_recorridos;
                    System.out.println(" kilometros recorridos: "+kilometros_recorridos);
                }
            }else if (origen==3){
                for (int j=1 ; j<cant_paradas ; j++ ){
                    System.out.println(" => Donde sera su parada "+j+ " : ");
                    System.out.println(" 1. Guatica ");
                    System.out.println(" 2. La Celia ");
                    System.out.println(" 3. La Virginia ");
                    System.out.println(" 4. Marsella ");
                    System.out.println(" 5. Mistrato ");
                    int parada = entrada.nextInt();

                    if (parada==1){
                        kilometros_recorridos=kilometros_recorridos+lavirginia_a_guatica;
                    }else if (parada==2){
                        kilometros_recorridos=kilometros_recorridos+lavirginia_a_lacelia;
                    }else if (parada==3){
                        kilometros_recorridos=kilometros_recorridos+lavirginia_a_lavirginia;
                    }else if (parada==4){
                        kilometros_recorridos=kilometros_recorridos+lavirginia_a_marsella;
                    }else if (parada==5){
                        kilometros_recorridos=kilometros_recorridos+lavirginia_a_mistrato;
                    }
                    kilometros_recorridos=kilometros_recorridos;
                    System.out.println(" Kilometros recorridos: "+kilometros_recorridos);
                }
            }else if (origen==4){
                for (int j=1 ; j<cant_paradas ; j++){
                    System.out.println(" => Donde sera su parada "+j+ " : ");
                    System.out.println(" 1. Guatica ");
                    System.out.println(" 2. La Celia ");
                    System.out.println(" 3. La Virginia ");
                    System.out.println(" 4. Marsella ");
                    System.out.println(" 5. Mistrato ");
                    int parada = entrada.nextInt();

                    if (parada==1){
                        kilometros_recorridos=kilometros_recorridos+marsella_a_guatica;
                    }else if (parada==2){
                        kilometros_recorridos=kilometros_recorridos+marsella_a_lacelia;
                    }else if (parada==3){
                        kilometros_recorridos=kilometros_recorridos+marsella_a_lavirginia;
                    }else if (parada==4){
                        kilometros_recorridos=kilometros_recorridos+marsella_a_marsella;
                    }else if (parada==5){
                        kilometros_recorridos=kilometros_recorridos+marsella_a_mistrato;
                    }
                    kilometros_recorridos=kilometros_recorridos;
                    System.out.println(" Kilometros Recorridos "+kilometros_recorridos);

                }
            }else if (origen==5){
                for (int j=1 ; j<cant_paradas ; j++){
                    System.out.println(" => Donde sera su parada "+j+ " : ");
                    System.out.println(" 1. Guatica ");
                    System.out.println(" 2. La Celia ");
                    System.out.println(" 3. La Virginia ");
                    System.out.println(" 4. Marsella ");
                    System.out.println(" 5. Mistrato ");
                    int parada = entrada.nextInt();

                     if (parada==1){
                        kilometros_recorridos=kilometros_recorridos+mistrato_a_guatica;
                    }else if (parada==2){
                        kilometros_recorridos=kilometros_recorridos+mistrato_a_lacelia;
                    }else if (parada==3){
                        kilometros_recorridos=kilometros_recorridos+mistrato_a_lavirginia;
                    }else if (parada==4){
                        kilometros_recorridos=kilometros_recorridos+mistrato_a_marsella;
                    }else if (parada==5){
                        kilometros_recorridos=kilometros_recorridos+mistrato_a_mistrato;
                    }
                    kilometros_recorridos=kilometros_recorridos;
                    System.out.println(" Kilometros Recorridos "+kilometros_recorridos);

                }
            }
            double valor_gasolina = (double)litros_gasolina/(double)kilometros_recorridos;
            double total_gasolina = valor_gasolina* (double)precio_litro;
            System.out.println (" Este es el valor de la gasolina que se va a gastar "+valor_gasolina);


        }

    }
}