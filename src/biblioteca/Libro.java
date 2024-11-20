package biblioteca;

public class Libro extends MaterialBiblioteca implements Prestamo{
	
	private String autor;
	private String nombreUsuario;
	private boolean isPrestado;

	@Override
	public double calcularMultas(int diasRetraso){
		return diasRetraso*2000;
	}
	
	@Override
<<<<<<< HEAD
	public void prestar(String nombreUsuario) {
			this.isPrestado = true;
			this.nombreUsuario = nombreUsuario;
=======
	public boolean prestar(String nombreUsuario) {
		if(this.isPrestado = true) {
			return false;
		}else {
			this.isPrestado = true;
			this.nombreUsuario = nombreUsuario;
			return true;
		}
>>>>>>> 60301be48b394d95358a929531d2f5acc138aa4e
	}
	
	@Override
	public void devolver() {
		this.isPrestado = false;
		this.nombreUsuario = "";
		
	}
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Libro(String titulo, String añoPublicacion, int numeroPaginas, String autor) {
		super(titulo, añoPublicacion, numeroPaginas);
		this.autor = autor;
		this.isPrestado = false;
		this.nombreUsuario = "";
	}

	public boolean isPrestado() {
		return isPrestado;
	}

	public void setPrestado(boolean isPrestado) {
		this.isPrestado = isPrestado;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


}
