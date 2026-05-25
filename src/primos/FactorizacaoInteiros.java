package primos;

public class FactorizacaoInteiros {
    // Método para decomposição em factores primos
    public static void factorizar(int numero) {

        System.out.print("Factores primos: ");

        for (int i = 2; i <= numero; i++) {

            while (numero % i == 0) {

                System.out.print(i + " ");

                numero = numero / i;
            }
        }

        System.out.println();
    }

}
