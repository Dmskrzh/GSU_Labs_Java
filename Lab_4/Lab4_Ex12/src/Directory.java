import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Directory {
    private String directoryName;
    private Path directoryPath;

    public Directory(String directoryName) throws IOException {
        this.directoryName = directoryName;
        this.directoryPath = Paths.get(directoryName);
        create();
    }

    public void create() throws IOException {
        Files.createDirectory(directoryPath);
    }

    public Path getPath() {
        return directoryPath;
    }
}