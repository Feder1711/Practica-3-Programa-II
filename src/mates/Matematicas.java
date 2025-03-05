package aplicacion;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Matematicas {

    public static double generarNumeroPi(int pasos) {
        Random rand = new Random();

        Supplier<Double> puntoAleatorio = () -> {
            double x = rand.nextDouble();
            double y = rand.nextDouble();
            return Math.sqrt(x * x + y * y);
        };

        long dentroCirculo = IntStream.range(0, pasos)
                .mapToObj(i -> puntoAleatorio.get())
                .filter(distancia -> distancia <= 1)
                .count();

        return 4.0 * dentroCirculo / pasos;
    }
}