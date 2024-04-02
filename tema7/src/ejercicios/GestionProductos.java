package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionProductos {
	static Scanner teclado = new Scanner(System.in);

	public static void añadirProductos(ArrayList<Producto> lista) {
		System.out.println("INTRODUCIR NOMBRE DE PRODUCTO Y PRECIO ");

		lista.add(new Producto(teclado.next(),  teclado.nextInt()));

		for (int i = 0; i < lista.size() - 1; i++) {

			if (lista.get(i).getNombre().equals(lista.get(lista.size() - 1).getNombre())) {
				System.out.println(lista.get(i).getNombre());
				System.out.println(lista.get(lista.size() - 1).getNombre());

				lista.remove(lista.size() - 1);
				System.out.println("PRODUCTO BORRADO YA QUE EXISTE UNO CON EL MISMO NOMBRE");
				i = 1000000;
			}
		}
	}

	public static void borrarProductos(ArrayList<Producto> lista) {
		System.out.println("INTRODUCE UN NOMBRE");
		String nombre = teclado.next();
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNombre().equals(nombre)) {
				lista.remove(i);
				System.out.println("PRODUCTO BORRADO");
				i = 1000000;
			}
		}
	}

	public static void actualizarProductos(ArrayList<Producto> lista) {

		System.out.println("INTRODUCE UN NOMBRE");
		String nombre = teclado.next();
		System.out.println("INTRODUCE LA CANTIDAD");
		int cantidad = teclado.nextInt();
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNombre().equals(nombre)) {
				lista.get(i).setCantidad(cantidad);
				System.out.println("Producto actualizado");
				i = 1000000;
			}
		}
	}

	public static void infoUnProducto(ArrayList<Producto> lista) {
		System.out.println("INTRODUCE UN NOMBRE");
		String nombre = teclado.next();

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNombre().equals(nombre)) {
				lista.get(i).verDatos();

				i = 1000000;
			}

		}
	}

	public static void todosProductos(ArrayList<Producto> lista) {
		for (int i = 0; i < lista.size(); i++) {
			lista.get(i).verDatos();
		}
	}
}
