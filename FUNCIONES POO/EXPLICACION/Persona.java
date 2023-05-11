public class Persona{

    // Atributos
    int cedula;
    String nombres;
    String apellidos;
    String genero;
    int edad;
    int peso;
    int altura;

    //LOS CONSTRUCTORES SON LOS QUE NO SE LE INDICAN VALOR DE RETORNO, son los que le dan el valor inicial a los atributos


    public Persona(){

        this.cedula = 0;
        this.nombres = "";
        this.apellidos = "";
        this.genero = "";
        this.edad = 0;
        this.peso = 0;
        this.altura = 0;

    }

    public Persona(int cedula, String nombres, String apellidos){

        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = "";
        this.edad = 0;
        this.peso = 0;
        this.altura = 0;
        

    }


    //Metodos
    public Persona(int cedula, String nombres, String apellidos, String genero, int edad, int peso, int altura){ // Son parametros no son igual a los de arriba
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    //en los metodos get no se le pone nada ahi en parametros
    //get es para obtener
    public int getPeso(){
        return this.peso;
    }

    // el set es para modificar
    public void setPeso(int new_peso){
        this.peso = new_peso;

    }

    //cuando una funcion tiene el void significa que no returna nada
    public void comer(int gramos){

        this.peso += (int) (gramos*0.1);

    }


    public void imprimirDatosPresentacion(){

    
        System.out.println(" --------------------------------------------------- ");
        System.out.println(" -- DATOS PERSONA --  ");
        System.out.println(" --------------------------------------------------- ");
        System.out.println(" cedula: "+this.cedula);
        System.out.println(" Nombres: "+this.nombres);
        System.out.println(" Apellido: "+this.apellidos);
        System.out.println(" Genero: "+this.genero);
        System.out.println(" Edad: "+this.edad);
        System.out.println(" Peso: "+this.peso);
        System.out.println(" Altura: "+this.altura);
        System.out.println(" --------------------------------------------------- ");
    }
    
}