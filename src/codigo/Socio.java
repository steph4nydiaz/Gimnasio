package codigo;

public class Socio extends Persona {
	
	private double cuotaMensual;
	
	//Constructor
	public Socio() {
	}

	public Socio(int id, String nombre, String apellidos, String telefono, String email, double cuotaMensual) {
		super(id, nombre, apellidos, telefono, email);
		this.cuotaMensual = cuotaMensual;
	}

	//getter
	public double getCuotaMensual() {
		return cuotaMensual;
	}

	//setter
	public void setCuotaMensual(double cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}
	
	//Métodos propios
	public void inscribirseActividad() {
		// Código a ejecutar
	}

	public void cancelarInscripcion() {
		// Código a ejecutar
	}

	@Override
	public String listarDatos() {
		// TODO Auto-generated method stub
		return null;
	}

}
