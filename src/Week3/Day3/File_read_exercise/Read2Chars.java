package Week3.Day3.File_read_exercise;

import java.io.FileReader;
import java.io.IOException;

public class Read2Chars {
    public String read2Chars(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char) fileReader.read();
        str += (char) fileReader.read();
        return str;
    }

    public static void main(String[] args) throws IOException {
        Read2Chars test = new Read2Chars();
        String str = test.read2Chars("afile.txt");
        System.out.println(str);

    }
}
