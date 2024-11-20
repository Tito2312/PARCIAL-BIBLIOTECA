package biblioteca;

import javax.swing.JOptionPane;

public class Main {

	public static Biblioteca bibli = new Biblioteca("Biblioteca de tito y lucho");
	public static void main(String[] args) {
		
		int opcion = 0;
		String menu = menu();
		
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
			if (opcion == 1) {
				int opcSubMenu = Integer.parseInt(JOptionPane.showInputDialog(null, getSubMenu(opcion)));
				opcionesSubMenu(opcion, opcSubMenu);
			}
		} while(opcion != 2);
	}
	
	private static String menu() {
		String menu = "Ingrese una opcion:\n"
				+ "1. Gestionar materiales.\n"
				+ "2. Salir.";
		return menu;
	}
	
	private static String getSubMenu(int menu) {
		String subMenu = "Ingrese una opcion:\n";
		switch (menu) {
		case 1:
			subMenu += "1. Agregar libro.\n"
					+ "2. Agregar Revista.\n"
					+ "3. Prestar materiales.\n"
					+ "4. Devolver materiales.\n"
					+ "5. Salir.";
			break;
		default:
			break;
		}
		return subMenu;
	}
	
	private static void opcionesSubMenu(int opcion, int subMenu) {
		switch (opcion) {
		case 1:
			opcionesMateriales(subMenu);
			break;
		default:
			break;
		}
	}

	public static void opcionesMateriales(int subMenu) {
		switch (subMenu) {
		case 1:
			agregarLibro();
			break;
		case 2:
			agregarRevista();
			break;
		case 3:
			prestar();
			break;
		case 4:
			devolver();
			break;
		default:
			break;
		}
	}
	
	public static void agregarLibro() {
		
		String titulo = JOptionPane.showInputDialog("Ingrese el titulo del libro");
		String añoPublicacion = JOptionPane.showInputDialog("Ingrese el año de publicacion del libro");
		int numeroPaginas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de paginas del libro"));
		String autor = JOptionPane.showInputDialog("Ingrese el nombre del autor del libro");
		
		Libro libro = new Libro(titulo, añoPublicacion, numeroPaginas, autor);
		
		bibli.agregarLibros(libro);
		
		
	}
	public static void agregarRevista() {
		
		String titulo = JOptionPane.showInputDialog("Ingrese el titulo de la revista");
		String añoPublicacion = JOptionPane.showInputDialog("Ingrese el año de publicacion de la revista");
		int numeroPaginas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de paginas de la revista"));
		String numeroEdicion = JOptionPane.showInputDialog("Ingrese el numero de edicion de la revista");
		
		Revista revista = new Revista(titulo, añoPublicacion, numeroPaginas, numeroEdicion);
		
		bibli.agregarRevistas(revista);
	}
	
	public static void prestar() {
		String titulo = JOptionPane.showInputDialog("Ingrese el titulo del material a prestar");
		String usuario = JOptionPane.showInputDialog("Ingrese el nombre del usuario");
		
		if(bibli.prestarMaterial(titulo, usuario) == true) {
			JOptionPane.showMessageDialog(null, "Se presta el material con titulo: " + titulo);
		}else {
			JOptionPane.showMessageDialog(null, "El material no se encuentra disponible");
		}
	}
	
	public static void devolver() {
		String titulo = JOptionPane.showInputDialog("Ingrese el titulo del material a devolver");
		int diasRetraso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de dias de retraso en la devolucion"));
		
		JOptionPane.showMessageDialog(null, bibli.devolverMaterial(titulo, diasRetraso));
		
		
	}
}
