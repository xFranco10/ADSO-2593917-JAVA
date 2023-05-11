public class Principal{
	public static void main(String[] args) {
		
		// Pruebas
		//Llamar a la clase cajero electronico y llenar con sus datos
		CajeroElectronico cj_01 = new CajeroElectronico(3, 250000000, 1500000, 50, 50, 0, 0, "BancoSena", "andres9649", "12345");
		
		//Este es para llenar el cajero y se imprime
		cj_01.actualizarTotalCajero("andres9649", "12345", 20000000, 200, 200, 200, 40);
		cj_01.imprimirDatosCajero();

		//Llamar a la clase TarjetaDebito y llenar con sus datos
		TarjetaDebito tj_01 = new TarjetaDebito("1111222233334444", "Oscar Loaiza", "54321", 1000000);
		
		//Retirar dinero de la tarjeta
		cj_01.retirarDineroTarjeta(tj_01, "54321", 780000);
		cj_01.imprimirDatosCajero();

		//Consultar el nuevo saldo
		cj_01.consultarSaldoTarjeta(tj_01, "54321");
		
		//Imprimir informacion de la tarjeta
		tj_01.imprimirDatosTarjeta();

		//Cambiando clave
		cj_01.cambiarClave(tj_01, "54321", "8888");


		//Datos actualizados de cajero
		cj_01.imprimirDatosTarjetaActualizado(tj_01);
		//Datos actulizados de tarjeta
		tj_01.imprimirDatosTarjeta();


		


		

	}



}
