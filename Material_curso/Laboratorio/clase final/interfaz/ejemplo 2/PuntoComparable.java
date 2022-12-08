import java.util.Comparator;

public class PuntoComparable implements Comparator <Punto>{

    @Override
    public int compare (Punto a, Punto b){
        if(a.obtenerX() == b.obtenerX()){
            return 0;
        }

        if(a.obtenerX() > b.obtenerX()){
            return 1;
        }else{
            return -1;
        }

    }



}