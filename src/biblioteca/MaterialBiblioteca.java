package biblioteca;

public abstract class MaterialBiblioteca {
		private String titulo;
		private String añoPublicacion;
		private int numeroPaginas;
		
		
		public MaterialBiblioteca(String titulo, String añoPublicacion, int numeroPaginas) {
			this.titulo = titulo;
			this.añoPublicacion = añoPublicacion;
			this.numeroPaginas = numeroPaginas;
		}

		public abstract double calcularMultas(int diasRetraso);

		public String getResumen() {
			return "MaterialBiblioteca [titulo=" + titulo + ", a�oPublicacion=" + añoPublicacion + ", numeroPaginas="
					+ numeroPaginas + "]";
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getAñoPublicacion() {
			return añoPublicacion;
		}

		public void setAñoPublicacion(String añoPublicacion) {
			this.añoPublicacion = añoPublicacion;
		}

		public int getNumeroPaginas() {
			return numeroPaginas;
		}

		public void setNumeroPaginas(int numeroPaginas) {
			this.numeroPaginas = numeroPaginas;
		}
		
}
