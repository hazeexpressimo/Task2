import java.io.File;

public class Main {

    protected static final String baseDir = "C:\\Users\\Vadim\\test";

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        Reader reader = new Reader();
        reader.readFiles(new File(baseDir));
    }
}
