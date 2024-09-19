package ejercicio0;

import java.util.Date;
public class Préstamo {
	private String idPrestamo;
	private Date fechaPrestamo;
	private Date fechaDevolucion;
	
	public Préstamo(String idPrestamo, Date fechaPrestamo, Date fechaDevolucion) {
		super();
		this.idPrestamo = idPrestamo;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;
	}
	public Préstamo(String string, Libro libro1, Usuario usuario1, Date fechaPrestamo2) {
		// TODO Auto-generated constructor stub
	}
	public void realizarPrestamo() {
		
	}
	
	@Override
	public String toString() {
		return "Préstamo [idPrestamo=" + idPrestamo + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion="
				+ fechaDevolucion + "]";
	}
	public void finalizarPrestamo(Date fechaDevolucion2) {
		
	}
	
}
