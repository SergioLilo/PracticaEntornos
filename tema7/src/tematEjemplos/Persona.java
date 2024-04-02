package tematEjemplos;

public class Persona {

	private final String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	private static final int esMayor = 18;
	int esMayor2;
	boolean esDni = true;

	public Persona(String dni) {
		super();
		this.dni = dni;

	}

	public Persona(String dni, String nombre, String apellidos, int edad) {
		super();

		esDni = validarDNI(dni);
		this.dni = dni;
		if (esDni) {

			this.nombre = nombre;
			this.apellidos = apellidos;
			this.edad = edad;

		} else {
			System.err.println("DNI INVALIDO");
		}
	}

	private String getNombre() {
		return nombre;
	}

	private String getApellidos() {
		return apellidos;
	}

	public String getDni() {
		return dni;
	}

	private int getEdad() {
		return edad;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}

	int esMayorEdad() {
		if (this.edad > 18) {
			return esMayor2 = esMayor;
		} else {
			return esMayor2 = 0;
		}
	}

	public boolean esJubilado() {
		return (edad >= 65);
	}

	public int diferenciaEdad(Persona p) {

		return (this.edad - p.getEdad());
	}

	public void mostrarInfoPersona() {

		if (esDni == true) {
			esMayor2 = 0;
			esMayor2 = esMayorEdad();

			System.out.print(this.nombre + " " + this.getApellidos() + " CON DNI " + getDni());
			if (this.esMayor2 == 18) {
				System.out.println(" ES MAYOR DE EDAD");
			} else {
				System.out.println(" NO ES MAYOR DE EDAD");
			}
		} else if (esDni == false) {
			;
		}
	}

	public void mostrarDatosPersona() {
		System.out.print(this.nombre + " " + this.getApellidos() + " CON DNI " + getDni() + " Y TIENE " + this.getEdad()
				+ " AÑOS");

	}

	static boolean validarDNI(String dni) {
		if (dni.length() != 9 || !Character.isLetter(dni.charAt(8))) {
			return false;
		}
		for (int i = 0; i < 8; i++) {
			if (!Character.isDigit(dni.charAt(i))) {
				return false;
			}
		}

		return true;
	}

}