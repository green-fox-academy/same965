import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.

        String filename = "practice.txt";
        System.out.println(lineCount(filename));
    }

    private static int lineCount(String filename) {
        int numberOfLines = 0;

        try {
            Path filePath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filePath);
            numberOfLines = lines.size();
        } catch (IOException e) {
            numberOfLines = 0;
        }
        return numberOfLines;
    }
}
