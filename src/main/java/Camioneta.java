package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	private static int camionetas = 0;
	
	public Camioneta(String placa, int puertas, String nombre, double precio, double peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 80, nombre, precio, peso, "4X4", fabricante);
		camionetas++;
		volco = this.volco;
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	public static int getCamionetas() {
		return camionetas;
	}
}
