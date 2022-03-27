package Solution5;

class File extends Folder {
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public File(Folder folder, String fileName) {
        super(folder.getFolderName());
        this.fileName = fileName;
    }

    @Override
    public String getNameElement() {
       return getFolderName() + "/" + getFileName();
    }

    @Override
    public String toString(){
        return "File: " + getFileName() + " is in " + getFolderName();
    }

    public String getFileExtension() {
        int extension = fileName.lastIndexOf(".");
        return fileName.substring(extension + 1);
    }
}
