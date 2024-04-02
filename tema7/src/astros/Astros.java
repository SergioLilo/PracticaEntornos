package astros;

public class Astros{

	int radio,rotacion,masa,temperatura,gravedad;

	public Astros(int radio, int rotacion, int masa, int temperatura, int gravedad) {
		
		this.radio = radio;
		this.rotacion = rotacion;
		this.masa = masa;
		this.temperatura = temperatura;
		this.gravedad = gravedad;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public int getRotacion() {
		return rotacion;
	}

	public void setRotacion(int rotacion) {
		this.rotacion = rotacion;
	}

	public int getMasa() {
		return masa;
	}

	public void setMasa(int masa) {
		this.masa = masa;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public int getGravedad() {
		return gravedad;
	}

	public void setGravedad(int gravedad) {
		this.gravedad = gravedad;
	}
	public void mostrar() {
		System.out.println("radio: " +this.radio);
		System.out.println("masa "+this.masa);
		System.out.println("rotacion: "+this.rotacion);
		System.out.println("temperatura: "+this.temperatura);
		System.out.println("gravedad: "+this.gravedad);
	}
}
