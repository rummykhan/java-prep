import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        int maxNumber = -1;
        int x = -1;
        int y = -1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int number = scanner.nextInt();
                matrix[i][j] = number;

                if (maxNumber == -1) {
                    maxNumber = number;
                    x = i;
                    y = j;
                    continue;
                }

                if (number > maxNumber) {
                    maxNumber = number;
                    x = i;
                    y = j;
                }
            }
        }

        System.out.println(x + " " + y);

    }
}