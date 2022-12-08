public class Animales{
	protected String nombre;
	protected String color;

	public Animales(String nombre, String color){
		this.nombre = nombre;
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setColor(String nuevoColor){
		color = nuevoColor;
	}

	public String getNombre(){
		return nombre;
	}

	public String metodo1(){
		return "Soy un metodo de la clase animales";
	}

	public String generaSonido(){
		return "sa";
	}

	public String toString(){
		return "nombre:"+ nombre +" Color:"+color;
	}
}