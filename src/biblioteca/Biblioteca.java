package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	private String nombre;
	private ArrayList<MaterialBiblioteca> listaMateriales;

	public Biblioteca(String nombre) {
		this.listaMateriales = new ArrayList<>();
		this.nombre = nombre;
	}

	public ArrayList<MaterialBiblioteca> getListaMateriales() {
		return listaMateriales;
	}

	public void setListaMateriales(ArrayList<MaterialBiblioteca> listaMateriales) {
		this.listaMateriales = listaMateriales;
	}
	
	public void agregarLibros(Libro libro) {
		this.listaMateriales.add(libro);
	}
	public void agregarRevistas(Revista revista) {
		this.listaMateriales.add(revista);
	}
	
	public boolean prestarMaterial(String titulo, String nombreUsuario) {
		for (MaterialBiblioteca materialBiblioteca : listaMateriales) {
			if(materialBiblioteca.getTitulo().equals(titulo)) {
				if (materialBiblioteca instanceof Libro) {
					Libro libro = (Libro) materialBiblioteca;
					if(libro.isPrestado() == false) {
							libro.prestar(nombreUsuario);
							return true;
						}else {
							return false;
						}
				}else if(materialBiblioteca instanceof Revista) {
					Revista revista = (Revista) materialBiblioteca;
					if(revista.isPrestado() == false) {
						revista.prestar(nombreUsuario);
						return true;
					}else {
						return false;
					}
				}
			}
		}
		return false;
	}
	
	public String devolverMaterial(String titulo, int diasRetraso) {
		String mensaje = "";
		for (MaterialBiblioteca materialBiblioteca : listaMateriales) {
			if(materialBiblioteca.getTitulo().equals(titulo)) {
				if (materialBiblioteca instanceof Libro) {
					Libro libro = (Libro) materialBiblioteca;
					libro.devolver();
					mensaje = "Tiene una multa de: " + libro.calcularMultas(diasRetraso);
				}else if(materialBiblioteca instanceof Revista) {
					Revista revista = (Revista) materialBiblioteca;
					revista.devolver();
					mensaje = "Tiene una multa de: " + revista.calcularMultas(diasRetraso);
				}
			}
		}
		return mensaje;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
