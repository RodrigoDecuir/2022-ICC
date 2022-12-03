
public class Ticket {
	
	String codigo;
	double monto;


	public Ticket(String c, double m) {
		codigo = c;
		monto = m;
	}


	//Sets gets

	public String toString() {
		return "Ticket: " + codigo + " Monto $" + monto;
	}


}

