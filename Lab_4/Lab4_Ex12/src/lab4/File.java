package lab4;

class File extends Directory {
    protected String fileName;

    public File(String directoryName, String fileName) {
        super(directoryName);
        this.fileName = fileName;
    }


    public String getFileName() {
        return fileName;
    }
}