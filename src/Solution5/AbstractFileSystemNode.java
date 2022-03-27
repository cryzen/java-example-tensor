package Solution5;

abstract class AbstractFileSystemNode {

    final String getParenElement() {
        return this.getClass().getSimpleName();
    }

    String getNameElement() {
        return this.getClass().getSimpleName();
    }

    final String getPath() {
        return "/" + getNameElement();
    }
}
