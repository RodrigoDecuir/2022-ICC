/**
  * Clase para probar la enumeracion de materias
  * @see Materias
  * @author Ramses Lopez
  * @version 1.0
  */
public class Plan {

    public static void main(String[] args) {

        for (Materias m : Materias.values()) {
            System.out.printf("%s \t %s \t %d \n", m, m.getSemestre(), m.getCreditos());
            System.out.println("------------------------------------------------");
        }

    }
}