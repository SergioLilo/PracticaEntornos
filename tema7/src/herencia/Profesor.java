package herencia;

public class Profesor extends Persona{
	
	String codProfesor;
	String departamento;
	String modulos;
	String horario;
	
	
	
	public Profesor(String dni, String nombre, String telefono, String direccion,
			String codProfesor, String departamento, String modulos, String horario) {
		super(dni,nombre,telefono,direccion);
		this.codProfesor = codProfesor;
		this.departamento = departamento;
		this.modulos = modulos;
		this.horario = horario;
		
				
	}
	public String getCodProfesor() {
		return codProfesor;
	}
	public void setCodProfesor(String codProfesor) {
		this.codProfesor = codProfesor;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getModulos() {
		return modulos;
	}
	public void setModulos(String modulos) {
		this.modulos = modulos;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	/*public void mostrarPersona() {
		super.mostrarPersona();
		System.out.println("Codigo: " + this.codProfesor);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Modulos: " + this.modulos);
		System.out.println("Horario: " + this.horario);
		
		
	}*/
	
	public void mostrarProfesor() {
		 
		System.out.println("Codigo: " + this.codProfesor);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Modulos: " + this.modulos);
		System.out.println("Horario: " + this.horario);
		
		
	}
	@Override
	public String toString() {
		return "Profesor [codProfesor=" + codProfesor + ", departamento=" + departamento + ", modulos=" + modulos
				+ ", horario=" + horario + "]";
	}
	
	
}
