package euler;

public class TotienteEuler {
    // Método para calcular o MDC
    public static int mdc(int a, int b) {

        while (b != 0) {

            int resto = a % b;

            a = b;

            b = resto;
        }

        return a;

    }

    // Método para calcular φ(n)
    public static int calcularTotiente(int n) {

        int contador = 0;

        for (int i = 1; i < n; i++) {

            if (mdc(i, n) == 1) {

                contador++;
            }
        }

        return contador;
    }
}
