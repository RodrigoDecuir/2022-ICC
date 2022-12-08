/**
 * Programa para mostrar el funcionamiento de arreglos multidimensionales
 * @author Francisco Manuel Monreal Gamboa
 * @version 1
 */
public class ArreglosMultidimensionales{

    public static String imprime(String [][] arr){
        String acc = getLinea()+"\n";
        for(int i=0;i<arr.length;i++){
            acc+="| ";
            for(int j=0;j<arr[i].length;j++)
                acc += arr[i][j]+" | ";
                acc +="\n"+getLinea()+"\n";
        }
        return acc;
    }

    private static  String getLinea(){
        return "-------------";
    }


    //Metodo recursivo para sacar el factorial de un numero
    /*
    private static int factorialRecursivo(int numero){
        if(numero == 0){
            return 1;
        }else{
            return numero * factorialRecursivo(numero - 1);
        }
    }
    */
    public static void main(String []pps){

        //String [][] tablero = new String [3] [3];

        //PRIMERO VEMOS EL RENGLON Y LUEGO LA COLUMNA
        //tablero[1][0] = "a";
        //tablero[2][2] = "a";
        //System.out.println(tablero[1][2]);
        //System.out.println(tablero[0][0]);

        String [][] tablero = {{"1","2","3"},{"4", "5","6"}, {"7","8","9"}};

        //System.out.println(tablero[0][0]);

        //Recorremos la matriz
        /*  
        int contador = 0;
         String a = "";
         for(int i = 0; i<tablero.length; i++){
             for(int j = 0; j<tablero[i].length; j++){
                 System.out.print(tablero[i][j]);
                 a += "ciclo "+contador+ " i="+i+" j="+j+"\n";
                 contador++;
             }
             System.out.println();
         }
        */

        //Cambiamos los elementos de nuestra matriz
          /* 
           for (int j=0; j<tablero.length; j++) {
               for (int k=0;k<tablero[j].length ;k++) {
                   tablero[j][k] = "a";
                   System.out.println(imprime(tablero));
                   System.out.println(tablero[j][k]);
               }
           }
         */  
        System.out.println(imprime(tablero));

        //Recorremos la segunda columna
         //for (int i=0; i<tablero.length; i++) {
           //  System.out.println(tablero[i][1]);
         //}

        //Recorremos el segundo renglon
        // for (int i=0; i<tablero.length; i++) {
        //     System.out.println(tablero[1][i]);
        // }

        //Recorremos diagonal
        //for(int i = 0; i < tablero.length; i++){
         //   System.out.println(tablero[i][i]);
        //}

        //System.out.println(factorialRecursivo(5));

        
    }
}
