package Solution5;

abstract class AbstractFileSystemNode {

    final String getParentElement() {
        return this.getClass().getSimpleName();
    }
//
//     String getNameElement(){
//     return nameElement;
//     }

    final String takePath() {
        return "//C" + "nameElement";
    }
}
