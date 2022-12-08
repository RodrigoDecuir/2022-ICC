import java.util.Random;

public class Mayonesa extends Instrumento {

    private boolean[] lenguatazos = new boolean[10];
    private boolean aLenguatear;

    public Mayonesa() {
        this.setNombre("Mayonesa");
        this.setTipo("Sabor");
        for (int i = 0; i < lenguatazos.length; i++) {
            lenguatazos[i] = false;
        }
        aLenguatear = false;
    }

    public void afinar() {
        aLenguatear = true;
    }

    public void tocar() {
        Random rnd = new Random();
        for (int i = 0; i < lenguatazos.length; i++) {
            lenguatazos[i] = rnd.nextBoolean();
            System.out.println("Lenguatazo " + i + ": " + lenguatazos[i]);
        }
    }
}