//hola
import java.util.Scanner;
import java.lang.System;
//me gusta el ajedrez :D
public class Main{
    public static void main(String[] hola){
	Scanner rl = new Scanner(System.in);
	Scanner ri = new Scanner(System.in);
	Piezas peon = new Peon("1,1");
	Piezas caballo;
	Piezas torre = new Torre("1,1");
	Tablero tab;
	String[] movi;
	String posicion;
	int x=0,poli=0,poliY=0;
	

	do{
	    tab = new Tablero();
	    System.out.println("***ELIGE LA PIEZA**");
	    System.out.println("1 - Caballo\n2 - Peon\n3 - Torre\n0 - Salir");
	    do{
		try{
		    poli = 0;
		    x = ri.nextInt();
		}catch(Exception e){
		    System.out.println("caracter invalido");
		    ri.nextLine();
		    poli = 1;
		}				
		switch(x){
		case 1:
		    do{
			do{
			    System.out.println("escribe la posicion n,n");			  
			    posicion = rl.nextLine();		    
			    caballo = new Caballo(posicion);
			    
			    try{
				x = 0;
				poli = (caballo.getX()>8||caballo.getX()<1 ? 1 : 0);
				poliY = (caballo.getY()>8||caballo.getY()<1 ? 1 : 0);
			    }catch(Exception e){
				System.out.println("parametro invalido");				
				x=1;
			    }
			}while(x!=0);
		    }while(poli!=0||poliY!=0);
		    
		    tab.colocarPieza(caballo);
		    tab.posiblesMovimientos(caballo.posiblesMov());
		    tab.getTablero();

		    movi = caballo.posiblesMov();
		    System.out.println("Movimientos: ");
		    for(int i=0; i<movi.length; i++){
			if(movi[i]==null){}
			else{System.out.print("("+movi[i]+"), ");}
		    }
		    
		    poliY = 1;
		    ;break;
		    
		case 2:
		    do{
			do{
			    System.out.println("escribe la posicion n,n");			  
			    posicion = rl.nextLine();		    
			    peon = new Peon(posicion);
			    
			    try{
				x = 0;
				poli = (peon.getX()>8||peon.getX()<1 ? 1 : 0);
				poliY = (peon.getY()>8||peon.getY()<1 ? 1 : 0);
			    }catch(Exception e){
				System.out.println("parametro invalido");				
				x=1;
			    }
			}while(x!=0);
		    }while(poli!=0||poliY!=0);
		    
		    tab.colocarPieza(peon);
		    tab.posiblesMovimientos(peon.posiblesMov());
		    tab.getTablero();

		    movi = peon.posiblesMov();
		    System.out.println("Movimientos: ");
		    for(int i=0; i<movi.length; i++){
			if(movi[i]==null){}
			else{System.out.print("("+movi[i]+"), ");}
		    }
		    
		    poliY = 1;
		    ;break;
		    
		case 3:
		    do{
			do{
			    System.out.println("escribe la posicion n,n");			  
			    posicion = rl.nextLine();		    
			    torre = new Torre(posicion);
			    
			    try{
				x = 0;
				poli = (torre.getX()>8||torre.getX()<1 ? 1 : 0);
				poliY = (torre.getY()>8||torre.getY()<1 ? 1 : 0);
			    }catch(Exception e){
				System.out.println("parametro invalido");				
				x=1;
			    }
			}while(x!=0);
		    }while(poli!=0||poliY!=0);
		    
		    tab.colocarPieza(torre);
		    tab.posiblesMovimientos(torre.posiblesMov());
		    tab.getTablero();

		    movi = torre.posiblesMov();
		    System.out.println("Movimientos: ");
		    for(int i=0; i<movi.length; i++){
			if(movi[i]==null){}
			else{System.out.print("("+movi[i]+"), ");}
		    }
		    
		    poliY = 1;
		    ;break;
		    
		case 0:
		    System.out.println("Adiós :C");
		    poliY = 0;break;
		default:System.out.println("numero malo");
		    poli = 1;break;
		}		
		
	    }while(poli!=0);

	    if(poliY==1){
		System.out.println("\n\nvolver al menú? \n1-si // otro numero - no");
		do{
		    try{
			poli = 0;
			x = ri.nextInt();
		    }catch(Exception e){
			System.out.println("parametro invalido");
			ri.nextLine();
			poli = 1;
		    }
		}while(poli!=0);	    
		x = (x==1 ? 1 : 0);
	    }
	}while(x!=0);

    }
}
