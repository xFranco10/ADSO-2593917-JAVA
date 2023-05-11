public class Principal{
    public static void main(String[] args) {
        // EjemploFlowLayout ventana = new EjemploFlowLayout();
        // EjemploBoxLayout ventana = new EjemploBoxLayout();
        // EjemploBorderLayout ventana = new EjemploBorderLayout();
        // EjemploFlowBorderLayout ventana = new EjemploFlowBorderLayout();
        // EjercicioLayout ventana = new EjercicioLayout();
        // EjemploGridLayout ventana = new EjemploGridLayout();
        // EjemploGridBagLayout ventana = new EjemploGridBagLayout();

        Persona listaClientes [] = new Persona[100];
        Vendedor listaVendedores [] = new Vendedor[10];
        Productos listaProductos [] = new Productos[15];

        listaClientes[0] = new Persona("1109185526", "Andrey", "Calle 20");
        listaClientes[1] = new Persona("8080", "Oscar Loaiza", "Calle 30");

        listaVendedores[0] = new Vendedor("2525", "Gordo Monsalve");
        listaVendedores[1] = new Vendedor("2020", "Viejo Péche");

        listaProductos[0] = new Productos("07", "Frijoles", 2, 5000);
        listaProductos[1] = new Productos("10", "Blanquillos", 3, 10000);



        Factura ventana = new Factura(listaClientes, listaVendedores, listaProductos);
    
    }

}
