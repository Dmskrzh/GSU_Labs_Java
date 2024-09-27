import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите ограничения для чисел Фибоначчи: ");

        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();

        int result = 1;
        int num = 1, temp;
        System.out.println(num);
        System.out.println(num);
        while (true) {
            temp = result;
            result = num + result;
            num = temp;
            if (result < limit)
                System.out.println(result);
            else break;
        }
    }
}