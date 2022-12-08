/**
 * Clase que simula una cuenta platino
 *
 *
 */
 public class Platino extends Cuenta{

   /**
    * Crea una cueta platino en ceros
    */
    public Platino(){
      super();
    }

    /**
     * Metodo para para hacer un deposito
     * @param monto monto a depositar
     * @throws CantidadMaximaExcepcion - si el saldo es maximo
     */
     public void depositar(double monto) throws CantidadMaximaExcepcion{
       saldo += monto;
     }

     /**
      * Metodo para hacer una compra
      * @param compra compra a realizar
      * @throws SaldoInsuficienteExcepcion - si no hay fondos suficientes
      */
      public void comprar(double compra) throws SaldoInsuficienteExcepcion{
        if (saldo < 0 || compra > saldo) {
          throw new SaldoInsuficienteExcepcion("No puedes hacer la compra");
        }
        saldo  = (saldo) - (compra) + (compra*.15);;
      }
 }
