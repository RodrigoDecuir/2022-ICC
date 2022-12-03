import java.util.Scanner;

public class CajaRegistradora {
	

	Ticket[] tickets = new Ticket[3];


	public void imprimeCaja() {

		System.out.println("***************************");

		for(int i=0; i<tickets.length; i++) {
			if(tickets[i]!=null) {
				System.out.println(tickets[i]);	
			} else {
				System.out.println("-----------");
			}
			
		}
	

		System.out.println("***************************");

	}

	public int regresaLongitud() {
		return tickets.length;
	}


	public int regresaLongitudNoVacia() {
		
		int contador=0;
		for(int i=0; i<tickets.length; i++) {
			if(tickets[i]!=null) {
				contador++;
			}
		}

		return contador;

	}


	public void guardaTicket() {

		Scanner entrada = new Scanner(System.in);

		boolean sePuede=false;

		for(int i=0; i<tickets.length; i++) {		
			if(tickets[i]==null) {
				sePuede=true;
				break;
			}
		}

		String codigo;
		double monto;

		if(sePuede) {

			System.out.println("Escribe el código de barras");
			codigo = entrada.next();
			System.out.println("Escribe el monto");
			monto = entrada.nextDouble();

			Ticket nuevo = new Ticket(codigo, monto);

			for(int i=0; i<tickets.length; i++) {
				if(tickets[i]==null) {
					tickets[i]=nuevo;
					break;
				}
			}

		} else {

			System.out.println("Ya no se pueden guardar más tickets");
		}

	

	}


}

