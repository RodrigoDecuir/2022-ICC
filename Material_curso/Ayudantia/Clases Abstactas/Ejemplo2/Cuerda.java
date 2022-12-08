public class Cuerda {

    private boolean afinada;
    
    public Cuerda() {
        afinada = false;
    }

    public void afinar() {
        afinada = true;
    }

    public String sonar() {
        return "Estoy sonando WOAAAAHH";
    }

    public String toString() {
        return "Soy una cuerda";
    }

}