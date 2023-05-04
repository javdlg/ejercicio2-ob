/*Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación. */

public class Ejercicio5 {
    public static void main(String[] args) {

        String estacion = "verano";

        switch (estacion) {
            case "verano":
                System.out.println("la estacion es " + estacion + ".");
                break;
            case "otoño":
                System.out.println("la estacion es " + estacion + ".");
                break;
            case "invierno":
                System.out.println("la estacion es " + estacion + ".");
                break;
            case "primavera":
                System.out.println("la estacion es " + estacion + ".");
                break;
            default:
                System.out.println("Debe indicar una estacion valida.");
                break;
        }
    }
}
