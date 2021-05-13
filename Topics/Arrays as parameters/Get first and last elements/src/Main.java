import java.util.*;

class Main {

    public static int[] getFirstAndLast(int[] data) {
        if (data.length == 1) {
            return new int[]{data[0], data[0]};
        }

        return new int[]{data[0], data[data.length - 1]};
    }

    /* Do not change code below */
    private static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}