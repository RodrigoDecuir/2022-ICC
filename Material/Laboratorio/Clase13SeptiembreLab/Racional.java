
public class Racional {
	

	//Atributos
	int p;
	int q;

	//Constructor
	public Racional(int num, int den) {
		p = num;
		if(den==0) {
			q = 1;
		} else {
			q = den;
		}
		
	}

	public Racional () {

	}


	//Métodos set
	public void setNum(int num) {
		p = num;
	}


	public void setDen(int den) {
		if(den==0) {
			q = 1;
		} else {
			q = den;
		}
	}


	//Métodos get
	public int getNum() {
		return p;
	}

	public int getDen() {
		return q;
	}


	//Métodos de operaciones de fracciones
	//EJEMPLO : void
	public void multiplicacion(Racional r) {
		int p_nuevo = this.getNum() * r.getNum();
		int q_nuevo = this.getDen() * r.getDen();
		Racional multi = new Racional(p_nuevo, q_nuevo);
		System.out.println(multi);
	}

	//EJEMPLO : return
	public Racional multiplicacion2(Racional r) {
		int p_nuevo = this.getNum() * r.getNum();
		int q_nuevo = this.getDen() * r.getDen();
		Racional multi = new Racional(p_nuevo, q_nuevo);
		return multi;
	}	


	//EJEMPLO 3
	public void multiplicacion3(Racional r1, Racional r2) {
		int p_nuevo = r1.getNum() * r2.getNum();
		int q_nuevo = r1.getDen() * r2.getDen();
		Racional multi = new Racional(p_nuevo, q_nuevo);
		System.out.println(multi);
	}	

	//Metodo para la division
	public Racional division(Racional r) {
		int p_nuevo = this.getNum() * r.getDen();
		int q_nuevo = this.getDen() * r.getNum();
		Racional divi = new Racional(p_nuevo, q_nuevo);
		return divi;
	}


	public Racional suma(Racional r) {

		int p_nuevo=0;
		int q_nuevo=0;

		//Revisar si es una suma sencilla
		if(this.getDen() == r.getDen()) {
			p_nuevo = this.getNum() + r.getNum();
			q_nuevo = this.getDen();
		} else {
			p_nuevo = (this.getNum() * r.getDen() +  (this.getDen() * r.getNum());
			q_nuevo = this.getDen() * r.getDen();
		}
		Racional suma = new Racional(p_nuevo, q_nuevo);
		return suma;
	}



	//Método toString
	public String toString() {
		String representacion="";

		if(p<0 && q<0 || p>=0 && q<0) {
			int p1 = p*-1;
			int q1 = q*-1;
			representacion = p1 + "/" + q1;

		} else {
			representacion = p + "/" + q;
		}

		return representacion;
	}




}

