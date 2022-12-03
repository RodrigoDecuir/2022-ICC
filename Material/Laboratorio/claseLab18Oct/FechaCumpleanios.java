
public class FechaCumpleanios {
	
	int dia;
	int mes;


	public FechaCumpleanios(int d, int m) {
		dia = d;
		mes = m;
	}

	//Gets
	public int getDiaFC() {
		return dia;
	}


	public int getMesFC() {
		return mes;
	}

	public String toString() {
		return dia + "/" + mes;	
	}



}