import java.util.Scanner;

public class InterfazPerritos {
	
	Perro[] jaulas = new Perro[5];

	public void guardaPerros() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Guardar perrito");
		//Revisamos si aún hay espacio

		int contador=0;

		for (int i=0; i<jaulas.length ; i++ ) {
			if(jaulas[i]==null) {
				contador++;
			}
		}

		if(contador!=0) {

			System.out.println("Escribe la informació del perrito");
			System.out.println("Dame su nombre");
			String nombrePerritoNuevo = entrada.nextLine();
			System.out.println("Dame su raza");
			String razaPerritoNuevo = entrada.nextLine();

			Perro p = new Perro(nombrePerritoNuevo, razaPerritoNuevo);

			boolean SePuede=true;

			//Revisar nombres
			for (int i=0; i<jaulas.length ; i++ ) {
				if(jaulas[i]!=null) {
					String nombreA = jaulas[i].getNombre();
					if(nombreA.equals(nombrePerritoNuevo)) {
						SePuede = false;
					}
				}
			}


			if(SePuede) {

				for (int i=0; i<jaulas.length ; i++ ) {
					if(jaulas[i]==null) {
						jaulas[i] = p;
						break;
					}
				}
			} else {

				System.out.println("Ya hay un perro con ese nombre, piensa en otro nombre");
			}

		} else {

			System.out.println("Ya no hay espacio");
		}

	}

	public void imprimeJaulas() {
		for (int i=0; i<jaulas.length ; i++ ) {
			if(jaulas[i]!=null) {
				System.out.println(jaulas[i]);
			}
		}
	}

	public void quitarPerro() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Borrar perrito");
		System.out.println("Escribe la informació del perrito");
		System.out.println("Dame el nombre del perrito que vas a quitar");
		String n = entrada.nextLine();

		boolean sePudoBorrar=false;

		for (int i=0; i<jaulas.length ; i++ ) {
			if(jaulas[i]!=null) {
				String nom = jaulas[i].getNombre();
				if(nom.equals(n)) {
					jaulas[i] = null;
					sePudoBorrar=true;
				}
			}
		}

		if(sePudoBorrar) {
			System.out.println("Perrito quitado");
		} else {
			System.out.println("Ese perrito no se encontró");
		}


	}



}


