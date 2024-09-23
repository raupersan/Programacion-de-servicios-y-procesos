package practica1;

public class Coche extends Vehículo {
	private int numeroPuertas;

	public Coche(String marca, String modelo, int años, Persona propietario, int numeroPuertas) {
		super(marca, modelo, años, propietario);
		this.numeroPuertas = numeroPuertas;
	}

	public Coche(String marca, String modelo, int años, int numeroPuertas) {
		super(marca, modelo, años);
		this.numeroPuertas = numeroPuertas;
	}
	
}
