import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class File {
    protected String name;
    protected Path path;

    public File(String directory, String name) throws IOException {
        this.name = name;
        this.path = Paths.get(directory, name);
        create();
    }

    public void create() throws IOException {
        Files.createFile(path);
    }

    public void rename(String newName) throws IOException {
        Path newPath = path.resolveSibling(newName);
        Files.move(path, newPath);
        this.name = newName;
        this.path = newPath;
    }

    public void delete() throws IOException {
        Files.delete(path);
    }

    public String getName() {
        return name;
    }

    public Path getPath() {
        return path;
    }
}