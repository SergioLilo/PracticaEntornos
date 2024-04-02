package astros;

public class Satelites extends Astros{

	int distanciaPlaneta,orbita;
	String planeta,nombre;
	
	public Satelites(int radio, int rotacion, int masa, int temperatura, int gravedad, int distanciaPlaneta, int orbita,
			String planeta,String nombre) {
		super(radio, rotacion, masa, temperatura, gravedad);
		this.distanciaPlaneta = distanciaPlaneta;
		this.orbita = orbita;
		this.planeta = planeta;
		this.nombre=nombre;
	}

	public int getDistanciaPlaneta() {
		return distanciaPlaneta;
	}

	public void setDistanciaPlaneta(int distanciaPlaneta) {
		this.distanciaPlaneta = distanciaPlaneta;
	}

	public int getOrbita() {
		return orbita;
	}

	public void setOrbita(int orbita) {
		this.orbita = orbita;
	}

	public String getPlaneta() {
		return planeta;
	}

	public void setPlaneta(String planeta) {
		this.planeta = planeta;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void mostrar() {
		super.mostrar();
		System.out.println("Distancia a Planeta: "+this.distanciaPlaneta);
		System.out.println("orbita: "+this.orbita);
		System.out.println("Planeta "+this.planeta);
	}
	public void buscarPlaneta() {
		
	};
}
