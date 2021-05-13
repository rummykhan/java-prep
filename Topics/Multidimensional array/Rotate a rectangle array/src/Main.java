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

        int[][] rotated = rotate(matrix, rows, cols);

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] rotate(int[][] data, int rows, int cols) {
        int[][] matrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                int colIndex = rows - 1 - i;
                matrix[j][colIndex] = data[i][j];

                // 0, 0  -> 0 , 2
                // 0, 1  -> 1 , 2
                // 0, 2  -> 2 , 2
                // 0, 3  -> 3 , 2


                // 1, 0  -> 0 , 1
                // 1, 1  -> 1 , 1
                // 1, 2  -> 2 , 1
                // 1, 3  -> 3 , 1

                // 2, 0  -> 0 , 0
                // 2, 1  -> 1 , 0
                // 2, 2  -> 2 , 0
                // 2, 3  -> 3 , 0
            }
        }

        return matrix;
    }
}