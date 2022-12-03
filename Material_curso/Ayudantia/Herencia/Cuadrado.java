/**
 * Clase que simula un cuadrado
 * @see PoligonoRegular
 * @author Ramses Lopez Soto
 * @version octubre 2022
 */
 public class Cuadrado extends PoligonoRegular {

   /**
    * Constructor que recibe el numero de lados y la longitud
    * @param l longitud de los lados
    */
   public Cuadrado(int l){
     super(4, l);
   }

   /**
    * Metodo para calcular el area de un Triangulo
    * @return double - area del cuadrado
    */
    public double area(){
      double a = longitud * longitud;
      return a;
    }

    /**
    * Metodo para conocer la informacion de un Triangulo
    * @return String - informacion del cuadrado
    */
    @Override
    public String toString(){
      return super.toString() + "Cuadrado \n" 
                 + "Numero de lados: " + obtenerNumeroLados() + "\n" 
                 + "Longitud de lado: " + obtenerLongitud() + " cm \n"
                 + "Perimetro: " + perimetro() + "cm \n"
                 + "Area: " + area() + "cm^2";
    }

 }
