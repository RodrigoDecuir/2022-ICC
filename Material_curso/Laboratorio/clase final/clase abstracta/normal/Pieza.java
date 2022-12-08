/**
 * Clase abstracta que define un objeto pieza de ajedrez.
 * @author Francisco Manuel Monreal Gamboa
 * @version 1
 */
public abstract class Pieza{
    protected String color; 
    protected int x; 
    protected int y;  
   /**
     * Constructor por omision que crea una pieza 
     * con el nombre "borrar" y color "ninguno"
     */
    public Pieza(){ 
        this.color="ninguno"; 
        this.x=1; 
        this.y=1;  
    } 
   
   /** 
   * Constructor a partir de la informacion de una pieza
   * @param nombre - nombre de la pieza
   * @param color - color de la pieza
   * @param x - coordenada x de la pieza
   * @param y - coordenada y de la pieza
   */
    public Pieza(String color, int x, int y){ 
        this.color=color; 
        this.x=x; 
        this.y=y;  
    } 


    /** 
     * Metodo toString que imprime el objeto pieza como el color de la ficha
     * @return  color.
     */ 
    @Override
    public String toString(){
        return " ";
    }

    /** 
     * Metodo que nos dice el color de la ficha
     * @return  color.
     */ 
    public String getColor() { 
        return color; 
    } 

 

    /** 
     * Metodo para cambiar el color de una ficha
     * @param color
     */ 

    public void setColor(String color) { 
        this.color = color; 
    } 

    /** 
     * metodo que regresa la coordenada x de la pieza en el tablero
     * @return x
     */ 

    public int getX() { 
        return x; 
    } 

    /** 
     * metodo para asignarle la coordenada x a la pieza
     * @param x , coordenada x de la pieza
     */ 

    public void setX(int x) { 
        this.x = x; 
    } 

    /** 
     * metodo que regresa la coordenada y de la pieza en el tablero
     * @return y
     */ 

    public int getY() { 
        return y; 
    } 

    /** 
     *  metodo para asignarle la coordenada y a la pieza
     * @param y , coordenada y de la pieza
     */ 

    public void setY(int y) { 
        this.y = y; 
    } 
    
    
	 /**
     * Declaracion de un metodo abstracto que define el movimiento de las piezas
     */
    public abstract String posiblesMovimientos();
       
}
