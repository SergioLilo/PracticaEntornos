package herencia;

public class Alumno extends Persona{

	String numExp;
	String ciclo;
	int curso;
	float notas;
	boolean matriculaHonor;
	
	
	
	public Alumno(String dni, String nombre, String telefono, String direccion,
			String numExp, String ciclo, int curso, float notas) {
		
		super(dni,nombre,telefono,direccion);
		//super(dni,nombre,telefono,33);
		this.numExp = numExp;
		this.ciclo = ciclo;
		this.curso = curso;
		this.notas = notas;
	}
	public String getNumExp() {
		return numExp;
	}
	public void setNumExp(String numExp) {
		this.numExp = numExp;
	}
	public String getCiclo() {
		return ciclo;
	}
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	public float getNotas() {
		return notas;
	}
	public void setNotas(float notas) {
		this.notas = notas;
	}
	
	public void mostrarPersona() {
		super.mostrarPersona();
		//this.mostrarPersona();
		System.out.println("NumExp: " + this.numExp);
		System.out.println("Ciclo: " + this.ciclo);
		System.out.println("Curso: " + this.curso);
		System.out.println("Notas: " + this.notas);
	}
	
	public void mostrarAlumno() {
		super.mostrarPersona();
		this.mostrarPersona();
		System.out.println("NumExp: " + this.numExp);
		System.out.println("Ciclo: " + this.ciclo);
		System.out.println("Curso: " + this.curso);
		System.out.println("Notas: " + this.notas);
	}
	
	
}
