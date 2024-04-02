package astros;

import java.util.ArrayList;
import java.util.Iterator;

public class Planetas extends Astros{

	int distanciaSol,orbitaSol;
	ArrayList<String> satelite;
	String nombre;
	
	public Planetas(int radio, int rotacion, int masa, int temperatura, int gravedad
			,int distanciaSol, int orbitaSol,String nombre) {
		super(radio,rotacion,masa,temperatura,gravedad);
		this.distanciaSol = distanciaSol;
		this.orbitaSol = orbitaSol;
		this.satelite = new ArrayList();
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDistanciaSol() {
		return distanciaSol;
	}
	public void setDistanciaSol(int distanciaSol) {
		this.distanciaSol = distanciaSol;
	}
	public int getOrbitaSol() {
		return orbitaSol;
	}
	public void setOrbitaSol(int orbitaSol) {
		this.orbitaSol = orbitaSol;
	}
	public ArrayList<String> getSatelite() {
		return satelite;
	}
	public void setSatelite(ArrayList<String> satelite) {
		this.satelite = satelite;
	}
	public void mostrar() {
		super.mostrar();
		System.out.println("Distancia al sol: "+this.distanciaSol);
		System.out.println("Orbita al sol: "+this.orbitaSol);
		
		}
	public void anadirSatelite(String n) {
		
		satelite.add(n);
		}
	public void imprimirSatelites() {
		
		for (int i = 0; i < satelite.size(); i++) {
			System.out.println(satelite.get(i));
		}
		
	}
}
