package primos;

public class TestePrimalidade {
    // Método que verifica se o número é primo
    public static boolean ehPrimo(int numero) {

        // Números menores ou iguais a 1 não são primos
        if (numero <= 1) {

            return false;
        }

        // Verifica divisores
        for (int i = 2; i < numero; i++) {

            if (numero % i == 0) {

                return false;
            }
        }

        return true;
    }

}
