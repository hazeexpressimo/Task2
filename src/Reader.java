import java.io.File;
import java.util.Objects;

public class Reader {

    private int mainCount = 0;

    protected void readFiles(File baseDirectory) {
        Parent parent = new Parent();
        if (baseDirectory.isDirectory()) {
            if (Objects.requireNonNull(baseDirectory.listFiles()).length > 0) {
                for (File file : Objects.requireNonNull(baseDirectory.listFiles())) {
                    if (file.isFile()) {
                        if ((file.getParentFile().getAbsolutePath().equals(Main.baseDir)) && (mainCount == 0)) {
                            System.out.println("╒ Main directory: " + parent.getParentPath(file));
                            mainCount++;
                        }
                        System.out.println("╘═════ " + file.getName() + " file!");
                    } else {
                        System.out.println("╒ Directory: " + file.getName());
                        readFiles(file);
                    }
                }
            } else {
                System.out.println("╘═════ Directory is empty!");
            }
        }
    }
}

