package ESDLA;

public class Mago extends Personaje {

	
	private Tunica tunica;
	private Sombrero sombrero;
	
	public Mago(String nombre, int posX, int posY, Tunica tunica, Sombrero sombrero) {
		super(nombre,100, posX, posY);
		this.tunica = tunica;
		this.sombrero = sombrero;
	}
	public Mago(String nombre, int posX, int posY) {
		super(nombre,100, posX, posY);
		this.tunica = new Tunica("ROJO","CUERO");
		this.sombrero = new Sombrero(12,8);
	}
	private Tunica getTunica() {
		return tunica;
	}
	private void setTunica(Tunica tunica) {
		this.tunica = tunica;
	}
	private Sombrero getSombrero() {
		return sombrero;
	}
	private void setSombrero(Sombrero sombrero) {
		this.sombrero = sombrero;
	}
	public void mostrarMago() {
		super.mostrarPersonaje();
		System.out.println("**MAGO**");
		
		System.out.println(this.sombrero.toString());
		System.out.println(this.tunica.toString());
	}
}
