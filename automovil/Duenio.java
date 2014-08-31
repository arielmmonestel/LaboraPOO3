package automovil;

public class Duenio {
	private String nombre;
	private String cedula;
	private String apellido;

	public Duenio(String pCedula,String pNombre,String pApellido) {
	setCedula(pCedula);
	setNombre(pNombre);
	setApellido(pApellido);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String toString(){
		String msg;
		msg = "Nombre" + getNombre()+"Apellido" + getApellido() +"\n";
		msg +="Cedula" + getCedula()+"\n";
		return msg;
	}
}
