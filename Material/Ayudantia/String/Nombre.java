/**
 * Clase de muestra para alterar el orden del nombre de una persona
 * @author yo mero
 * @version -3.0
 */
public class Nombre {

  String nombreReal; // nombre completo
  String nombre; // nombre(s)
  String apellidoPaterno; // apellido paterno
  String apellidoMaterno; // apellido materno
  String nombreModificado; // nombre modificado

  /**
   * Constructor de la clase que inicializa el nombre
   * @param nombreEntrada nombre ingresado por teclado
   */
  public Nombre(String nombreEntrada) {
    nombreReal = nombreEntrada;
    nombre = "";
    apellidoPaterno = "";
    apellidoMaterno = "";
    nombreModificado = "";
  }

  /**
   * Metodo para obtener el nombre real ingresado
   * @return nombre ingresado
   */
  public String getNombreReal() {
    return nombreReal;
  }

  /**
    * Metodo para asignar un nuevo nombre real
    * @param nuevoNombreReal nuevo nombre real a asignar
    */
  public void setNombreReal(String nuevoNombreReal) {
    nombreReal = nuevoNombreReal;
  }

  /**
   * Metodo para obtener solo el nombre
   * @return nombre de persona 
   */
  public String getNombre() {
    return nombre;
  }

  /**
    * Metodo para asignar un nuevo nombre
    * @param nuevoNombre nuevo nombre a asignar
    */
  public void setNombre(String nuevoNombre) {
    nombre = nuevoNombre;
  }

  /**
    * Metodo para obtener el apellido paterno
    * @return apellido paterno de la persona
    */
  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  /**
    * Metodo para asignar un nuevo apellido paterno
    * @param nuevoApellidoPaterno apellido paterno de la persona
    */
  public void setApellidoPaterno(String nuevoApellidoPaterno) {
    apellidoPaterno = nuevoApellidoPaterno;
  }

  /**
    * Metodo para obtener el apellido materno
    * @return apellido materno de la persona
    */
  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  /**
    * Metodo para asignar un nuevo apellido materno
    * @param nuevoApellidoMaterno apellido materno a asignar
    */
  public void setApellidoMaterno(String nuevoApellidoMaterno) {
    apellidoMaterno = nuevoApellidoMaterno;
  }

  /**
    * Metodo obtener el nombre modificado
    * @return nombre modificado de la persona 
    */
  public String getNombreModificado() {
    return nombreModificado;
  }

  /**
    * Metodo para asignar un nuevo nombre modificado
    * @param nuevoNombreModificado nuevo nombre modificado a asignar
    */
  public void setNombreModificado(String nuevoNombreModificado) {
    nombreModificado = nuevoNombreModificado;
  }

  /**
    * Metodo para modificar el orden del nombre de una persona
    * Ejemplo: Jorge, Lopez Herrera -- Herrera Lopez, Jorge
    * @param nombreR nombre real a modificar el orden
    * @return nombre modificado al orden determinado
    */
  public String modificarNombre(String nombreR) {

    int posicionNombre;
    int posicionApellidos;
    String apellidos;

    posicionNombre = nombreR.indexOf(","); // se obtiene la posicion de la coma

    setNombre(nombreR.substring(0, posicionNombre)); // se extrae el nombre

    apellidos = nombreR.substring(posicionNombre + 1, nombreR.length()).trim(); // se obtienen los apellidos

    posicionApellidos = apellidos.indexOf(" "); // se obtiene la posicion del espacio en blanco

    setApellidoPaterno(apellidos.substring(0, posicionApellidos)); // se extrae el apellido paterno

    setApellidoMaterno(apellidos.substring(posicionApellidos + 1, apellidos.length())); // se extrae el apellido materno

    setNombreModificado(getApellidoMaterno() + " " + getApellidoPaterno() + ", " + getNombre()); // se asigna el nombre modificado
 
    return getNombreModificado(); 

  }

  /**
    * Metodo para mostrar el nuevo formato del nombre
    *@return nuevo formato del nombre en mayusculas
    */
  public String toString() {
    return "\nEl formato solicitado se muestra a continuacion: \n" + 
               "->  " + getNombreModificado().toUpperCase() + "  <-";
  }

}
