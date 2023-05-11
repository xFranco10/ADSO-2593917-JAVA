import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args){

        Scanner entrada_numero = new Scanner(System.in);
        Scanner entrada_texto = new Scanner(System.in);

        int pos_disponible=0;
        int opcion=0;
        Seccion_Clientes arreglo [] = new Seccion_Clientes [100];

        do{
            System.out.println(" ---------------------------------------- ");
            System.out.println(" ------------ Seccion Clientes ----------- ");
            System.out.println(" ---------------------------------------- ");
            System.out.println(" ------------------ Clientes Registrados "+pos_disponible+" || ");
            System.out.println(" ");
            System.out.println(" 1. Registrar Cliente ");
            System.out.println(" 2. Ver Clientes Registrados ");
            System.out.println(" 3. Modificar Informacion de cliente ");
            System.out.println(" 4. Ver Informacion Cliente ");
            System.out.println(" 5. Eliminar Cliente ");
            System.out.println(" 6. Salir");
            opcion = entrada_numero.nextInt();

            if(opcion==1){

                System.out.println(" Ingrese aqui el documento: ");
                int documento = entrada_numero.nextInt();

                System.out.println(" Ingrese aqui el nombre: ");
                String nombre = entrada_texto.nextLine();

                System.out.println(" Ingrese aqui el apellido: ");
                String apellidos = entrada_texto.nextLine();

                System.out.println(" Ingrese aqui la direccion ");
                String direccion = entrada_texto.nextLine();

                System.out.println(" Ingrese aqui el telefono: ");
                int telefono = entrada_numero.nextInt();

                System.out.println(" Ingrese aqui el Email: ");
                String email = entrada_texto.nextLine();

                Seccion_Clientes temporal = new Seccion_Clientes(documento, nombre, apellidos, direccion, telefono, email);

                boolean valido = true;

                for (int i = 0; i < pos_disponible; i++) {
                    if (documento == arreglo[i].getDocumento()) {
                        valido = false;
                        break;
                    }
                }

                if (valido) {
                    arreglo[pos_disponible]=temporal;
                    pos_disponible++;
                    System.out.println(" ====== Registro Exitoso ============= ");
                } else {
                    System.out.println("======= El documento ya existe ========= ");
                }

            }else if(opcion == 2){
                for (int i = 0; i < pos_disponible; i++) {
                    arreglo[i].mostrarClientesRegistrados();
                }

            }else if(opcion==3){
                //Mostramos todos los datos de todos los clientes registrados
                for (int i = 0; i < pos_disponible; i++) {
                    arreglo[i].mostrarClientesRegistrados();
                }

                System.out.println("Ingrese aqui el documento del cliente que desea modificar datoss ");
                int documento_modificar = entrada_numero.nextInt();

                for (int j=0;j<pos_disponible;j++){
                    //Hacemos la condicion de que si documento que desea modificar es el mismo documento del documento del cliente, entre a la condicion
                    if(documento_modificar == arreglo[j].getDocumento()){
                        //Pedimos el dato especifico que desea modificar con el ciclo do while para poder salir
                        int dato_modificar=0;
                        do{
                            
                            System.out.println(" Ingrese aqui el dato a modificar ");
                            System.out.println("1. Documento: ");
                            System.out.println("2. Nombre: ");
                            System.out.println("3. apellido: ");
                            System.out.println("5. Salir ");
                            dato_modificar = entrada_numero.nextInt();

                            if(dato_modificar==1){
                                //Pedimos el documento nuevo
                                System.out.print("Ingrese el documento nuevo");
                                int nuevo_document = entrada_numero.nextInt();
                                //Creamos una variable y almacenamos el nuevo documento en esa variable
                                int guardar_documento=nuevo_document;
                                //Creamos un booleano para saber si el documento de todos los clientes registrados ya existe o no
                                boolean correcto = false;
                            
                                for(int p = 0;p<pos_disponible;p++){
                                    //Miramos con esta condicion, comparamos con el documento nuevo y con todos los documentos de los clientes para saber si el documento ya existe
                                    if(guardar_documento==arreglo[p].getDocumento()){
                                        //en caso tal de que cumpla la condicion, el documento ya existe, "INVALIDO"
                                        correcto=true;
                                    }
                                }
                                if(correcto==true){
                                    //El documento ya fue registrado, entonces rompemos el ciclo para que ingrese otro documento
                                    System.out.println("==== INVALIDO, EL DOCUMENTO YA FUE REGISTRADO ===== ");
                                    break;
                                }else{
                                    //Si el documento no es el mismo a los otros clientes, lo modificamos, SE ALMACENA
                                    arreglo[j].setDocumento(nuevo_document);
                                }
                            }else if(dato_modificar==2){
                                //Pedimos nuevo nombre a modificar
                                System.out.print("Ingrese aqui el nuevo nombre: ");
                                String nuevo_nombre =entrada_texto.nextLine();
                                //Lo modificamos
                                arreglo[j].setNombres(nuevo_nombre);
                            }else if(dato_modificar==3){
                                System.out.print("Ingrese aqui el nuevo apellido: ");
                                String nuevo_apellido =entrada_texto.nextLine();
                                //Lo modificamos y lo almacenamos
                                arreglo[j].setApellidos(nuevo_apellido);
                            }



                            
                            


                        }while(dato_modificar!=5);
                    }


                    
                }
                    
                
                

                

                

            }else if(opcion==4){
                //Vemos todos los clientes registrados
                for (int i = 0; i < pos_disponible; i++) {
                    arreglo[i].mostrarClientesRegistrados();
                }
                //Preguntamos que usuario desea ver por medio del documento
                System.out.println("Ingrese aqui el documento del cliente para ver su informacion: ");
                int ver_cliente = entrada_numero.nextInt();

                //Ciclo para el arreglo y comparamos si es igual entonces que muestre el metodo de mostrar personas y listo
                for (int i=0;i<pos_disponible;i++){
                    if(ver_cliente==arreglo[i].getDocumento()){
                        arreglo[i].mostrarClientesRegistrados();
                    }else{
                        System.out.println(" =========== DOCUMENTO MAL INGRESADO  =============");
                        break;
                    }
                }


            }else if(opcion==5){

                //Vemos todos los clientes registrados
                for (int i = 0; i < pos_disponible; i++) {
                    arreglo[i].mostrarClientesRegistrados();
                }
                
                //Pedimos al usuario que ingrese el documento del cliente que desea eliminar
                System.out.println(" ");
                System.out.println("Ingrese aqui el documento del cliente que desea eliminar ");
                int cliente_eliminar = entrada_numero.nextInt();
                
                //Ciclo para buscar y eliminar el cliente
                //Este aux es Para guardar la posicion actual en la que esta el documento del cliente
                int aux=0;
                for(int i=0;i<pos_disponible;i++){
                    //Se compara, si es igual que se almacena la posicion del documento
                    if(cliente_eliminar==arreglo[i].getDocumento()){
                        aux=i;
                        //Para disminuir
                        pos_disponible--;
                    }
                }

                //Este ciclo es para correr todo a la izquierda y se elimina
                for(int j=aux;j<arreglo.length-1;j++){
                    arreglo[j]=arreglo[j+1];
                }

                if(pos_disponible==0){
                    System.out.println(" ========= USUARIOS ELIMINADOS ========== ");
                }

                






            }

        }while(opcion!=6);
    }
}