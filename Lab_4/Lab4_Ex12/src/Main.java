import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Directory dir = new Directory("Папка, созданная программой");
            TextFile textFile = new TextFile(dir.getPath().toString(), "Текстовый файл, созданный программой.txt");
            textFile.append("Первое добавление информации в файл.\n");
            textFile.printContent();
            textFile.rename("Новое название для текстового файла.txt");
            textFile.append("Второе добавление информации в файл.\n");
            textFile.printContent();
//            textFile.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}