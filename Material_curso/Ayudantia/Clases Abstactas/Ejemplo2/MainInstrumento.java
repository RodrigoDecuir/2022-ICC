public class MainInstrumento {

    public static void main(String[] args) {

        Instrumento gui = new Guitarra();
        Instrumento may = new Mayonesa();


        System.out.println(gui);
        System.out.println(may);

        gui.tocar();
        may.tocar();
    }

}