public class Principal{
    public static void main(String [] args){


        //Instacia de la clase Persona 

        Persona lista [] = new Persona [10];

        lista[0]= new Persona(); // Para crear un objeto siempre se crea con la palabra new
        lista[1]= new Persona(10880, "Jhon alberth ", "Aricapa Pinto", "Masculino",17,50000,160);
        lista[2]= new Persona(10881, "Juan David", "Monsalve");


        lista[0].imprimirDatosPresentacion();
        lista[1].imprimirDatosPresentacion();
        lista[2].imprimirDatosPresentacion();


       
    }

}