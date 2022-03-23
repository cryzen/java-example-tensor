package Solution5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Folder extends AbstractFileSystemNode {
    private String nameFolder;
    public final List<Folder> folderList = new ArrayList<>();

    public Folder(String nameFolder) {
        this.nameFolder = nameFolder;
    }

    public Folder(Folder... folders) {
        folderList.addAll(Arrays.asList(folders));
    }

    public List<Folder> getChildElements() {
        return new ArrayList<Folder>(folderList);
    }

    public String getName() {
        return nameFolder;
    }

    @Override
    public String toString() {
        return getName();
    }

//    public int putFile(Folder folder ,File file) {
//        int indexFolder = folderList.indexOf(folder.getName());
//
//        return indexFolder;
//    }

}
