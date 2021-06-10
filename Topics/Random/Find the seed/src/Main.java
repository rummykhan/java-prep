import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        //int a = 7, b = 9, n = 4, k = 100;

        int seed = -1;
        int max = -1;

        for (int i = a; i <= b; i++) {

            Random random = new Random(i);
            int maxRandom = -1;

            for (int j = 0; j < n; j++) {
                int nextInt = random.nextInt(k);

                if (nextInt > maxRandom) {
                    maxRandom = nextInt;
                }
            }

            if (max == -1) {
                max = maxRandom;
                seed = i;
                continue;
            }

            if (maxRandom < max) {
                max = maxRandom;
                seed = i;
            }

        }

        System.out.println(seed);
        System.out.println(max);
    }
}
