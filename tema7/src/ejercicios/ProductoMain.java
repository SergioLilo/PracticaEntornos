package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Producto> lista = new ArrayList();
		String opc = "";
		Scanner teclado = new Scanner(System.in);


		lista.add(new Producto("c", 3));
		opc = menu(opc);
		while (!opc.equals("f")) {

		
		gestionOpciones(opc,lista);
		opc=menu(opc);
		
		}
		System.out.println("FIN");
		teclado.close();
	}
	public static void gestionOpciones(String opc,ArrayList<Producto> lista) {
		
		if (opc.equals("a")) {
			GestionProductos.añadirProductos(lista);
		} else if (opc.equals("b")) {
			GestionProductos.borrarProductos(lista);
		} else if (opc.equals("c")) {
			GestionProductos.actualizarProductos(lista);
		} else if (opc.equals("d")) {
			GestionProductos.infoUnProducto(lista);
		} else if (opc.equals("e")) {
			GestionProductos.todosProductos(lista);
		}
		
	}
	

	public static String menu(String opc) {
		Scanner teclado = new Scanner(System.in);

		System.out.println(
				"a) Añadir Producto al ArrayList. Solicita los datos necesarios y verifica que antes de añadir el producto este no existe.\n"
						+ "b) Borrar Producto del ArrayList. Elimina un producto indicando su nombre.\n"
						+ "c) Actualizar producto del ArrayList. Actualiza la cantidad de un producto determinado indicando la nueva cantidad.\n"
						+ "d) Listar información de un producto específico indicando el producto.\n"
						+ "e) Listar información de todos los productos.\n" + "f) Salir");
		System.out.println("Elige una opcion");
		opc = teclado.next();

		return opc;

	}

}
