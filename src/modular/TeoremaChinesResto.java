package modular;

public class TeoremaChinesResto {
    // Resolve um sistema simples de congruências
    public static int resolver() {

        for (int x = 1; x < 100; x++) {

            if (x % 3 == 2 && x % 5 == 3) {

                return x;
            }
        }

        return -1;
    }

}
