import java.util.Random;

public class MiArreglo{
	private int [] miArreglito = {2,7,100,12,24};

	public MiArreglo(){
		//miArreglito = {12, 100, 3};
	}

	public void agregaArreglo(int elementoAAgregar){
		int [] aux = new int [miArreglito.length+1];

      	for(int i = 0; i<miArreglito.length;i++){
          aux[i] = miArreglito[i]; 
       	}

      	aux[aux.length - 1] = elementoAAgregar;

      	miArreglito = aux;
	}

	public void eliminaDeArreglo(int elementoAEliminar){
		if(numeroApariciones(elementoAEliminar) == 0){
			System.out.println("El elmento que quieres eliminar no esta en el arreglo");
			
		}else{

			int [] aux = new int [miArreglito.length-numeroApariciones(elementoAEliminar)];

			int jj = 0;

	    	for(int i = 0; i<miArreglito.length;i++){

	        	if(elementoAEliminar != miArreglito[i]){
	            	aux[jj] = miArreglito[i];
	            	jj++;
	        	} 
	       	}

	       	miArreglito = aux;
       }
	}


	public int numeroApariciones(int elementoBuscado){
		int apariciones = 0;
		for(int k = 0; k<miArreglito.length; k++){
			if(miArreglito[k] == elementoBuscado){
				apariciones++;
			}
		}

		return apariciones;
	}

	public void swap(int indice1, int indice2){
		int aux = miArreglito[indice1];
		miArreglito[indice1] = miArreglito[indice2];
		miArreglito[indice2] = aux;
	}


	public double promedio(){
		double aux = 0;
		for(int i = 0; i< miArreglito.length; i++){
			aux = aux + miArreglito[i];
		}

		return aux / miArreglito.length;
	}

	public double maximo(){
		double max = 0;
		for(int i = 0; i < miArreglito.length; i++){
			if(miArreglito[i] > max){
				max = miArreglito[i];
			}
		}

		return max;
	}

	public void revuelve(){
		Random rand = new Random();
		int numeroGuardado = 0;
		for(int i = 0; i < miArreglito.length; i++){
			int aux = rand.nextInt(miArreglito.length);
			swap(aux,i);
			//numeroGuardado = miArreglito[aux];
			//miArreglito[aux] = miArreglito[i];
			//miArreglito[i] = numeroGuardado;
		}
	}


	public String toString(){
		String arre = "arreglo 1 \n";
       	for(int numero: miArreglito){
        	arre += numero + "\n";
      	}
      	return arre;
	}
}