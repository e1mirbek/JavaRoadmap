package workingWithFile;

import java.io.File;
import java.io.IOException;

public class Main {

    public static final  String PATH = "/Users/user/Desktop/test";

    public static void main(String[] args) throws IOException {

        File dir = new File(PATH);

        if (dir.exists()) {
            System.out.println("Папка существует");
        } else {
            System.out.println("Папка не существет");
        }

        File newFile = new File(dir, "index.html");
        if (!newFile.exists()) {
            newFile.createNewFile();
        }
        newFile.delete();
    }
}
