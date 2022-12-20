
public class Colores {
  

    public static void main(String[] args) {
        

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_YELLOW = "\u001B[33m";

        System.out.println(ANSI_YELLOW + "Texto de colores " + '\u2600' + ANSI_RESET);
        
    }
}