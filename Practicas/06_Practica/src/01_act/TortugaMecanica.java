/**
 * Clase para...
 * @author Rodrigo Andre Decuir Fuentes
 * @version 1.0 
 */

public class TortugaMecanica {
/*********************************/
    // atributos
    int i;// posInicial
    int j;// posInicial
/*********************************/
    // constructor
    public TortugaMecanica () {
       i = 0;
       j = 0;
    }
/*********************************/
    // get
    public int getI(){
        return i;
    }
    public int getJ(){
        return j;
    }
/*********************************/
    // set
    public void setI(int i) {
        this.i = i;
    }
    public void setJ(int j) {
        this.j = j;
    }
/*********************************/
    //INPUT
    // subir pluma
    public void subirPluma(int n) {
        if (tablero.length <= 15) {
            for (int k = tablero[i].length - 1; k <= n; k--) {
                tablero[k] =
            }
        }
    }
    // bajar pluma
    public void bajarPluma(int n) {

    }
    // arriba 
    public void T(int n) {

    }
    // abajo
    public void B(int n) {

    }
    // izquierda
    public void L(int n) {

    }
    // derecha
    public void R(int n) {

    }
    // imprimir tablero
    public void I(String[][] tablero) {
        for(int row = 0; row < tablero.length; row++) {
            for(int col = 0; col < tablero[row].length; col++) {
                tablero[row][col] = "- ";
            }
        System.out.println(); //para imprimir el arreglo en forma de matriz
        }   
    }
/**********************************/
    public String toString () {
        
        return "---";
    }
}
