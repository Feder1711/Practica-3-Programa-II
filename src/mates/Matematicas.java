package aplicacion;

import java.util.Random;

public class Matematicas {

    /**
     * Genera una aproximación al número Pi mediante el método de Montecarlo.
     * 
     * @param pasos El número de puntos generados para la aproximación de Pi.
     * @return Una aproximación del valor de Pi.
     */
    public static double generarNumeroPi(int pasos) {
        int dentroCirculo = 0;

        Random rand = new Random();
        for (int i = 0; i < pasos; i++) {
            double x = rand.nextDouble(); // Coordenada x aleatoria entre 0 y 1
            double y = rand.nextDouble(); // Coordenada y aleatoria entre 0 y 1

            double distancia = Math.sqrt(x * x + y * y);

            if (distancia <= 1) {
                dentroCirculo++;
            }
        }

        // Aproximación al número pi
        return 4.0 * dentroCirculo / pasos;
    }
}

