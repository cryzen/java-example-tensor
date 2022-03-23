package Solution5;

class File extends AbstractFileSystemNode {
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public String getFileExtension() {
        int extension = fileName.lastIndexOf(".");
        return fileName.substring(extension + 1);
    }
}
