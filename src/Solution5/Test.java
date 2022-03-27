package Solution5;

public class Test {
    public static void main(String[] args){
        Folder fs = new Folder("sub");
        Folder fs2 = new Folder("sub1");
        Folder fs3 = new Folder("sub2");

        Folder folder = new Folder("root", fs, fs2, fs3);

        System.out.println(folder.getChildElements());
        System.out.println();

        Folder fs4 = new Folder("sub4");
        Folder fs5 = new Folder("sub5");
        Folder fs6 = new Folder("sub6");

        Folder folder1 = new Folder("root1", fs4, fs5, fs6);

        Folder rootFolder = new Folder("rootRoot", folder, folder1);

        System.out.println(rootFolder.getChildElements());
        System.out.println(folder.getPath());

        System.out.println(folder1.getChildElements());

        System.out.println(fs4.getPath());

        Folder someFile = new File(fs4,"kek.txt");

        System.out.println(someFile.getPath());
    }
}


