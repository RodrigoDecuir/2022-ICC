import java.util.Comparator;

public class PersonaComparable implements Comparator <Persona>{

    @Override
    public int compare (Persona a, Persona b){
        if(a.obtenerEdad() == b.obtenerEdad()){
            if(a.obtenerEstatura() < b.obtenerEstatura()){
                return -1;
            }
            return 0;
        }

        if(a.obtenerEdad() > b.obtenerEdad()){
            return 1;
        }else{
            return -1;
        }

    }


}