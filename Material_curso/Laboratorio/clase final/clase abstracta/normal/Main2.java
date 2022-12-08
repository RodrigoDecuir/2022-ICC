import java.util.Scanner;
public class Main{

	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		char masPiezas='n';
		String pieza;
		int x,y;
		Peon[] peones=new Peon[10];
		Caballo[] caballos=new Caballo[10];
		Torre[] torres=new Torre[10];
		Rey[] reyes=new Rey[10];

		System.out.println("Hola, las piezas disponibles son: peon, caballo, torre, rey.");
		

		do {
			System.out.print("\nNombre de la pieza: ");
			pieza=sc.nextLine().toLowerCase().trim();
			System.out.print("\nCordenada x(solo numero): ");
			x=sc2.nextInt();
			System.out.print("\nCordenada y(solo numero): ");
			y=sc2.nextInt();
			System.out.print("\nMas piezas(s/n):");
			masPiezas=sc.next().charAt(0);

			if(pieza.equals("peon")){

				Peon peonsito=new Peon("peon",x,y);
				for(int i=0;i<peones.length;i++){
					if(peones[i]==null){
						peones[i]=peonsito;
						break;
					}
				}

			}else if(pieza.equals("caballo")){
				

				Caballo caballito=new Caballo("caballo",x,y);
				for(int i=0;i<caballos.length;i++){
					if(caballos[i]==null){
						caballos[i]=caballito;
						break;
					}
				}
			}else if(pieza.equals("torre")){
				
				Torre torresita=new Torre("torre",x,y);
				for(int i=0;i<torres.length;i++){
					if(torres[i]==null){
						torres[i]=torresita;
						break;
					}
				}
			}else if(pieza.equals("rey")){

				Rey reysito=new Rey("rey",x,y);
				for(int i=0;i<reyes.length;i++){
					if(reyes[i]==null){
						reyes[i]=reysito;
						break;
					}
				}
			}else{
				System.out.println("Digite bien su pieza :c");
			}
			sc.nextLine();

		}while(masPiezas =='s');
		
		if(!estaVacioPeon(peones)){
			for(int i=0;i<peones.length;i++){
				if(peones[i]!=null){
					System.out.println("\nLos posibles movimientos de peon en la posicion "
						+peones[i].coordenadas()+" son: "+"\n "+peones[i].posiblesMovimientos());
				}	
			}
		}
		if(!estaVacioCaballo(caballos)){
			for(int i=0;i<caballos.length;i++){
				if(caballos[i]!=null){
					System.out.println("\nLos posibles movimientos del caballo en la posicion "
						+caballos[i].coordenadas()+" son: "+"\n "+caballos[i].posiblesMovimientos());
				}
			}
		}
		if(!estaVacioTorre(torres)){
			for(int i=0;i<torres.length;i++){
				if(torres[i]!=null){
					System.out.println("\nLos posibles movimientos del caballo en la posicion "
						+torres[i].coordenadas()+" son: "+"\n "+torres[i].posiblesMovimientos());
				}
			}
		}
		if(!estaVacioRey(reyes)){
			for(int i=0;i<reyes.length;i++){
				if(reyes[i]!=null){
					System.out.println("\nLos posibles movimientos del caballo en la posicion "
						+reyes[i].coordenadas()+" son: "+"\n "+reyes[i].posiblesMovimientos());
				}
			}
		}
	}

	/**
	 * Metdodo para saber si esta vacio el arreglo de Peones
	 * 
	 * @param arreglo
	 * @return true si esta vacio el arreglo 
	 * @return false si no esta vacio el arreglo
	 */
	public static boolean estaVacioPeon(Peon[] arreglo){
		for(int i=0;i<arreglo.length;i++){
			if(arreglo[i]!=null){
				return false;
			}
		}
		return true;
	}

	/**
	 * Metdodo para saber si esta vacio el arreglo de Caballlo
	 * 
	 * @param arreglo
	 * @return true si esta vacio el arreglo 
	 * @return false si no esta vacio el arreglo
	 */
	public static boolean estaVacioCaballo(Caballo[] arreglo){
		for(int i=0;i<arreglo.length;i++){
			if(arreglo[i]!=null){
				return false;
			}
		}
		return true;
	}

	/**
	 * Metdodo para saber si esta vacio el arreglo de Torre
	 * 
	 * @param arreglo
	 * @return true si esta vacio el arreglo 
	 * @return false si no esta vacio el arreglo
	 */
	public static boolean estaVacioTorre(Torre[] arreglo){
		for(int i=0;i<arreglo.length;i++){
			if(arreglo[i]!=null){
				return false;
			}
		}
		return true;
	}

	/**
	 * Metdodo para saber si esta vacio el arreglo de Rey
	 * 
	 * @param arreglo
	 * @return true si esta vacio el arreglo 
	 * @return false si no esta vacio el arreglo
	 */
	public static boolean estaVacioRey(Rey[] arreglo){
		for(int i=0;i<arreglo.length;i++){
			if(arreglo[i]!=null){
				return false;
			}
		}
		return true;
	}
}