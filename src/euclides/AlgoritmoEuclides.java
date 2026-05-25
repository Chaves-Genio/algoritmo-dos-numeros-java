package euclides;

public class AlgoritmoEuclides {
    // Método eficiente para cálculo do MDC
    public static int calcularMDC(int a, int b) {

        while (b != 0) {

            int resto = a % b;

            a = b;

            b = resto;
        }

        return a;
    }

}
