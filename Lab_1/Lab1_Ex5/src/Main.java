import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите \"левую\" границу: ");
        int leftLimit = scanner.nextInt();
        System.out.print("Введите \"правую\" границу: ");
        int rightLimit = scanner.nextInt();
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        System.out.print("Числа, входящие в заданную границу: ");
        System.out.println();
        if (num1 >= leftLimit && num1 <= rightLimit )
            System.out.println(num1);
        if (num2 >= leftLimit && num2 <= rightLimit )
            System.out.println(num2);
        if (num3 >= leftLimit && num3 <= rightLimit )
            System.out.println(num3);
    }
}