package codigo;

public class Actividad {
	
	//Declarar atributos
	private int idActividad;
	private String nombre;
	private String horario;
	private int plazasMaximas;
	
	//Constructores	
	public Actividad() {
	}

	public Actividad(int idActividad, String nombre, String horario, int plazasMaximas) {
		this.idActividad = idActividad;
		this.nombre = nombre;
		this.horario = horario;
		this.plazasMaximas = plazasMaximas;
	}

	//Getters
	public int getIdActividad() {
		return idActividad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getHorario() {
		return horario;
	}

	public int getPlazasMaximas() {
		return plazasMaximas;
	}

	//Setters
	public void setIdActividad(int idActividad) {
		this.idActividad = idActividad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public void setPlazasMaximas(int plazasMaximas) {
		this.plazasMaximas = plazasMaximas;
	}
	
	public boolean comprobarPlazas() {
		// Código a ejecutar
		return true;
	}
	
}
