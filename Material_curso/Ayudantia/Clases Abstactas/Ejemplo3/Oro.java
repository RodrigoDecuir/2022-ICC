/**
 * Clase que simula una cuenta oro}
 * @author Ramses Lopez Soto
 * @version diciembre 2017
 */
 public class Oro extends Cuenta{

   /**
    * Crea una cueta oro en ceros
    */
    public Oro(){
      super();
    }

  /**
   * Metodo para para hacer un deposito
   * @param monto monto a depositar
   * @throws CantidadMaximaExcepcion - si el saldo es maximo
   */
   public void depositar(double monto) throws CantidadMaximaExcepcion{
     if ((saldo + monto) > 30000) {
       throw new CantidadMaximaExcepcion("Solo puedes depositar: " + (30000 - saldo));
     }
     saldo += monto;
   }

   /**
    * Metodo para hacer una compra
    * @param compra compra a realizar
    * @throws SaldoInsuficienteExcepcion - si no hay fondos suficientes
    */
    public void comprar(double compra) throws SaldoInsuficienteExcepcion{
      if (saldo < 0 || compra > saldo) {
        throw new SaldoInsuficienteExcepcion("No hay saldo suficiente el la cuenta, tu saldo actual es: " + saldo);
      }
      saldo  = (saldo) - (compra) + (compra*.1);;
    }
 }
