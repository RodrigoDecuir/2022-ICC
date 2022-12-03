
public class UsoFacultad {
	

	public static void main(String[] args) {

		Alumno normal = new Alumno("63276372", "Martin Hdz Salamanca");

		ProfesorTC profe1 = new ProfesorTC("64646","Sergio Rajsbaum Godorezky", 25);

		Ayudante ay1 = new Ayudante("6473473", "Rocío Gtz Montes", 2, profe1);

		/*System.out.println(normal);
		System.out.println(ay1);
		System.out.println(profe1);


		normal.inscribirse();
		ay1.inscribirse();
	*/


		System.out.println(ay1.regresaValorMateriasDebe());
		//System.out.println(ay1.getMateriasDebe());


	}



}

