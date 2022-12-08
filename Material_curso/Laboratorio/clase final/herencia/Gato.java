public class Gato extends Animales {
	private int numeroVidas;
	public Gato(String nombre, String color,int numeroVidas){
		super(nombre, color);
		this.numeroVidas = numeroVidas;
	}

	public String metodo2(){
		System.out.println(super.nombre);
		return "Soy un metodo de la clase gato";
	}

	public String generaSonido(){
		//System.out.println(super.metodo1());
		return "miauu";
	}

	@Override
	public String toString(){
		return super.toString()+" numero de vidas: "+numeroVidas;
	}

	@Override
	public String metodo1(){
		
		return "este era metodo de animales, pero lo sobre escribimos";
	}
}