package ejercicio0;

public class Libro {
	private String isbn;
	private String titulo;
	private String autor; 
	private int anioPublicacion;
	private boolean disponible;

	
public Libro(String isbn, String titulo, String autor, int anioPublicacion, boolean disponible) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
		this.disponible = disponible;
	}
public Libro(String string, String string2, String string3, int i) {
}
public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnioPublicacion() {
		return anioPublicacion;
	}
	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	public boolean getDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public String prestamo() {
		String a= "";
		return a;
		
	}
	public boolean devolucion() {
		boolean bool=true;
		return bool;
		
	}
	public String informacion() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", anioPublicacion="	+ anioPublicacion + ", disponible=" + disponible + "]";
}
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", anioPublicacion="
				+ anioPublicacion + ", disponible=" + disponible + "]";
	}
	
}
