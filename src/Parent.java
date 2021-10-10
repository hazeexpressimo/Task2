import java.io.File;

public class Parent {

    protected String getParentPath(File file) {
        String parent = file.getParent();
        parent = parent.substring(parent.lastIndexOf("\\") + 1);
        return parent;
    }
}
