import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner entrada_numero = new Scanner(System.in);
        Scanner entrada_texto = new Scanner(System.in);

        int pos_disponible = 0;
        int opcion = 0;
        Persona arreglo[] = new Persona[100];

        do {

            System.out.println(" --------------------------- ");
            System.out.println(" -- PERSONAS --");
            System.out.println(" -- PERSONAS REGISTRADAS " + pos_disponible + " -|| ");
            System.out.println(" 1. REGISTRAR PERSONA ");
            System.out.println(" 2. VER LISTA DE PERSONAS ");
            System.out.println(" 3. ORDERNAR LISTA DE PERSONAS ");
            System.out.println(" 4. SALIR ");
            System.out.println(" --------------------------- ");
            System.out.println(" Ingrese una opcion ");
            opcion = entrada_numero.nextInt();

            if (opcion == 1) {

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

                Persona temporal = new Persona(documento, nombre, apellidos, direccion, telefono, email);

                boolean valido = true;

                for (int i = 0; i < pos_disponible; i++) {

                    if (documento == arreglo[i].getDocumento()) {
                        valido = false;
                        break;
                    }

                }

                if (valido) {
                    arreglo[pos_disponible] = temporal;
                    pos_disponible++;
                    System.out.println(" Registro Exitoso: ");
                } else {
                    System.out.println(" El documento ya existe ");
                }

            } else if (opcion == 2) {

                for (int i = 0; i < arreglo.length; i++) {

                    if (arreglo[i] != null) {
                        arreglo[i].mostrarDatosPersonales();
                    }
                    System.out.println("\n\n");

                }

            } else if (opcion == 3) {

                for (int i = 0; i < arreglo.length - 1; i++) {
                    for (int j = 0; j < arreglo.length - 1; j++) {
                        if (arreglo[j] != null && arreglo[j + 1] != null) {
                            if (arreglo[j].getDocumento() > arreglo[j + 1].getDocumento()) {
                                Persona aux = arreglo[j];
                                arreglo[j] = arreglo[j + 1];
                                arreglo[j + 1] = aux;
                            }
                        }
                    }
                }

            } else if (opcion == 4) {
                System.out.println(" --------- SALIENDO ------------ ");
            } else {
                System.out.println(" ------------------------ ");
                System.out.println(" ----- INVALIDO ------------- ");
                System.out.println(" ------------------------ ");
            }

        } while (opcion != 4);

    }

}
