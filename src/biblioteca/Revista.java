package biblioteca;

public class Revista extends MaterialBiblioteca implements Prestamo{
	
	private String numeroEdicion;
	private boolean isPrestado;
	private String nombreUsuario;
	
	public Revista(String titulo, String añoPublicacion, int numeroPaginas, String numeroEdicion) {
		super(titulo, añoPublicacion, numeroPaginas);
		this.numeroEdicion = numeroEdicion;
		this.isPrestado = false;
		this.nombreUsuario = "";
	}
	@Override
	public double calcularMultas(int diasRetraso){
		double multa = 0;
		
		if(diasRetraso > 10) {
			multa = diasRetraso*1500;
		}else {
			multa = diasRetraso*1000;
		}
		
		return multa;
	}
	
	@Override
	public void prestar(String nombreUsuario) {
		this.isPrestado = true;
		this.nombreUsuario = nombreUsuario;
}
	
	@Override
	public void devolver() {
		this.isPrestado = false;
		this.nombreUsuario = "";
		
	}

	@Override
	public String getResumen() {
		return "Revista [numeroEdicion=" + numeroEdicion;
	}

	public String getNumeroEdicion() {
		return numeroEdicion;
	}

	public void setNumeroEdicion(String numeroEdicion) {
		this.numeroEdicion = numeroEdicion;
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
