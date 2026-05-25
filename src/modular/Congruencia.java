package modular;

public class Congruencia {
    // Verifica congruência modular
    public static boolean verificarCongruencia(
            int a,
            int b,
            int n) {

        return (a - b) % n == 0;
    }

}
