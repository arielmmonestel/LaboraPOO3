package automovil;
import java.util.*;
import java.text.*;

/*Ariel Montero Monestel - 2014073164
Fabian Monge 
Fecha de Creacion de la clase : 23/08/2014


~En la clase Automovil se definen los atributos "Marca", Costo, placa,
 color, fecha de Compra, dueno del automovil, telefono Dueno, isChocado
  y fecha de creacion, 
 ~Tambien se definen los metodos :  Chocar, reparar, cambiar color y cambiar dueno
*/

public class Automovil {
	private String marca = " ";
	private int costo = 3000  ;
	private int placa = 1 ;
	private String color;
	private String fechaDeCompra;
	private Duenio duenioDelAutomovil = null;
	private String telefonoDuenio;
	private String isChocado;
	private Date fechaCreacion;
	
		
	public Automovil(Duenio duenioDelAutomovil, String telefonoDuenio , String marca ,
			String color) {
		placa ++;
		costo ++;
		setPlaca(placa);
		setCosto(costo);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public int getPlaca() {
		return placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFechaDeCompra() {
		return fechaDeCompra;
	}

	public void setFechaDeCompra(String fechaDeCompra) {
		this.fechaDeCompra = fechaDeCompra;
	}

	public Duenio getDuenioDelAutomovil() {
		return duenioDelAutomovil;
	}

	public void setDuenioDelAutomovil(Duenio pDuenioDelAutomovil) {
		duenioDelAutomovil = pDuenioDelAutomovil;
	}

	public String getTelefonoDuenio() {
		return telefonoDuenio;
	}

	public void setTelefonoDuenio(String telefonoDuenio) {
		this.telefonoDuenio = telefonoDuenio;
	}

	public String getIsChocado() {
		return isChocado;
	}

	public void setIsChocado(String isChocado) {
		this.isChocado = isChocado;
	}

	public void cambiarColor(String pColor){
		
	if (color == pColor){
			System.out.println("No se ha cambiado el color, ya que, el color nuevo es igual que el anterior"+"\n");
		}
	else{
		System.out.println("El color del automovil ha sido cambiado por: " + pColor);
		}
}
	
	public void cambiarDuenio(String nombre, String telefonoDuenio) {
		System.out.println(" El automovil placa  " + placa +" ha cambiado de duenio exitosamente."+"\n");
		
	}
	

	public void chocarAutomovil() {
		
		
			System.out.println("El automovil placa " + placa +" ha chocado."+"\n");
			System.out.println("El automovil placa " + placa +" no puede cambiar de duenio, debido que, esta chocado."+"\n");
			isChocado = "Chocado"+"\n" ; 
	}

	public void repararAutomovil() {
			System.out.println("El automovil ha sido reparado exitosamente"+"\n");
			System.out.println("El automovil placa " + placa +" ha cambiadod de duenio existosamente."+"\n");
			isChocado = "Sin Chocar"+"\n";
		
	}	
		
	public void setFechaCreacion(){
			Calendar calendario;
			calendario = Calendar.getInstance();
			fechaCreacion = calendario.getTime();
			
		}
		
	String getFechaCreacion(){
			SimpleDateFormat mascara = new SimpleDateFormat("dd/MM/yy");
			return mascara.format(fechaCreacion);


		

		
	}
	@Override
	public String toString() {
		String msg;
		 msg =   "Automovil marca=" + marca +"\n" ;
		 msg +=  "costo=" + costo +"\n" ;
		 msg +=  "placa="+ placa + "\n";
		 msg +=  " color=" + color + "\n";
		 msg +=  " fecha De Compra="+ fechaDeCompra + "\n";
		 msg +=  "duenio Del Automovil=" +Duenio.toString()+"\n"; 
		 msg +=  " telefono Duenio=" + telefonoDuenio +"\n";
		 msg +=  " is Chocado= "+ isChocado + "\n";
		 msg +=  ", fecha Creacion=" + fechaCreacion+ "\n";
		 return msg ;
	}
}
