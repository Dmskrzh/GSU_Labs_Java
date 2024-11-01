import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

class TextFile extends File {
    public TextFile(String directory, String name) throws IOException {
        super(directory, name);
    }

    public void printContent() throws IOException {
        String content = new String(Files.readAllBytes(path));
        System.out.println(content);
    }

    public void append(String content) throws IOException {
        FileWriter writer = new FileWriter(path.toFile(), true);
        writer.write(content);
        writer.close();
    }
}