/**
 * Clase que simula un triangulo
 * @see PoligonoRegular
 * @author Ramses Lopez Soto
 * @version octubre 2022
 */
 public class Triangulo extends PoligonoRegular {

   /**
    * Constructor que recibe el numero de lados y la longitud
    * @param l longitud de los lados
    */
   public Triangulo(int l){
     super(3, l);
   }

   /**
    * Metodo para calcular el area de un Triangulo
    * @return double - area del perimetro
    */
    public double area(){
      double semi = perimetro()/2;
      return Math.sqrt(semi* (Math.pow (semi - lados,3)));
    }

    /**
    * Metodo para conocer la informacion de un Triangulo
    * @return String - informacion del triangulo
    */
    @Override
    public String toString(){
      return super.toString() + "Triangulo \n" 
                 + "Numero de lados: " + obtenerNumeroLados() + "\n" 
                 + "Longitud de lado: " + obtenerLongitud() + " cm \n"
                 + "Perimetro: " + perimetro() + "cm \n"
                 + "Area: " + area() + "cm^2";
    }

 }
