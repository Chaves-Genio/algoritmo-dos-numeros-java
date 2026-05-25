import java.util.Scanner;

import mdc.MaximoDivisorComum;
import euclides.AlgoritmoEuclides;
import primos.TestePrimalidade;
import primos.FactorizacaoInteiros;
import euler.TotienteEuler;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n===== ALGORITMOS DOS NÚMEROS =====");

            System.out.println("1 - Máximo Divisor Comum");
            System.out.println("2 - Algoritmo de Euclides");
            System.out.println("3 - Teste de Primalidade");
            System.out.println("4 - Factorização de Inteiros");
            System.out.println("5 - Totiente de Euler");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:

                    System.out.print("Digite o primeiro número: ");
                    int a = scanner.nextInt();

                    System.out.print("Digite o segundo número: ");
                    int b = scanner.nextInt();

                    int resultadoMDC =
                            MaximoDivisorComum.calcularMDC(a, b);

                    System.out.println("MDC = " + resultadoMDC);

                    break;

                case 2:

                    System.out.print("Digite o primeiro número: ");
                    int x = scanner.nextInt();

                    System.out.print("Digite o segundo número: ");
                    int y = scanner.nextInt();

                    int resultadoEuclides =
                            AlgoritmoEuclides.calcularMDC(x, y);

                    System.out.println("MDC = " + resultadoEuclides);

                    break;

                case 3:

                    System.out.print("Digite um número: ");
                    int numero = scanner.nextInt();

                    if (TestePrimalidade.ehPrimo(numero)) {

                        System.out.println("O número é primo.");

                    } else {

                        System.out.println("O número não é primo.");
                    }

                    break;

                case 4:

                    System.out.print("Digite um número: ");
                    int valor = scanner.nextInt();

                    FactorizacaoInteiros.factorizar(valor);

                    break;

                case 5:

                    System.out.print("Digite um número: ");
                    int n = scanner.nextInt();

                    int phi =
                            TotienteEuler.calcularTotiente(n);

                    System.out.println("φ(" + n + ") = " + phi);

                    break;

                case 0:

                    System.out.println("Programa encerrado.");
                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
