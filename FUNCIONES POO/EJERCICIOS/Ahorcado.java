import java.util.Scanner;

public class Ahorcado{

    public static void main(String[] args) {
        start();
    }

    

    public static void start() {

        Scanner entrada_texto = new Scanner(System.in);
        
        String[] palabras = {"programacion", "java", "juego"};
        String palabra = palabras[(int) (Math.random() * palabras.length)]; // Aqui Seleccionamos cualquier palabra al azar del arreglo
        String palabraOculta = "";
        for (int i = 0; i < palabra.length(); i++) {
            palabraOculta += "_"; // aqui creamos una cadena de guiones para representar la palabra 
        }
        int intentos = 0;
        int maxIntentos = 6;
        boolean juegoTerminado = false;
        while (!juegoTerminado) {
            System.out.println("Palabra oculta: " + palabraOculta);
            System.out.println("Intentos restantes: " + (maxIntentos - intentos));
            System.out.print("Ingrese una letra: ");
            String letra = entrada_texto.nextLine();
            if (palabra.contains(letra)) {
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) == letra.charAt(0)) { // Si la letra ingresada se encuentra en la palabra entra a la condicion
                        palabraOculta = palabraOculta.substring(0, i) + letra + palabraOculta.substring(i + 1); // Actualiza la palabra oculta con la letra ingresada, Nuevo metodo
                    }
                }
                if (!palabraOculta.contains("_")) { // Si ya no quedan letras ocultas, el jugador ha ganado
                    juegoTerminado = true;
                    System.out.println("¡Felicidades, has ganado!, Palabra Acertada: "+palabra);
                }
            } else {
                intentos++;
                if (intentos == maxIntentos) { // Si el jugador ha agotado todos los intentos, el juego termina
                    juegoTerminado = true;
                    System.out.println("Has perdido. La palabra era: " + palabra);
                }
            }
        }

        entrada_texto.close();
    }
}


























































// import java.util.Scanner;

// public class Ahorcado{




//     // private String [] palabra;
//     // private String [] palabraAux;
//     // private int cant_encontradas;
//     // private int cant_jugadas;


//     // public Ahorcado(String[] palabra, String[] palabraAux, int cant_encontradas, int cant_jugadas){
//     //     this.palabra = palabra;
//     //     this.palabraAux = palabraAux;
//     //     this.cant_encontradas = cant_encontradas;
//     //     this.cant_jugadas = cant_jugadas;
//     // }

//     // public String[] getPalabra(){
//     //     return this.palabra;
//     // }

//     // public void setPalabra(String[] palabra){
//     //     this.palabra = palabra;
//     // }

//     // public String[] getPalabraAux(){
//     //     return this.palabraAux;
//     // }

//     // public void setPalabraAux(String[] palabraAux){
//     //     this.palabraAux=palabraAux;
//     // }

//     // public int getCant_encontradas(){
//     //     return this.cant_encontradas;
//     // }

//     // public void setCant_encontradas(int cant_encontradas){
//     //     this.cant_encontradas=cant_encontradas;
//     // }

//     // public int getCant_jugadas(){
//     //     return this.cant_jugadas;
//     // }

//     // public void setCant_jugadas(int cant_jugadas){
//     //     this.cant_jugadas=cant_jugadas;
//     // }

//     // public void crearJuego(){
//     //     Scanner entrada_numero = new Scanner(System.in);
//     //     Scanner entrada_texto = new Scanner(System.in);

//     //     System.out.println("Ingrese aqui la frase para comenzar el juego ");
//     //     String frase = entrada_texto.nextLine();

//     //     this.palabra=new String[frase.length];
//     //     this.palabraAux=new String[frase.length];

//     //     for (int i=0; i<frase.length;i++){
//     //         this.palabra[i]=frase.char
//     //     }



//     // }



// }