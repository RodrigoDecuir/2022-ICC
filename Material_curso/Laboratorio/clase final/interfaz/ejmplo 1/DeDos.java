/**
 * Programa que implementa la interfaz Serie para hacer una serie de dos en dos
 * @author Francisco Manuel Monreal Gamboa
 * @version 1
 */
public class DeDos implements Series {
    int iniciar;
    int valor;
    
    /**
 * Constructor de la clase
 */
    DeDos(){
        iniciar=0;
        valor=0;
    }

/**
 * Metodo que regresa el digito siguiente de la serie
 * @return valor del siguiente digito de la serie
 */
    @Override
    public int getSiguiente() {
        valor+=2;
        return valor;
    }

/**
 * Metodo que reinicia la serie desde el valor inicial
 */
    @Override
    public void reiniciar() {
        valor=iniciar;
    }

/**
 * Metodo que inicia la serie con el digito pasado
 * @param x  parametro en el que se inicia la serie
 */
    @Override
    public void setComenzar(int x) {
        iniciar=x;
        valor=x;
    }
}
