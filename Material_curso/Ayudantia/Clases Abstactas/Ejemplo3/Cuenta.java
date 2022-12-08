/**
 * Clase que simula una cuenta
 * @author Ramses Lopez Soto
 * @version diciembre 2017
 */
 public abstract class Cuenta{

   protected double saldo;

   /**
    * Constructor que crea una cuanta en ceros
    */
    public Cuenta(){
      saldo = 0.0;
    }

    /**
     * Metodo para retirar saldo de la cuenta
     * @param monto monto a retirar
     * @throws SaldoInsuficienteExcepcion - si no se tiene saldo suficiente
     */
     public void retirar(double monto) throws SaldoInsuficienteExcepcion {
       if (saldo < monto) {
         throw new SaldoInsuficienteExcepcion("No tienes fondos suficientes");
       }
       saldo -= monto;
    }

    /**
     * Metodo para obtener el saldo actual
     * @return double - saldo de la cuenta
     */
     public double obtenerSaldo(){
       return saldo;
     }

     /**
      * Metodo para para hacer un deposito
      * @param monto monto a depositar
      * @throws CantidadMaximaExcepcion - si el saldo es maximo
      */
      public abstract void depositar(double monto) throws CantidadMaximaExcepcion;

      /**
       * Metodo para hacer una compra
       * * @param compra compra a realizar
       * @throws SaldoInsuficienteExcepcion - si no hay fondos suficientes
       */
       public abstract void comprar(double compra) throws SaldoInsuficienteExcepcion;
 }
