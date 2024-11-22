package lab4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя директории: ");
        String directoryName = scanner.nextLine();
        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();
        System.out.print("Введите данные: ");
        String content = scanner.nextLine();

        TextFile textFile = new TextFile(directoryName, fileName, content);

        textFile.rename();
        textFile.deleteContent();
        textFile.appendContent();
        textFile.printContent();
    }
}