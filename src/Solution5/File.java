package Solution5;

class File extends AbstractFileSystemNode {
    private final String fileName;
    private final String folderName;

    public String getFileName() {
        return fileName;
    }

    public File(Folder folder, String fileName) {
        folderName =  folder.getFolderName();
        this.fileName = fileName;
    }

    @Override
    public String getNameElement() {
       return folderName + "/" + getFileName();
    }

    @Override
    public String toString(){
        return "File: " + getFileName() + " is in " + folderName;
    }

    public String getFileExtension() {
        int extension = fileName.lastIndexOf(".");
        return fileName.substring(extension + 1);
    }
}
