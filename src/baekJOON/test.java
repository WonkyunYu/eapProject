package baekJOON;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\become\\text.xml");

        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

