/*Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos. */

public class Ejercicio1 {

    public static void main(String[] args) {
        
        int numeroIf = 0;

        if (numeroIf > 0) {
            System.out.println("El numero " + numeroIf + " es positivo.");
        } else if (numeroIf < 0) {
            System.out.println("El numero " + numeroIf + " es negativo.");
        } else {
            System.out.println("El numero es " + numeroIf + ".");
        }
        
    }
}
