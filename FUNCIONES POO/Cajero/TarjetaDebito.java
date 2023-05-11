import java.util.Date;
public class TarjetaDebito{

	// Atributos
	private String numero;
	private String titular;
	private String password;
	private int saldo;
	private String [] lista_transacciones;


	// Metodos
	public TarjetaDebito(String numero, String titular, String password, int saldo){
		this.numero = numero;
		this.titular = titular;
		this.password = password;
		this.saldo = saldo;
		this.lista_transacciones = new String[5];
	}

	public void registrarLog(String tipo, int valorTotal,  String estado){
		Date fecha = new Date();
		String log = fecha.toString()+" || "+tipo+" || "+this.numero+" || "+String.valueOf(valorTotal)+" || "+estado;
		
		if (this.lista_transacciones[ this.lista_transacciones.length-1 ] == null) {
			for(int i=0; i<this.lista_transacciones.length; i++){
				if (this.lista_transacciones[i]==null) {
					this.lista_transacciones[i] = log;
					break;
				}
			}
		}else{
			for (int i=0; i<this.lista_transacciones.length-1; i++) {
				this.lista_transacciones[i] = this.lista_transacciones[i+1];
			}
			this.lista_transacciones[this.lista_transacciones.length-1] = log;
		}
	}

	public void imprimirDatosTarjeta(){
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");
		System.out.println("-- Numero Tarjeta: "+this.numero);
		System.out.println("-- TITULAR : "+this.titular);
		System.out.println("-- SALDO : "+this.getSaldo());
		System.out.println("-- lista_transacciones: ");
		for (int i=0; i<this.lista_transacciones.length; i++) {
			if (this.lista_transacciones[i] != null) {
				System.out.println("     => "+this.lista_transacciones[i]);
			}
		}
		System.out.println("-----------------------------------------\n");
	}

	public boolean disminuirSaldo(int valor){
		if (this.saldo >= valor) {
			this.saldo -= valor;
			// registrar en log de tarjeta
			this.registrarLog("SALDO DISMINUIDO", valor, "OK:200");
			return true;
		}else{
			// registrar en log de la tarjeta
			this.registrarLog("SALDO DISMINUIDO", valor, "Error:404");
			return false;
		}
	}

	public void cambiarClave(String password, String nuevo_password){
		if (this.verificarPassword(password)){
			this.password = nuevo_password;
			this.registrarLog("CAMBIAR PASSWROD", 0, "Ok:200");
		}else{
			this.registrarLog("CAMBIAR PASSWROD", 0, "Error:403");
		}
	}

	public void consultarSaldoTarjeta1(String password){

		if(this.verificarPassword(password)){
			this.registrarLog("CONSULTA SALDO", 0, "OK:200");
		}else{
			this.registrarLog("SALDO", 0, "Error:403");
		}
	}

	public int getSaldo(){
		return this.saldo;
	}

	public String getTitular(){
		return this.titular;
	}

	public String getPassword(){
		return this.password;
	}

	public String getNumero(){
		return this.numero;
	}
	
	public boolean verificarPassword(String password){
		return this.password.equals(password);
	}



}

