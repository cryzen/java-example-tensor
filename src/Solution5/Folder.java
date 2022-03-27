package Solution5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Folder extends AbstractFileSystemNode {

    private final String folderName;

    private final List<Folder> folderList = new ArrayList<>();

    public String getFolderName() {
        return folderName;
    }

    public Folder(String folderName){
        this.folderName = folderName;
    }

    public Folder(String folderName, Folder... folders) {
        this.folderName = folderName;

        folderList.addAll(Arrays.asList(folders));
    }

    public List<Folder> getChildElements() {
        return new ArrayList<Folder>(folderList);
    }

    @Override
    public String getNameElement() {
        return getFolderName();
    }

    @Override
    public String toString() {
        return getFolderName();
    }

}
