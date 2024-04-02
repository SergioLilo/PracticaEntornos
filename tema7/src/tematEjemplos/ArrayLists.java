package tematEjemplos;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList lista = new ArrayList();

		lista.add(-25);
		lista.add(3.14);
		lista.add("A");
		lista.add("Luis");

		lista.add(new Persona("28751533Q", "María", "Maida García", 37));
		lista.add(new Persona("65971552A", "Luis", "González Collado", 17));
		lista.add(new Persona("16834954R", "Raquel", "Dobón Pérez", 62));
		System.out.println(lista.size());

		// lista.clear();

		System.out.println(lista.size());
		lista.set(1, "siu");

		System.out.println(lista.get(6));
		// ((Persona) lista.get(5)).mostrarDatosPersona();
		Persona p1 = (Persona) lista.remove(5);
		Persona p2 = new Persona("28751533Q", "María", "Maida García", 37);
		ArrayList<Persona> listaPersonas = new ArrayList();

		listaPersonas.add(p1);
		listaPersonas.add(p2);

		for (int i = 0; i < listaPersonas.size(); i++) {

			if (listaPersonas.get(i).getDni().equalsIgnoreCase("28751533Q")) {
				listaPersonas.get(i).mostrarInfoPersona();
			}

		}
		for (Persona persona : listaPersonas) {
			persona.mostrarInfoPersona();
		}

	}

}
