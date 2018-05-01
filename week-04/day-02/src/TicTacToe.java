import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) throws IOException {
        // Write a function that takes a filename as string,
        // open and read it. The file data represents a tic-tac-toe
        // game result. Return 'X'/'O'/'draw' based on which player
        // has winning situation.

        System.out.println(ticTacResult("win-o.txt"));
        // should print O

        System.out.println(ticTacResult("win-x.txt"));
        // should print X

        System.out.println(ticTacResult("draw.txt"));
        // should print draw
    }

    private static String ticTacResult(String filename) throws IOException {
        Path filePath = Paths.get(filename);
        List<String> content = Files.readAllLines(filePath);

        char[][] chars = new char[3][3];
        chars[0] = content.get(0).toCharArray();
        chars[1] = content.get(1).toCharArray();
        chars[2] = content.get(2).toCharArray();

        if ((chars[1][1] == chars[0][0] && chars[1][1] == chars[2][2]) ||
            (chars[1][1] == chars[0][2] && chars[1][1] == chars[2][0])) {
            return String.valueOf(chars[1][1]);
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (chars[i][0] == chars[i][1] && chars[i][0] == chars[i][2]) {
                    return String.valueOf(chars[i][0]);
                } else if (chars[0][j] == chars[1][j] && chars[0][j] == chars[2][j]) {
                    return String.valueOf(chars[j][0]);
                }
            }
        }
        return "draw";
    }
}
