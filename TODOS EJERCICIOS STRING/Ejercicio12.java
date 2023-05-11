import java.util.Scanner;

public class Ejercicio5{
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese aqui la cantidad de personas ");
        int cant_personas = entrada.nextInt();

        String [] nombres_personas_total = new String[cant_personas];
        String [] genero_persona_total = new String[cant_personas];

        for (int i=0 ; i<cant_personas ; i++){

            System.out.println("Ingrese aqui el nombre de la persona "+i);
            String nombres_personas = entrada.nextLine();
            nombres_personas_total[i] = nombres_personas;



            System.out.println("Ingrese aqui el genero de la persona "+i);
            String genero_persona = entrada.nextLine();
            genero_persona_total[i] = genero_persona;

        }

        for (int i=0 ; i<cant_personas ; i++){

            System.out.println(" [ "+nombres_personas_total[i]+ " -> "+genero_persona_total[i]+" ] ");
        }

    }
        

}
    