package vehiculos;
import java.util.ArrayList;

public class Pais {
	private String nombre;
	private static ArrayList<Pais> paises = new ArrayList<Pais>();
	private int vehiculos;
	
	public Pais(String nombre) {
		vehiculos = 0;
		this.nombre = nombre;
		paises.add(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static ArrayList<Pais> getPaises() {
		return paises;
	}
	
	public void setVehiculos() {
		vehiculos++;
	}
	
	public int getVehiculos() {
		return vehiculos;
	}
	
	public static Pais paisMasVendedor() {
		Pais maximo = paises.get(0);
		
		for(int i = 1; i < paises.size(); i++) {
			if(paises.get(i).getVehiculos() > maximo.getVehiculos()) {
				maximo = paises.get(i);
			}
		}
		
		return maximo;
	}
}
