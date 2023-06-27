package numeromayor;

import java.util.Arrays;
import java.util.Random;

public class NumeroMayor {

    private static final int TAMANO_VECTOR = 1000;

    public static void main(String[] args) {
        int[] vector = generarVectorAleatorio(TAMANO_VECTOR);
        imprimirVector(vector);

        // Iniciar el temporizador
        long comienzoTiempo = System.currentTimeMillis();

        int numeroMayor = buscarMayor(vector);

        // Detener el temporizador y calcular el tiempo transcurrido
        long finTiempo = System.currentTimeMillis();
        long tiempoTranscurrido = finTiempo - comienzoTiempo;

        System.out.println("El número mayor es: " + numeroMayor);
        System.out.println("Tiempo transcurrido: " + tiempoTranscurrido + " milisegundos");
    }

    private static int[] generarVectorAleatorio(int tamano) {
        int[] vector = new int[tamano];
        Random random = new Random();
        for (int i = 0; i < tamano; i++) {
            vector[i] = random.nextInt(1000);
        }
        return vector;
    }

    private static void imprimirVector(int[] vector) {
        System.out.println(Arrays.toString(vector));
    }

    private static int buscarMayor(int[] vector) {
        return Arrays.stream(vector).max().orElse(0);
    }
}