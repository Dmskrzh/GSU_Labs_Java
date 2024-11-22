package lab4;

class File extends Directory{
    protected String fileName;

    public File(String directoryName, String fileName) {
        super(directoryName);
        this.fileName = fileName;
    }
//    public void rename(String newName) {
//        Path newPath = path.resolveSibling(newName);
//        Files.move(path, newPath);
//        this.name = newName;
//        this.path = newPath;
//    }
//
//    public void delete() {
//        Files.delete(path);
//    }

    public String getFileName() {
        return fileName;
    }
}