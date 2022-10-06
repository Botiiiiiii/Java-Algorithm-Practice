package Week3.Day3.File_read_exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NewBufferedReader {
    public void readOneByte(String filename) {
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8)){

            char line;
            line = (char) br.read();
            System.out.println(line);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        NewBufferedReader newBufferedReader = new NewBufferedReader();
        newBufferedReader.readOneByte("afile.txt");
    }
}
