import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        System.out.println("=> Ingrese las veces que desea calcular: ");
        int veces = entrada.nextInt();

        System.out.print("=> Cuantos kilometros se gasta el carro por un litro de gasolina?: ");
        int litros = entrada.nextInt();

        System.out.println("=> Ingrese cual es el precio del litro de gasolina: ");
        int precio_litro = entrada.nextInt();

        double kilometros=0;

        for(int i=0; i<=veces; i++){
            System.out.println("=> Ingrese una ciudad de origen: ");
            System.out.println("1-Apia");
            System.out.println("2-Balboa");
            System.out.println("3-Belen de Umbria");
            System.out.println("4-Dosquebradas");
            System.out.println("5-Guatica");
            System.out.println("6-La celia");
            System.out.println("7-La Virginia");
            System.out.println("8-Marsella");
            System.out.println("9-Mistrató");
            System.out.println("10-Pereira");
            System.out.println("11-Pueblo Rico");
            System.out.println("12-Quinchia");
            System.out.println("13-Santa Rosa de Cabal");
            System.out.println("14-Santuario");
            int origen = entrada.nextInt();

            System.out.println("Cuantas paradas hará? :");
            int Cant_paradas = entrada.nextInt();

            if(origen==1){
                for(int j = 1; j <= Cant_paradas; j++){
                    System.out.println("Donde sera su parada "+j+" :");
                    System.out.println("1-Apia");
                    System.out.println("2-Balboa");
                    System.out.println("3-Belen de Umbria");
                    System.out.println("4-Dosquebradas");
                    System.out.println("5-Guatica");
                    System.out.println("6-La celia");
                    System.out.println("7-La Virginia");
                    System.out.println("8-Marsella");
                    System.out.println("9-Mistrató");
                    System.out.println("10-Pereira");
                    System.out.println("11-Pueblo Rico");
                    System.out.println("12-Quinchia");
                    System.out.println("13-Santa Rosa de Cabal");
                    System.out.println("14-Santuario");
                    int parada = entrada.nextInt();
                    if(parada==1){
                        kilometros=kilometros+5.0;
                    }else if(parada==2){
                        kilometros=kilometros+39.8;
                    }else if(parada==3){
                        kilometros=kilometros+39.5;
                    }else if(parada==4){
                        kilometros=kilometros+68.9;
                    }else if(parada==5){
                        kilometros=kilometros+58.7;
                    }else if(parada==6){
                        kilometros=kilometros+24.1;
                    }else if(parada==7){
                        kilometros=kilometros+34.9;
                    }else if(parada==8){
                        kilometros=kilometros+88.1;
                    }else if(parada==9){
                        kilometros=kilometros+55.6;
                    }else if(parada==10){
                        kilometros=kilometros+65.7;
                    }else if(parada==11){
                        kilometros=kilometros+26.4;
                    }else if(parada==12){
                        kilometros=kilometros+77.4;
                    }else if(parada==13){
                        kilometros=kilometros+77.8;
                    }else if(parada==14){
                        kilometros=kilometros+15.3;
                    }
                    kilometros=kilometros;
                    System.out.println("Kilometros recorridos: "+kilometros);
                }
                kilometros=0;
            }else if(origen==2){
                for(int j = 1; j <= Cant_paradas; j++){
                    System.out.println("Donde sera su parada "+j+" :");
                    System.out.println("1-Apia");
                    System.out.println("2-Balboa");
                    System.out.println("3-Belen de Umbria");
                    System.out.println("4-Dosquebradas");
                    System.out.println("5-Guatica");
                    System.out.println("6-La celia");
                    System.out.println("7-La Virginia");
                    System.out.println("8-Marsella");
                    System.out.println("9-Mistrató");
                    System.out.println("10-Pereira");
                    System.out.println("11-Pueblo Rico");
                    System.out.println("12-Quinchia");
                    System.out.println("13-Santa Rosa de Cabal");
                    System.out.println("14-Santuario");
                    int parada = entrada.nextInt();
                    if(parada==1){
                        kilometros=kilometros+39.8;
                    }else if(parada==2){
                        kilometros=kilometros+5.0;
                    }else if(parada==3){
                        kilometros=kilometros+56.9;
                    }else if(parada==4){
                        kilometros=kilometros+52.9;
                    }else if(parada==5){
                        kilometros=kilometros+76.1;
                    }else if(parada==6){
                        kilometros=kilometros+13.7;
                    }else if(parada==7){
                        kilometros=kilometros+18.9;
                    }else if(parada==8){
                        kilometros=kilometros+72.1;
                    }else if(parada==9){
                        kilometros=kilometros+73.0;
                    }else if(parada==10){
                        kilometros=kilometros+49.7;
                    }else if(parada==11){
                        kilometros=kilometros+64.8;
                    }else if(parada==12){
                        kilometros=kilometros+94.8;
                    }else if(parada==13){
                        kilometros=kilometros+61.9;
                    }else if(parada==14){
                        kilometros=kilometros+38.3;
                    }
                    kilometros=kilometros;
                    System.out.println("Kilometros recorridos: "+kilometros);
                }
                kilometros=0;
            }else if(origen==3){
                for(int j = 1; j <= Cant_paradas; j++){
                    System.out.println("Donde sera su parada "+j+" :");
                    System.out.println("1-Apia");
                    System.out.println("2-Balboa");
                    System.out.println("3-Belen de Umbria");
                    System.out.println("4-Dosquebradas");
                    System.out.println("5-Guatica");
                    System.out.println("6-La celia");
                    System.out.println("7-La Virginia");
                    System.out.println("8-Marsella");
                    System.out.println("9-Mistrató");
                    System.out.println("10-Pereira");
                    System.out.println("11-Pueblo Rico");
                    System.out.println("12-Quinchia");
                    System.out.println("13-Santa Rosa de Cabal");
                    System.out.println("14-Santuario");
                    int parada = entrada.nextInt();
                    if(parada==1){
                        kilometros=kilometros+39.5;
                    }else if(parada==2){
                        kilometros=kilometros+56.9;
                    }else if(parada==3){
                        kilometros=kilometros+5.0;
                    }else if(parada==4){
                        kilometros=kilometros+74.6;
                    }else if(parada==5){
                        kilometros=kilometros+25.1;
                    }else if(parada==6){
                        kilometros=kilometros+71.9;
                    }else if(parada==7){
                        kilometros=kilometros+40.8;
                    }else if(parada==8){
                        kilometros=kilometros+93.8;
                    }else if(parada==9){
                        kilometros=kilometros+16.3;
                    }else if(parada==10){
                        kilometros=kilometros+71.4;
                    }else if(parada==11){
                        kilometros=kilometros+65.4;
                    }else if(parada==12){
                        kilometros=kilometros+52.4;
                    }else if(parada==13){
                        kilometros=kilometros+83.6;
                    }else if(parada==14){
                        kilometros=kilometros+71.4;
                    }
                    kilometros=kilometros;
                    System.out.println("Kilometros recorridos: "+kilometros);
                }
                kilometros=0;
            }else if(origen==4){
                for(int j = 1; j <= Cant_paradas; j++){
                    System.out.println("Donde sera su parada "+j+" :");
                    System.out.println("1-Apia");
                    System.out.println("2-Balboa");
                    System.out.println("3-Belen de Umbria");
                    System.out.println("4-Dosquebradas");
                    System.out.println("5-Guatica");
                    System.out.println("6-La celia");
                    System.out.println("7-La Virginia");
                    System.out.println("8-Marsella");
                    System.out.println("9-Mistrató");
                    System.out.println("10-Pereira");
                    System.out.println("11-Pueblo Rico");
                    System.out.println("12-Quinchia");
                    System.out.println("13-Santa Rosa de Cabal");
                    System.out.println("14-Santuario");
                    int parada = entrada.nextInt();
                    if(parada==1){
                        kilometros=kilometros+67.5;
                    }else if(parada==2){
                        kilometros=kilometros+51.5;
                    }else if(parada==3){
                        kilometros=kilometros+73.1;
                    }else if(parada==4){
                        kilometros=kilometros+5.0;
                    }else if(parada==5){
                        kilometros=kilometros+92.3;
                    }else if(parada==6){
                        kilometros=kilometros+66.6;
                    }else if(parada==7){
                        kilometros=kilometros+32.5;
                    }else if(parada==8){
                        kilometros=kilometros+34.4;
                    }else if(parada==9){
                        kilometros=kilometros+89.3;
                    }else if(parada==10){
                        kilometros=kilometros+2.4;
                    }else if(parada==11){
                        kilometros=kilometros+92.5;
                    }else if(parada==12){
                        kilometros=kilometros+93.9;
                    }else if(parada==13){
                        kilometros=kilometros+12.4;
                    }else if(parada==14){
                        kilometros=kilometros+66.0;
                    }
                    kilometros=kilometros;
                    System.out.println("Kilometros recorridos: "+kilometros);
                }
                kilometros=0;
            }else if(origen==5){
                for(int j = 1; j <= Cant_paradas; j++){
                    System.out.println("Donde sera su parada "+j+" :");
                    System.out.println("1-Apia");
                    System.out.println("2-Balboa");
                    System.out.println("3-Belen de Umbria");
                    System.out.println("4-Dosquebradas");
                    System.out.println("5-Guatica");
                    System.out.println("6-La celia");
                    System.out.println("7-La Virginia");
                    System.out.println("8-Marsella");
                    System.out.println("9-Mistrató");
                    System.out.println("10-Pereira");
                    System.out.println("11-Pueblo Rico");
                    System.out.println("12-Quinchia");
                    System.out.println("13-Santa Rosa de Cabal");
                    System.out.println("14-Santuario");
                    int parada = entrada.nextInt();
                    if(parada==1){
                        kilometros=kilometros+58.7;
                    }else if(parada==2){
                        kilometros=kilometros+76.1;
                    }else if(parada==3){
                        kilometros=kilometros+25.1;
                    }else if(parada==4){
                        kilometros=kilometros+93.8;
                    }else if(parada==5){
                        kilometros=kilometros+5.0;
                    }else if(parada==6){
                        kilometros=kilometros+91.1;
                    }else if(parada==7){
                        kilometros=kilometros+60.0;
                    }else if(parada==8){
                        kilometros=kilometros+98.5;
                    }else if(parada==9){
                        kilometros=kilometros+25.1;
                    }else if(parada==10){
                        kilometros=kilometros+90.6;
                    }else if(parada==11){
                        kilometros=kilometros+84.8;
                    }else if(parada==12){
                        kilometros=kilometros+22.9;
                    }else if(parada==13){
                        kilometros=kilometros+85.5;
                    }else if(parada==14){
                        kilometros=kilometros+73.4;
                    }
                    kilometros=kilometros;
                    System.out.println("Kilometros recorridos: "+kilometros);
                }
                kilometros=0;
            }else if(origen==6){
                for(int j = 1; j <= Cant_paradas; j++){
                    System.out.println("Donde sera su parada "+j+" :");
                    System.out.println("1-Apia");
                    System.out.println("2-Balboa");
                    System.out.println("3-Belen de Umbria");
                    System.out.println("4-Dosquebradas");
                    System.out.println("5-Guatica");
                    System.out.println("6-La celia");
                    System.out.println("7-La Virginia");
                    System.out.println("8-Marsella");
                    System.out.println("9-Mistrató");
                    System.out.println("10-Pereira");
                    System.out.println("11-Pueblo Rico");
                    System.out.println("12-Quinchia");
                    System.out.println("13-Santa Rosa de Cabal");
                    System.out.println("14-Santuario");
                    int parada = entrada.nextInt();
                    if(parada==1){
                        kilometros=kilometros+24.1;
                    }else if(parada==2){
                        kilometros=kilometros+13.7;
                    }else if(parada==3){
                        kilometros=kilometros+71.9;
                    }else if(parada==4){
                        kilometros=kilometros+67.9;
                    }else if(parada==5){
                        kilometros=kilometros+91.1;
                    }else if(parada==6){
                        kilometros=kilometros+5.0;
                    }else if(parada==7){
                        kilometros=kilometros+33.9;
                    }else if(parada==8){
                        kilometros=kilometros+87.2;
                    }else if(parada==9){
                        kilometros=kilometros+88.1;
                    }else if(parada==10){
                        kilometros=kilometros+64.7;
                    }else if(parada==11){
                        kilometros=kilometros+49.1;
                    }else if(parada==12){
                        kilometros=kilometros+110.0;
                    }else if(parada==13){
                        kilometros=kilometros+76.9;
                    }else if(parada==14){
                        kilometros=kilometros+22.6;
                    }
                    kilometros=kilometros;
                    System.out.println("Kilometros recorridos: "+kilometros);

                }
                kilometros=0;
            }else if(origen==7){
                for(int j = 1; j <= Cant_paradas; j++){
                    System.out.println("Donde sera su parada "+j+" :");
                    System.out.println("1-Apia");
                    System.out.println("2-Balboa");
                    System.out.println("3-Belen de Umbria");
                    System.out.println("4-Dosquebradas");
                    System.out.println("5-Guatica");
                    System.out.println("6-La celia");
                    System.out.println("7-La Virginia");
                    System.out.println("8-Marsella");
                    System.out.println("9-Mistrató");
                    System.out.println("10-Pereira");
                    System.out.println("11-Pueblo Rico");
                    System.out.println("12-Quinchia");
                    System.out.println("13-Santa Rosa de Cabal");
                    System.out.println("14-Santuario");
                    int parada = entrada.nextInt();
                    if(parada==1){
                        kilometros=kilometros+35.0;
                    }else if(parada==2){
                        kilometros=kilometros+19.0;
                    }else if(parada==3){
                        kilometros=kilometros+40.8;
                    }else if(parada==4){
                        kilometros=kilometros+34.0;
                    }else if(parada==5){
                        kilometros=kilometros+60.0;
                    }else if(parada==6){
                        kilometros=kilometros+34.0;
                    }else if(parada==7){
                        kilometros=kilometros+5.0;
                    }else if(parada==8){
                        kilometros=kilometros+53.3;
                    }else if(parada==9){
                        kilometros=kilometros+56.9;
                    }else if(parada==10){
                        kilometros=kilometros+30.8;
                    }else if(parada==11){
                        kilometros=kilometros+60.0;
                    }else if(parada==12){
                        kilometros=kilometros+78.7;
                    }else if(parada==13){
                        kilometros=kilometros+43.0;
                    }else if(parada==14){
                        kilometros=kilometros+33.5;
                    }
                    kilometros=kilometros;
                    System.out.println("Kilometros recorridos: "+kilometros);
                }
                kilometros=0;
            }else if(origen==8){
                for(int j = 1; j <= Cant_paradas; j++){
                    System.out.println("Donde sera su parada "+j+" :");
                    System.out.println("1-Apia");
                    System.out.println("2-Balboa");
                    System.out.println("3-Belen de Umbria");
                    System.out.println("4-Dosquebradas");
                    System.out.println("5-Guatica");
                    System.out.println("6-La celia");
                    System.out.println("7-La Virginia");
                    System.out.println("8-Marsella");
                    System.out.println("9-Mistrató");
                    System.out.println("10-Pereira");
                    System.out.println("11-Pueblo Rico");
                    System.out.println("12-Quinchia");
                    System.out.println("13-Santa Rosa de Cabal");
                    System.out.println("14-Santuario");
                    int parada = entrada.nextInt();
                    if(parada==1){
                        kilometros=kilometros+88.0;
                    }else if(parada==2){
                        kilometros=kilometros+72.0;
                    }else if(parada==3){
                        kilometros=kilometros+93.6;
                    }else if(parada==4){
                        kilometros=kilometros+35.8;
                    }else if(parada==5){
                        kilometros=kilometros+98.4;
                    }else if(parada==6){
                        kilometros=kilometros+87.0;
                    }else if(parada==7){
                        kilometros=kilometros+53.0;
                    }else if(parada==8){
                        kilometros=kilometros+5.0;
                    }else if(parada==9){
                        kilometros=kilometros+110.0;
                    }else if(parada==10){
                        kilometros=kilometros+32.9;
                    }else if(parada==11){
                        kilometros=kilometros+113.0;
                    }else if(parada==12){
                        kilometros=kilometros+96.6;
                    }else if(parada==13){
                        kilometros=kilometros+44.7;
                    }else if(parada==14){
                        kilometros=kilometros+86.5;
                    }
                    kilometros=kilometros;
                    System.out.println("Kilometros recorridos: "+kilometros);
                }
                kilometros=0;
            }else if(origen==9){
                for(int j = 1; j <= Cant_paradas; j++){
                    System.out.println("Donde sera su parada "+j+" :");
                    System.out.println("1-Apia");
                    System.out.println("2-Balboa");
                    System.out.println("3-Belen de Umbria");
                    System.out.println("4-Dosquebradas");
                    System.out.println("5-Guatica");
                    System.out.println("6-La celia");
                    System.out.println("7-La Virginia");
                    System.out.println("8-Marsella");
                    System.out.println("9-Mistrató");
                    System.out.println("10-Pereira");
                    System.out.println("11-Pueblo Rico");
                    System.out.println("12-Quinchia");
                    System.out.println("13-Santa Rosa de Cabal");
                    System.out.println("14-Santuario");
                    int parada = entrada.nextInt();
                    if(parada==1){
                        kilometros=kilometros+55.7;
                    }else if(parada==2){
                        kilometros=kilometros+73.1;
                    }else if(parada==3){
                        kilometros=kilometros+16.3;
                    }else if(parada==4){
                        kilometros=kilometros+90.8;
                    }else if(parada==5){
                        kilometros=kilometros+25.1;
                    }else if(parada==6){
                        kilometros=kilometros+88.1;
                    }else if(parada==7){
                        kilometros=kilometros+57.0;
                    }else if(parada==8){
                        kilometros=kilometros+110.0;
                    }else if(parada==9){
                        kilometros=kilometros+5.0;
                    }else if(parada==10){
                        kilometros=kilometros+87.6;
                    }else if(parada==11){
                        kilometros=kilometros+81.7;
                    }else if(parada==12){
                        kilometros=kilometros+53.6;
                    }else if(parada==13){
                        kilometros=kilometros+99.8;
                    }else if(parada==14){
                        kilometros=kilometros+70.4;
                    }
                    kilometros=kilometros;
                    System.out.println("Kilometros recorridos: "+kilometros);
                }
                kilometros=0;
            }else if(origen==10){
                for(int j = 1; j <= Cant_paradas; j++){
                    System.out.println("Donde sera su parada "+j+" :");
                    System.out.println("1-Apia");
                    System.out.println("2-Balboa");
                    System.out.println("3-Belen de Umbria");
                    System.out.println("4-Dosquebradas");
                    System.out.println("5-Guatica");
                    System.out.println("6-La celia");
                    System.out.println("7-La Virginia");
                    System.out.println("8-Marsella");
                    System.out.println("9-Mistrató");
                    System.out.println("10-Pereira");
                    System.out.println("11-Pueblo Rico");
                    System.out.println("12-Quinchia");
                    System.out.println("13-Santa Rosa de Cabal");
                    System.out.println("14-Santuario");
                    int parada = entrada.nextInt();
                    if(parada==1){
                        kilometros=kilometros+65.7;
                    }else if(parada==2){
                        kilometros=kilometros+49.8;
                    }else if(parada==3){
                        kilometros=kilometros+71.3;
                    }else if(parada==4){
                        kilometros=kilometros+2.4;
                    }else if(parada==5){
                        kilometros=kilometros+90.5;
                    }else if(parada==6){
                        kilometros=kilometros+64.8;
                    }else if(parada==7){
                        kilometros=kilometros+30.7;
                    }else if(parada==8){
                        kilometros=kilometros+33.0;
                    }else if(parada==9){
                        kilometros=kilometros+87.5;
                    }else if(parada==10){
                        kilometros=kilometros+5.0;
                    }else if(parada==11){
                        kilometros=kilometros+90.7;
                    }else if(parada==12){
                        kilometros=kilometros+95.8;
                    }else if(parada==13){
                        kilometros=kilometros+14.3;
                    }else if(parada==14){
                        kilometros=kilometros+64.2;
                    }
                    kilometros=kilometros;
                    System.out.println("Kilometros recorridos: "+kilometros);
                }
                kilometros=0;
            }else if(origen==11){
                for(int j = 1; j <= Cant_paradas; j++){
                    System.out.println("Donde sera su parada "+j+" :");
                    System.out.println("1-Apia");
                    System.out.println("2-Balboa");
                    System.out.println("3-Belen de Umbria");
                    System.out.println("4-Dosquebradas");
                    System.out.println("5-Guatica");
                    System.out.println("6-La celia");
                    System.out.println("7-La Virginia");
                    System.out.println("8-Marsella");
                    System.out.println("9-Mistrató");
                    System.out.println("10-Pereira");
                    System.out.println("11-Pueblo Rico");
                    System.out.println("12-Quinchia");
                    System.out.println("13-Santa Rosa de Cabal");
                    System.out.println("14-Santuario");
                    int parada = entrada.nextInt();
                    if(parada==1){
                        kilometros=kilometros+26.2;
                    }else if(parada==2){
                        kilometros=kilometros+64.6;
                    }else if(parada==3){
                        kilometros=kilometros+65.5;
                    }else if(parada==4){
                        kilometros=kilometros+93.7;
                    }else if(parada==5){
                        kilometros=kilometros+84.5;
                    }else if(parada==6){
                        kilometros=kilometros+48.9;
                    }else if(parada==7){
                        kilometros=kilometros+59.7;
                    }else if(parada==8){
                        kilometros=kilometros+113.0;
                    }else if(parada==9){
                        kilometros=kilometros+81.5;
                    }else if(parada==10){
                        kilometros=kilometros+90.5;
                    }else if(parada==11){
                        kilometros=kilometros+5.0;
                    }else if(parada==12){
                        kilometros=kilometros+103.0;
                    }else if(parada==13){
                        kilometros=kilometros+103.0;
                    }else if(parada==14){
                        kilometros=kilometros+34.3;
                    }
                    kilometros=kilometros;
                    System.out.println("Kilometros recorridos: "+kilometros);
                }
                kilometros=0;
            }else if(origen==12){
                for(int j = 1; j <= Cant_paradas; j++){
                    System.out.println("Donde sera su parada "+j+" :");
                    System.out.println("1-Apia");
                    System.out.println("2-Balboa");
                    System.out.println("3-Belen de Umbria");
                    System.out.println("4-Dosquebradas");
                    System.out.println("5-Guatica");
                    System.out.println("6-La celia");
                    System.out.println("7-La Virginia");
                    System.out.println("8-Marsella");
                    System.out.println("9-Mistrató");
                    System.out.println("10-Pereira");
                    System.out.println("11-Pueblo Rico");
                    System.out.println("12-Quinchia");
                    System.out.println("13-Santa Rosa de Cabal");
                    System.out.println("14-Santuario");
                    int parada = entrada.nextInt();
                    if(parada==1){
                        kilometros=kilometros+77.4;
                    }else if(parada==2){
                        kilometros=kilometros+94.7;
                    }else if(parada==3){
                        kilometros=kilometros+52.4;
                    }else if(parada==4){
                        kilometros=kilometros+91.9;
                    }else if(parada==5){
                        kilometros=kilometros+22.8;
                    }else if(parada==6){
                        kilometros=kilometros+110.0;
                    }else if(parada==7){
                        kilometros=kilometros+78.7;
                    }else if(parada==8){
                        kilometros=kilometros+96.2;
                    }else if(parada==9){
                        kilometros=kilometros+57.9;
                    }else if(parada==10){
                        kilometros=kilometros+93.8;
                    }else if(parada==11){
                        kilometros=kilometros+103.0;
                    }else if(parada==12){
                        kilometros=kilometros+5.0;
                    }else if(parada==13){
                        kilometros=kilometros+83.2;
                    }else if(parada==14){
                        kilometros=kilometros+109.0;
                    }
                    kilometros=kilometros;
                    System.out.println("Kilometros recorridos: "+kilometros);
                }
                kilometros=0;
            }else if(origen==13){
                for(int j = 1; j <= Cant_paradas; j++){
                    System.out.println("Donde sera su parada "+j+" :");
                    System.out.println("1-Apia");
                    System.out.println("2-Balboa");
                    System.out.println("3-Belen de Umbria");
                    System.out.println("4-Dosquebradas");
                    System.out.println("5-Guatica");
                    System.out.println("6-La celia");
                    System.out.println("7-La Virginia");
                    System.out.println("8-Marsella");
                    System.out.println("9-Mistrató");
                    System.out.println("10-Pereira");
                    System.out.println("11-Pueblo Rico");
                    System.out.println("12-Quinchia");
                    System.out.println("13-Santa Rosa de Cabal");
                    System.out.println("14-Santuario");
                    int parada = entrada.nextInt();
                    if(parada==1){
                        kilometros=kilometros+76.7;
                    }else if(parada==2){
                        kilometros=kilometros+60.8;
                    }else if(parada==3){
                        kilometros=kilometros+82.6;
                    }else if(parada==4){
                        kilometros=kilometros+10.3;
                    }else if(parada==5){
                        kilometros=kilometros+85.4;
                    }else if(parada==6){
                        kilometros=kilometros+75.8;
                    }else if(parada==7){
                        kilometros=kilometros+41.7;
                    }else if(parada==8){
                        kilometros=kilometros+43.6;
                    }else if(parada==9){
                        kilometros=kilometros+98.5;
                    }else if(parada==10){
                        kilometros=kilometros+12.3;
                    }else if(parada==11){
                        kilometros=kilometros+102.0;
                    }else if(parada==12){
                        kilometros=kilometros+83.5;
                    }else if(parada==13){
                        kilometros=kilometros+5.0;
                    }else if(parada==14){
                        kilometros=kilometros+75.2;
                    }
                    kilometros=kilometros;
                    System.out.println("Kilometros recorridos: "+kilometros);
                }
                kilometros=0;
            }else if(origen==14){
                for(int j = 1; j <= Cant_paradas; j++){
                    System.out.println("Donde sera su parada "+j+" :");
                    System.out.println("1-Apia");
                    System.out.println("2-Balboa");
                    System.out.println("3-Belen de Umbria");
                    System.out.println("4-Dosquebradas");
                    System.out.println("5-Guatica");
                    System.out.println("6-La celia");
                    System.out.println("7-La Virginia");
                    System.out.println("8-Marsella");
                    System.out.println("9-Mistrató");
                    System.out.println("10-Pereira");
                    System.out.println("11-Pueblo Rico");
                    System.out.println("12-Quinchia");
                    System.out.println("13-Santa Rosa de Cabal");
                    System.out.println("14-Santuario");
                    int parada = entrada.nextInt();
                    if(parada==1){
                        kilometros=kilometros+15.3;
                    }else if(parada==2){
                        kilometros=kilometros+38.3;
                    }else if(parada==3){
                        kilometros=kilometros+71.4;
                    }else if(parada==4){
                        kilometros=kilometros+67.4;
                    }else if(parada==5){
                        kilometros=kilometros+73.5;
                    }else if(parada==6){
                        kilometros=kilometros+22.6;
                    }else if(parada==7){
                        kilometros=kilometros+33.4;
                    }else if(parada==8){
                        kilometros=kilometros+86.6;
                    }else if(parada==9){
                        kilometros=kilometros+70.5;
                    }else if(parada==10){
                        kilometros=kilometros+64.2;
                    }else if(parada==11){
                        kilometros=kilometros+34.5;
                    }else if(parada==12){
                        kilometros=kilometros+109.0;
                    }else if(parada==13){
                        kilometros=kilometros+76.4;
                    }else if(parada==14){
                        kilometros=kilometros+5.0;
                    }
                    kilometros=kilometros;
                    System.out.println("Kilometros recorridos: "+kilometros);
                }
                kilometros=0;
            }
            double valor_gasolina=(double)litros/(double)kilometros;
            double total=valor_gasolina*precio_litro;
            System.out.println("Este es el valor de la gasolina que va a gastar en el viaje: "+valor_gasolina);
        }
    }
    
}
