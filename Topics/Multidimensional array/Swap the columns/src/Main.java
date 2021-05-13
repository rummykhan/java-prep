import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int number = scanner.nextInt();
                matrix[i][j] = number;
            }
        }

        int indexA = scanner.nextInt(), indexB = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            int newValue = matrix[i][indexB];

            matrix[i][indexB] = matrix[i][indexA];
            matrix[i][indexA] = newValue;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}