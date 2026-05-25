package modular;

public class Fermat {
    // Método de potência modular
    public static long potenciaModular(
            long base,
            long expoente,
            long modulo) {

        long resultado = 1;

        for (int i = 0; i < expoente; i++) {

            resultado =
                    (resultado * base) % modulo;
        }

        return resultado;
    }

}
