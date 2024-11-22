package lab4;

import java.util.Scanner;

class TextFile extends File {
    protected String content;

    Scanner scanner = new Scanner(System.in);

    public TextFile(String directoryName, String fileName, String content) {
        super(directoryName, fileName);
        this.content = content;
    }

    public void rename() {
        System.out.print("Введите новое имя файла: ");
        this.fileName = scanner.nextLine();
    }

    public void printContent() {
        System.out.println("Директория: " + this.getDirectoryName());
        System.out.println("Имя файла: " + this.fileName);
        System.out.println("Данные: " + this.content);
    }

    public void appendContent() {
//        String oldContent = this.content;
        String oldContent = (this.content == null) ? "" : this.content;
        System.out.print("Введите дополнение к данным файла: ");
        this.content = oldContent + " " + scanner.nextLine();
    }

    public void deleteContent() {
        this.content = null;
    }
}