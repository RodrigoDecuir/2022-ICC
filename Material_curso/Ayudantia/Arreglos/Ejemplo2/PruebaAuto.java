/**
  * Clase para probrar la clase Auto
  * @see Auto
  * @author alumnitxs de ICC
  * @version 1.0
  */
public class PruebaAuto {
    public static void main(String[] args) {

        Auto a1 = new Auto("McQueen");
        System.out.println("" + a1 + "");
        a1.avanzar();
        System.out.println("\nEl auto avanzo\n");
        System.out.println("" + a1 + "\n");

        Auto a2 = new Auto("Sally");

        Auto a3 = new Auto("Mate");

        Auto a4 = new Auto("Bob");

        Auto[] autos = {a1, a2, a3, a4};

        System.out.println("Creamos un arreglo de Autos:");
        String as = "[\n\n" + autos[0].toString();
        for (int i = 0; i < autos.length; i ++) {
            as += ", \n\n" + autos[i].toString();
        }
        as += "\n\n]";
        System.out.println(as);
        System.out.println();

        System.out.println("Obtenemos la marca y las placas de cada auto: ");

        for (Auto a : autos) {
            System.out.println("Marca: " + a.getMarca() + "\n Placas: " + a.getPlaca());
        }
    }
}