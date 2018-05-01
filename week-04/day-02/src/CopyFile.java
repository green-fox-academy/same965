import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful

        String filename1 = "my-file.txt";
        String filename2 = "lines.txt";

        Boolean copySuccessful = copyFile(filename1, filename2);
        System.out.println(copySuccessful);
    }

    private static Boolean copyFile(String filename1, String filename2) {
        boolean copySuccessful = true;
        Path filePath1 = Paths.get(filename1);
        Path filePath2 = Paths.get(filename2);

        try {
            List<String> content = Files.readAllLines(filePath1);
            Files.write(filePath2, content);
        } catch (IOException e) {
            copySuccessful = false;
        }
        return copySuccessful;
    }
}
