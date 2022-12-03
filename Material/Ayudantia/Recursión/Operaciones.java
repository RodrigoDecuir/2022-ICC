import java .util.Scanner;
/**
  * Clase que muestra operaciones
  * aritmeticas de forma recursiva
  * @see DivivionEntreCeroException
  * @see NumeroNegativoException
  * @see TresCifrasException
  * @author Ramses Lopez Soto
  * @version 1.0
  */
public class Operaciones {


    public Operaciones () {}

    /**
      * Metodo que realiza la suma de 
      * dos numeros de forma recursiva
      * @param n numero entero
      * @param m numero entero
      * @return suma de dos numeros
      */
    private double sumaR(int n, int m) {
        if (n == 0) {
            return m;    // Caso Base
        } else if (m == 0) {  
            return n;    // Caso Base
        } else {
            return 1 + this.sumaR(n, m - 1);  // Caso Recursivo
        }
    }

    /**
      * Metodo que realiza la resta de 
      * dos numeros de forma recursiva
      * @param n numero entero
      * @param m numero entero
      * @return resta de dos numeros
      */
    private double restaR(int n, int m) {
        if (m == 0) {
            return n;       // Caso Base
        } else if (n == 0) {
            return -m;      // Caso Base
        } else {
            return this.restaR(n, m - 1) - 1;  // Caso Recursivo
        }
    }

    /**
      * Metodo que realiza la multiplicacion
      * de dos numeros de forma recursiva
      * @param n numero entero
      * @param m numero entero
      * @return multiplicacion de dos numeros 
      */
    private double multiplicacionR(int n, int m) {
        if (m == 0|| n == 0) {
            return 0;     // Caso Base
        } else if (m < 0) {
            return -n + this.multiplicacionR(n, m + 1);   // Caso Recursivo
        } else {
            return n + this.multiplicacionR(n, m - 1);    // Caso Recursivo
        }
    }

    /**
      * Metodo que realiza la division de 
      * dos numeros de forma recursiva
      * @param n numero entero
      * @param m numero entero
      * @return division de dos numeros
      * @throws DivisionEntreCeroException si el segundo operador es 0
      */
    private double divisionR(int n, int m) throws DivisionEntreCeroException {
        if (m == 0) {  // Excepcion
            throw new DivisionEntreCeroException("No puedes dividir entre cero");
        } else if ((n == 0) || ((n - m) < 0)) {                   
            return 0;    // Caso Base
        } else {
            return 1 + this.divisionR(n - m, m);   // Caso Recursivo
        } 
    }

    /**
      * Metodo que realiza la potencia
      * de dos numeros de forma recursiva
      * @param n numero entero
      * @param m numero entero
      * @return potencia de un numero n a la m
      */
    private double potenciaR(int n, int m) {
        if (m == 0) {   
            return 1;    // Caso Base
        } else {
            return n * this.potenciaR(n, m - 1);   // Caso Recursivo
        }
    }

    /**
      * Metodo que calcula el factorial de un numero
      * @param n numero entero
      * @return factorial de un numero
      */
    private double factorialR(int n) {
        if (n <= 1) {
            return 1;   // Caso Base
        } else {
            return n * this.factorialR(n - 1);    // Caso Recursivo
        }
    }

    /**
      * Metodo que calcula el factorial
      * @param n numero entero
      * @return factorial de un numero
      */
    private double factorialR2(int n) {
        return this.factorialCola(n, 1);
    }

    /**
      * Metodo que calcula el factorial
      * usando recursion de cola
      * @param n numero entero
      * @param acc acumulador 
      * @return factorial de un numero
      */
    private double factorialCola(int n, int acc) {
        if (n == 0) {
            return acc;   // Caso Base
        } else {
            return this. factorialCola(n - 1, n * acc);   // Caso Recursivo
        }
    }

    /**
      * Metodo de calcula el fibonacci
      * de un numero
      * @param n numero entero
      * @return fibonacci de un numero
      */
    private double fibonacciR(int n) {
        if (n == 0) {
            return 0;   // Caso Base
        } else if (n == 1) {
            return 1;   // Caso Base
        } else {
            return this.fibonacciR(n - 1) + this.fibonacciR(n - 2);   // Caso Recursivo
        }
    }

    /**
      * Metodo de calcula el fibonacci
      * de un numero
      * @param n numero entero
      * @return fibonacci de un numero
      * @throws NumeroNegativoException si n es negativo
      */
    private double fibonacciR2(int n) throws NumeroNegativoException {
        return this.fibonacciCola(n, 0, 1);
    }

    /**
      * Metodo de calcula el fibonacci
      * por medio de recursion de cola
      * @param n numero entero
      * @param acc1 acumulador
      * @param acc2 acumulador
      * @return fibonacci de un numero
      * @throws NumeroNegativoException si n es negativo
      */
    private double fibonacciCola(int n, int acc1, int acc2) throws NumeroNegativoException {
        if (n < 0) {
            throw new NumeroNegativoException("No puedes ingresar numeros negativos");
        } else if (n == 0) {
            return acc1;  // Caso Base
        } else if (n == 1) {
            return acc2;  // Caso Base
        } else {
            return this.fibonacciCola(n - 1, acc2, acc1 + acc2);  // Caso Recursivo
        }
    }

    /**
      * Metodo que suma los digitos de un numero
      * @param n numero entero
      * @return suma de los digitos de n
      */
    private double sumaDigitosR(int n) {
        if (n == 0) {
            return 0;    // Caso Base
        } else {
            return (n % 10) + this.sumaDigitosR(n / 10);   // Caso Recursivo
        }
    }

