package automovil;
/*Ariel Montero Monestel - 2014073164
Fabian Monge 
Fecha de Creacion de la clase : 23/08/2014

~Se invocan los metodos y los atributos dentro de la funcion  MAIN.

*/



public class aplAutomovil {

	public aplAutomovil() {
		
	}

	public static void main(String[] args) {
		Duenio duenio1 = new Duenio("123","Ariel","Montero");
		Duenio duenio2 = new Duenio("345","Mario","Gomez");
		Automovil carrito = new Automovil(duenio1,"88888888","Ferrari", "Rojo");
		Automovil carrito2 = new Automovil (duenio2, "87777777" , "Hyundai" , "Negro" );
		System.out.println(carrito.toString());
		System.out.println(carrito2.toString());
	}
	/*Automovil carrito = new Automovil("Mario Gomez","88888888","Ferrari", "Rojo");
	Automovil carrito2 = new Automovil ("Helda Garro", "87777777" , "Hyundai" , "Negro" );
	
	carrito.cambiarColor("Negro");
	carrito.cambiarDuenio("Marta Pasos", "89890090");
	carrito.repararAutomovil();
	
	System.out.println(carrito.toString());
	carrito2.chocarAutomovil();
	carrito2.cambiarDuenio("Isma Lopez" , "60009000");
	
	System.out.println(carrito2.toString());
	
	carrito2.repararAutomovil();
	carrito2.cambiarDuenio("Cecilia Montes", "89990000");
	System.out.println(carrito2.toString());
	
	carrito.cambiarColor("Negro");
	carrito2.cambiarColor("Azul");
	System.out.println(carrito.toString());
	System.out.println(carrito2.toString());
	}
*/
}
