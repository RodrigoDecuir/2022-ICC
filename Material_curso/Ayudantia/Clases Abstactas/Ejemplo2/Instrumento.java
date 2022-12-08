/**
  * Clase abstracta que simula un instrumento
  * @author Ramses Lopez Soto
  * @version 2022
  */
  public abstract class Instrumento {

    private String tipo;
    private String nombre;

    /**
      * Constructor por omision
      */
    public Instrumento() {}

    /**
       * Metodo que devuelve el tipo de instrumento
       * @return tipo de instrumento
       */
    public String getTipo() {
        return tipo;
    }

    /**
       * Metodo que asigna un nuvo tipo de instrumento
       * @param tipo nuevo tipo de instrumento
       */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
       * Metodo que devuelve el nombre del instrumento
       * @return nombre del instrumento
       */
    public String getNombre() {
        return nombre;
    }

    /**
       * Metodo que asigna un nuevo nombre de instrumento
       * @param nombre nuevo nombre de instrumento
       */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
       * Metodo abstracto que se encarga de
       * que el instrumento toque
       */
    public abstract void tocar();

    /**
       * Metodo abstracto que afina el instrumento
       */
    public abstract void afinar();

    /**
       * Metodo que compara si dos instrumentos son iguales
       * @param obj objeto a comparar
       */
    public boolean equals(Object obj) {
        Instrumento in = (Instrumento) obj;
        return this.tipo == in.getTipo() && this.nombre == in.getNombre();

    }

    /**
       * Metodo que devuelve la informacion del instrumento
       * @return informacion del instrumento
       */
    public String toString() {
        return "Instrumento: " + this. getNombre() + "\n" + "Tipo: " + this.getTipo();
    }

  }