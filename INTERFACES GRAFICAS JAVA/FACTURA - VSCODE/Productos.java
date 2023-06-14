public class Productos {
    private String id;
	private String nombre;
    private int cant;
	private int precio;
	public Productos(String id_producto, String nombre_producto, int cant_producto, int precio_producto){
		this.id = id_producto;
		this.nombre = nombre_producto;
        this.cant = cant_producto;
		this.precio = precio_producto;
	}

	public String getId(){
		return this.id;
	}

	public String getNombre(){
		return this.nombre;
	}

    public int getCant(){
		return this.cant;
	}

	public int getPrecio(){
		return this.precio;
	}


}
