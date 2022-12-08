public class Prueba {
	public static void main(String [] args){
		Animales a = new Gato("juan", "naranja", 9);
		Animales b = new Perro("Rex", "cafe");

		Animales[] c = new Animales[2];
		c[0] = a;
		c[1] = b;

		for(int i = 0; i<c.length; i++){
			System.out.println(c[i].generaSonido());
		}
		//System.out.println(a.getNombre());
		//System.out.println(a.metodo1());
		//System.out.println(a.generaSonido());
		//System.out.println(a.metodo2());
		//System.out.println(a);
	}
}