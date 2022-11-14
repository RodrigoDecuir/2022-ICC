/**
 * Clase de uso para la clase pasteles.
 * @author Rodrigo Andre Decuir Fuentes
 * @version 27 oct 2022
 */

public class UsoPastel {

	public static void main(String[]args) {

		Pastel unico = new Pastel();	
	
		Pastel mistico = new Pastel("fresa", "chocolate", "M", 350, 77);
		Pastel afrodisiaco = new Pastel("fresa", "chocolate", "CH", 650, 90);
		Pastel comico = new Pastel("durazno", "vainilla", "G", 600, 99);	
			
		System.out.println("(1) " + mistico);
		System.out.println("(2) " + afrodisiaco);
		System.out.println("(3) " + comico + "\n");
	
		System.out.println("Aplicar 10% de descuento al primer pastel:");
		mistico.aplicaDescuento(10);
		System.out.println("(1) " + mistico + "\n");

			
		System.out.println("(1) y (2) comparten el mismo sabor de relleno y pan?");
		System.out.println(mistico.mismoSabor(afrodisiaco) + "\n");

		
		System.out.println("Pastel nuevo a partir de la mezcla de (2) y (3):");
		System.out.println("(4) " + afrodisiaco.mezclaPasteles(comico) + "\n");

		
		System.out.println("Probabilidad aplicada para disminuir la frescura: ");
		System.out.print("(1) ");
		unico.caducaPasteles(mistico);
		System.out.println(" ");
		

		System.out.println("Conviene comprar el pastel?");
		System.out.print("(2) ");
		unico.conviene(afrodisiaco);	
	}


}

