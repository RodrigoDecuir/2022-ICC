/**
 * Interfaz que nos permite crear distintas series de numeros
 * @author Francisco Manuel Monreal Gamboa
 * @version 1
 */
public interface Series {
    public int getSiguiente(); //Retorna el siguiente número de la serie
    public void reiniciar(); //Reinicia
    public void setComenzar(int x); //Establece un valor inicial
}
