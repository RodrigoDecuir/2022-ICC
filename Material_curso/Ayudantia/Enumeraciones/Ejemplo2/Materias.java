/**
  * Enumercion de ejmplo sobre las materias de la carrera
  * @author Ramses Lopez
  * @version 1.0
  */
public enum Materias {

    ALGEBRA_SUPERIOR_I("Primero", 10),
    ESTRUCTURAS_DISCRETAS("Primero", 10),
    INGLES_I("Primero", 4),
    ICC("Primero", 12),
    MATE_I("Primero", 12),

    ALGEBRA_SUPERIOR_II("Segundo", 10),
    ESTRUCTURAS_DE_DATOS("Segundo", 12),
    INGLES_II("Segundo", 4),
    GRAFICAS_Y_JUEGOS("Segundo", 10),
    MATE_II("Segundo", 12),

    ALGEBRA_LINEAL_I("Tercero", 10),
    MODELADO("Tercero", 10),
    INGLES_III("Tercero", 4),
    PROBA_I("Tercero", 10),
    MATE_III("Tercero", 12),

    AUTOMATAS("Cuarto", 10),
    LOGICA("Cuarto", 10),
    INGLES_IV("Cuarto", 4),
    ARQUI("Cuarto", 10),
    MATE_IV("Cuarto", 12),

    ALGORITMOS("Quinto", 10),
    DISTRIBUIDA("Quinto", 10),
    INGLES_V("Quinto", 4),
    BASES_DE_DATOS("Quinto", 12),
    LENGUAJES("Quinto", 10),

    INGENIERIA_DE_SOFTWARE("Sexto", 10),
    INTELIGENCIA_ARTIFICIAL("Sexto", 10),
    SISTEMAS_OPERATIVOS("Sexto", 10),

    COMPILADORES("Septimo", 10),
    COMPLEJIDAD("Septimo", 10),
    REDES("Septimo", 10),

    CONCURRENTE("Octavo", 10),
    CRIPTOGRAFIA("Octavo", 10),
    INGLES_VI("Octavo", 4);

    private String semestre;
    private int creditos;

    /**
      * Constructor privado para iniclizar las variables
      * @param sem semestre de una materia
      * @param cred creditos de una mareria
      */
    private Materias(String sem, int cred) {
        semestre = sem;
        creditos = cred;
    }

    /**
      * Devuelve el semestre de una materia
      * @return semestre de una materia
      */
    public String getSemestre() {
        return semestre;
    }

    /**
      * Devuelve los creditos de una materia
      * @return creditos de una materia
      */
    public int getCreditos() {
        return creditos;
    }
}