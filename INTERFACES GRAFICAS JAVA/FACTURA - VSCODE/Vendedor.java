public class Vendedor{
    private String cedula_v;
	private String nombre_v;

	public Vendedor(String cedula_vendedor, String nombre_v){
		this.cedula_v = cedula_vendedor;
		this.nombre_v = nombre_v;
	}

	public String getCedula_v(){
		return this.cedula_v;
	}

	public String getNombre_v(){
		return this.nombre_v;
	}

}
