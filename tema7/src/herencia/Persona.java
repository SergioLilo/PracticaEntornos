package herencia;

import java.time.LocalDate;

public class Persona {

	String dni;	
	String nombre;
	String telefono;
	String direccion;
	int edad;
	
	
	Persona(){
		System.out.println("SOY EL CONST DE PERSONA");
	}
	
	public Persona(String dni, String nombre, String telefono, String direccion) {
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	public Persona(String dni, String nombre, String telefono, int edad) {
		System.out.println("ESTOY EN EL SEGUNDO CONSTR");
	}
	
	
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	protected void mostrarPersona() {
		System.out.println("DATOS");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Dni: " + this.dni);
		System.out.println("Teléfono: " + this.telefono);
		System.out.println("Dirección: " + this.direccion);
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion
				+ ", edad=" + edad + "]";
	}
	
	
}
