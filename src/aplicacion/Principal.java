package aplicacion;

public class Principal {
	    // La clase main se encarga de imprimir el número PI mediante el método de la clase Matematicas

    /** 
     * @param args  el parámetro args es un array de cadenas que contiene los argumentos pasados al programa Java desde la línea de comandos al ejecutarlo. 
     * Devuelve una cadena de texto con la aproximación del número PI.
     */
    public static void main(String[] args) {
        int pasos = Integer.parseInt(args[0]);
        double piAproximado = Matematicas.generarNumeroPi(pasos);
        System.out.println("El número PI es " + piAproximado);
    }
}




