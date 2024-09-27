import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder outputString = new StringBuilder();

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        for (int i = inputString.length() - 1; i >= 0; i--) {
           outputString.append(inputString.charAt(i));
        }

        System.out.println(outputString);
    }
}