import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            String userInput = scanner.nextLine();

            if (userInput.equals("0")) {
                break;
            }

            try {

                System.out.println(Integer.parseInt(userInput) * 10);

            } catch (Exception e) {
                System.out.println("Invalid user input: " + userInput);
            }

        }
    }
}