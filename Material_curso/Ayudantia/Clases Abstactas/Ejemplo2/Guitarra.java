public class Guitarra extends Instrumento {

    private Cuerda[] cuerdas = new Cuerda[6];

    public Guitarra() {
        this.setNombre("Guitarra");
        this.setTipo("Cuerda");
        for (int i= 0; i< cuerdas.length; i++) {
            cuerdas[i] = new Cuerda();
        }
    }

    public void afinar() {
        for (Cuerda crd : cuerdas) {
            crd.afinar();
        }
    }

    public void tocar() {
        for (int i = 0; i < cuerdas.length; i++) {
            System.out.println("La cuerda "+ i + " dice: " + cuerdas[i].sonar());
        }
    }
}