    /**
      * Metodo que calcula el maximo comun divisor
      * de forma recursiva
      * @param n numero entero
      * @param m numero entero
      * @return MCD de dos numeros
      */
    private double mcdR(int n, int m) {
        if (m == 0) {
            return n;    // Caso Base
        } else {
            return this.mcdR(m, n % m);   // Caso Recursivo
        }
    }

    /**
      * Metodo que calcula el minimo comun multiplo
      * de forma recursiva
      * @param n numero entero
      * @param m numero entero
      * @return mcm de dos numeros
      */
    private double mcmR(int n, int m) {
        if (n % m == 0) {
            return n;   // Caso Base
        } else {
            return n * (this.mcmR(m, n % m) / (n % m));  // Caso Recursivo
        }
        //return (n / this.mcdR(n,m)) * m; 
    }

    /**
      * Metodo que tranforma un numero a binario
      * @param n numero entero
      * @return numero en binario
      */
    private String binarioR(int n) {
        if ((n / 2) == 0) {
            return "1";
        } else {
            return this.binarioR(n / 2) + (n % 2);
        }
    }

    /**
      * Metodo que calcula la raiz cuadrada
      * de forma recursiva
      * @param n numero entero
      * @return raiz cuadrada aprox de un numero
      */
    public double raizR(int n) {
        return this.raizRAux(n, 1);
    }

    /**
      * Metodo que calcula la Auxraiz cuadrada
      * de forma recursiva
      * @param n numero entero
      * @param aux numero entero auxiliar
      * @return raiz cuadrada aprox de un numero
      */
    private double raizRAux(int n, int aux) {
        if (aux * aux == n) {
            return aux;
        } else if (aux * aux > n) {
            return this.raizRAux(n - 1, aux - 1);
        } else {
            return this.raizRAux(n, aux + 1);
        }
    }


    /**
      * Metodo que determina si un 
      * numero es armtrong
      * @param n numero entero
      * @return true si es armstrong, false en otro caso
      * @throws TresCifrasException si el numero no es de tres cifras
      * @throws NumeroNegativoException si n es menor a 0
      */
    public boolean armstrongR(int n) throws TresCifrasException, NumeroNegativoException {
        if (Integer.toString(n).length() != 3) {
            throw new TresCifrasException("El numero debe ser de tres cifras");
        } else {
            return n == this.armstrongRAux(n);
        }
    }

    /**
      * Metodo que obtiene la suma de
      * armstrong de forma recursiva
      * @param n numero entero
      * @return numero resultante de la suma
      * @throws NumeroNegativoException si n es menor a 0
      */
    private double armstrongRAux(int n) throws NumeroNegativoException {
        if (n < 0) {
            throw new NumeroNegativoException("No puedes ingresar numero negativos");
        } else if (n == 0) {
            return 0;       // Caso Base
         } else {
            return Math.pow(n % 10, 3) + this.armstrongRAux(n / 10);  // Caso Recursivo
        }
    }

    /**
      * Metodo que verifica si un 
      * numero es perfecto
      * @param n numero entero
      * @return numero resultante de la suma
      * @throws NumeroNegativoException si n es menor a 0
      */
    public boolean perfectoR(int n) throws NumeroNegativoException {
        return n == this.sumaDivisoresR(n, n - 1);
    }

    /**
      * Metodo que obtiene la suma de los 
      * divisores propios de un numero
      * @param n numero entero
      * @param m numero entero antecesor a n
      * @return numero resultante de la suma
      * @throws NumeroNegativoException si n es menor a 0
      */
    private double sumaDivisoresR(int n, int m) throws NumeroNegativoException {
        if (n < 0 || m < 0) {
            throw new NumeroNegativoException("No puedes ingresar un metodo negativo");
        } else if (m == 0) {
            return 0;     // Caso Base
        } else {
            return ((n % m == 0) ? m : 0) + this.sumaDivisoresR(n, m - 1);   // Caso Recursivo
        }
    }


    public static void main(String[] args) {

        Operaciones p = new Operaciones();

        try {
            System.out.println("Suma Recursiva: " + p.sumaR(3,5));
            System.out.println("Resta Recursiva: " + p.restaR(5, 1));
            System.out.println("Multiplicacion Recursiva: " + p.multiplicacionR(9, 3));
            System.out.println("Divison Recursiva: " + p.divisionR(43, 5));
            System.out.println("Potencia Recursiva: " + p.potenciaR(3, 5));
            System.out.println("Factorial Recursivo: " + p.factorialR(5));
            System.out.println("Factorial Cola Recursivo: " + p.factorialR2(5));
            System.out.println("Fibonacci Recursivo: " + p.fibonacciR(5));
            System.out.println("Fibonacci Cola Recursivo: " + p.fibonacciCola(5, 0, 1));
            System.out.println("Suma Digitos Recursivo: " + p.sumaDigitosR(234));
            System.out.println("MCD Recursivo: " + p.mcdR(45,120));
            System.out.println("mcm Recursivo: " + p.mcmR(45,120));
            System.out.println("Binario Recursivo: " + p.binarioR(15));
            System.out.println("Raiz Recursiva: " + p.raizR(56));
            System.out.println("Armstrong Recursivo: " + p.armstrongR(371));
            System.out.println("Perfecto Recursivo: " + p.perfectoR(6));
        } catch (DivisionEntreCeroException e) {
            System.out.println(e);
        } catch (NumeroNegativoException e) {
            System.out.println(e);
        } catch (TresCifrasException e) {
            System.out.println(e);
        } 

    }

}