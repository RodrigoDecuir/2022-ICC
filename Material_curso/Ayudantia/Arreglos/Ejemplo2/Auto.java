import java.util.Random;
/**
  * Clase que simula un auto
  * @author alumnitxs ICC
  * @version 1.0
  */
public class Auto {

  private Random rnd = new Random();
  private int llantas; // numero de llantas de un auto
  private int ventanas; // numero de ventanas de un auto
  private int puertas; // numero de puertas de un auti
  private double bateria; // nivel de bateria de un auto 
  private double distancia; // distancia recorrida de un auto
  private String marca; // marca de un auto
  private String placa; // placas del auto

  /**
    * Constructor que inicializa al Auto
    * @param nuevaMarca - marca del auto
    */
  public Auto(String nuevaMarca) {
    llantas = 4;
    ventanas = 4;
    puertas = 4;
    bateria = 50.0f;
    distancia = 0.0f;
    marca = nuevaMarca;
    placa = (char) ('a' + rnd.nextInt(26)) + "22-A#4";
  }

  /**
    * Metodo para obtener el numero de llantas
    * @return numero de llantas
    */
  public int getLlantas() {
    return llantas;
  }

  /**
    * Metodo para obtener el numero de puertas
    * @return numero de llantas
    */
  public int getPuertas() {
    return puertas;
  }

  /**
    * Metodo para obtener el numero de ventanas
    * @return numero de ventanas
    */
  public int getVentanas() {
    return ventanas;
  }

  /**
    * Metodo para obtener la distancia recorrida
    * @return distancia recorrida
    */
  public double getDistancia() {
    return distancia;
  }

  /**
    * Metodo para asignar una nueva distancia recorrida
    * @param nuevaDistancia distancia nueva recorrida
    */
  public void setDistancia(double nuevaDistancia) {
    distancia = nuevaDistancia;
  }

  /**
    * Metodo para obtener el nivel de bateria
    * @return nivel de bateria
    */
  public double getBateria() {
    return bateria;
  }

  /**
    * Metodo para asignar un nuevo nivel de bateria
    * @param nuevaBateria nuevo nivel de bateria a asignar
    */
  public void setBateria(double nuevaBateria) {
    bateria = nuevaBateria;
  }

  /**
    * Metodo para obtener la marca del auto
    * @return marca del auto 
    */
  public String getMarca() {
    return marca;
  }

  /**
    * Metodo para obtener las placas del auto
    * @return placas del auto
    */
  public String getPlaca() {
    return placa;
  }

  /**
    * Metodo para que el auto avance 5 unidades
    * y baje el nivel de bateria en 2 unidades 
    */
  public void avanzar() {
    distancia += 5;
    bateria -= 2;
  }

  /**
    * Metodo para mostrar una representacion del auto
    * @return auto y caracteristicas
    */
  public String toString() {
    return " Auto \n Llantas: " + getLlantas() +
                        "\n Puertas: " + getPuertas() + 
                         "\n Ventanas; " + getVentanas() +
                         "\n Bateria: " + getBateria() + 
                         "\n Distancia: " + getDistancia() + 
                         "\n Marca: " + getMarca() +
                         "\n Placas: " + getPlaca();
  }
  
}
