

public class TarjetaDebito {
	

	String numeracion;
	double saldo;


	public TarjetaDebito() {

	}
		

	public TarjetaDebito(String n, double s) {
		numeracion = n;
		saldo = s;
	}

	public void setNumeracion(String n) {
		numeracion = n;
	}


	public void setSaldo(double s) {
		saldo = s;
	}

	public String getNumeracion() {
		return numeracion;
	}

	public double getSaldo() {
		return saldo;
	}


	public String toString() {

		return "Tarjeta: " + numeracion + " con saldo: " + saldo;
	}



	public void comprar(double precioRestar) {

		double cantidadRestante = this.getSaldo()-precioRestar;
		if(cantidadRestante >= 0) {
			//Hacemos la compra
			this.setSaldo(cantidadRestante);
		} else {
			System.out.println("No tienes el dinero suficiente");
		}

	}


	public double abonar(double monto) {

		double cantidadActual = this.getSaldo()+monto;
		this.setSaldo(cantidadActual);

		return cantidadActual;
		

	}


	public void comparaTarjetas(TarjetaDebito t1, TarjetaDebito t2) {

		if(t1.getSaldo() == t2.getSaldo()) {
			System.out.println("Saldos iguales");
		} else if (t1.getSaldo() > t2.getSaldo()) {
			System.out.println(t1.getNumeracion() +  " tiene más saldo");
		} else {
			System.out.println(t2.getNumeracion() +  " tiene más saldo");
		}

	}


	public void comparaTarjetas(TarjetaDebito t1) {

		if(t1.getSaldo() == this.getSaldo()) {
			System.out.println("Saldos iguales");
		} else if (t1.getSaldo() > this.getSaldo()) {
			System.out.println(t1.getNumeracion() +  " tiene más saldo");
		} else {
			System.out.println(this.getNumeracion() +  " tiene más saldo");
		}

	}



}



