import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		InterfazPerritos ip = new InterfazPerritos();

		System.out.println("Bienvenido al sistema de la perrera");

		int valor=0;

		while(valor!=7) {
			System.out.println("Introduce una opción");
			System.out.println("1. Guardar una perrito");
			System.out.println("2. Quitar a un perrito");
			System.out.println("3. Vacunar a todos los perros");
			System.out.println("4. Ver todas las jaulas");
			System.out.println("5. Revolver las jaulas");
			System.out.println("6. Borrar todas jaulas");
			System.out.println("7. Salir");

			valor = entrada.nextInt();

			switch(valor) {
				case 1:
					ip.guardaPerros();
					break;
				case 2:
					ip.quitarPerro();
					break;
				case 3:
					ip.vacunarPerros();
					break;
				case 4:
					ip.imprimeJaulas();
					break;
				case 5:
					ip.revolverJaulas();
					break;
				case 6:
					ip.borrarTodo();
					break;
				case 7:
					System.exit(0);
					break;
				default:
					System.out.println("Opción no válida");
					break;

			}


		}

	}


}


