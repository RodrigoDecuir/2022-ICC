
public class Ayudante extends Alumno {
	
	int numeroMateriasDa;
	ProfesorTC asesorTesis;

	public Ayudante(String numCue, String nom, int nm, ProfesorTC asesor) {
		super(numCue, nom);	
		numeroMateriasDa = nm;
		asesorTesis = asesor;
	}

	//Setters
	public void setMateriasDa(int nm) {
		numeroMateriasDa = nm;
	}

	public void setAsesor(ProfesorTC asesor) {
		asesorTesis = asesor;
	}


	//getters
	public int getNumeroMateriasDa() {
		return numeroMateriasDa;
	}


	public ProfesorTC getAsesor() {
		return asesorTesis;
	}


	public void inscribirse() {
		System.out.println("Eres VIP puedes meter toooodas las materias que quieras");
	}


	//toString
	public String toString() {
		return "Ayudante: " + "\n" + "Número de cuenta " + super.getNumeroCuenta() + "\n" + "Nombre: " + super.getNombre() + "\n" + "Da " + numeroMateriasDa + " materias" + " y su tutor es " + asesorTesis.getNombre();
	}


}