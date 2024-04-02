package ESDLA;

public class Personaje {

	protected String nombre;
	protected int vida,posX,posY;
	
	public Personaje(String nombre, int vida, int posX, int posY) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.posX = posX;
		this.posY = posY;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getVida() {
		return vida;
	}

	protected void setVida(int vida) {
		this.vida = vida;
	}

	protected int getPosX() {
		return posX;
	}

	protected void setPosX(int posX) {
		this.posX = posX;
	}

	protected int getPosY() {
		return posY;
	}

	protected void setPosY(int posY) {
		this.posY = posY;
	}
	
	protected void mostrarPersonaje() {
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Vida: "+this.vida);
		System.out.println("posX: "+this.posX);
		System.out.println("posY: "+this.posY);
	}
	
}
