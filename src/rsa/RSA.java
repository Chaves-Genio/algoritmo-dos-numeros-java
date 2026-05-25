package rsa;

public class RSA {
    public static void executarRSA() {

        // Números primos
        int p = 3;
        int q = 11;

        // Produto dos primos
        int n = p * q;

        // Totiente de Euler
        int phi = (p - 1) * (q - 1);

        // Chave pública
        int e = 7;

        // Chave privada
        int d = 3;

        // Mensagem original
        int mensagem = 4;

        // Processo de cifragem
        int cifra =
                (int) Math.pow(mensagem, e) % n;

        // Processo de decifragem
        int original =
                (int) Math.pow(cifra, d) % n;

        System.out.println("Mensagem original: "
                + mensagem);

        System.out.println("Mensagem cifrada: "
                + cifra);

        System.out.println("Mensagem decifrada: "
                + original);
    }

}
