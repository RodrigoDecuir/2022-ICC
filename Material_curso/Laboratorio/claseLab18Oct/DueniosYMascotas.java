
public class DueniosYMascotas {
	



	public static void main(String[] args) {
	

		FechaCumpleanios fec = new FechaCumpleanios(2, 4);
		Duenio d = new Duenio("Martha", 33, fec);

		System.out.println(d);

		Gato g = new Gato("Botitas", "mestizo", d);
		System.out.println(g);


	}



}