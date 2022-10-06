package Week3.Day3.File_read_exercise;

import java.io.FileReader;
import java.io.IOException;

public class ReadNBytes {
    String filename;

    public ReadNBytes(String file_name) {
        this.filename = file_name;
    }

    public String readNChars(int N) throws IOException {
        FileReader fileReader = new FileReader(this.filename);
        String str ="";
        for (int i = 0 ; i < N; i ++) {
            int asciiCd = fileReader.read();
            if(asciiCd == -1){
                return str;
            }
            str += (char) asciiCd;
        }
        return str;
    }

    public static void main(String[] args) throws IOException {
        ReadNBytes test = new ReadNBytes("afile.txt");
        System.out.println(test.readNChars(10));
    }
}
