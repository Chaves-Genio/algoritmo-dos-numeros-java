package mdc;

public class MaximoDivisorComum {
    // Método simples para calcular o MDC
    public static int calcularMDC(int a, int b) {

        // Descobre o menor número
        int menor = Math.min(a, b);

        // Procura o maior divisor comum
        for (int i = menor; i >= 1; i--) {

            if (a % i == 0 && b % i == 0) {

                return i;
            }
        }

        return 1;
    }

}
