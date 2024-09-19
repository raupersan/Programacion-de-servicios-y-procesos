package ejercicio0;

public class Usuario {
	private String idUsuario;
	private String nombre;
	private String telefono;
	private String email;
	
	
	public Usuario(String idUsuario, String nombre, String telefono, String email) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void registrar() {
		
	}
	public void actualizarInfo() {
		
	}
	public String [] consultarPrestamos() {
		String [] a= {}                                                                                                   ;
		return a;
	}
		
	@Override
	public String toString() {
		return "Información del libro:\r\n"
				+ "ISBN: 978-3-16-148410-0, Título: Cien años de soledad, Autor: Gabriel García Márquez, Año de Publicación: 1967, Disponible: true";
	}
}
