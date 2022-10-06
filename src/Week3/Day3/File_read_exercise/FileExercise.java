package Week3.Day3.File_read_exercise;

import java.io.File;

public class FileExercise {
    public static void main(String[] args) {
        File dir = new File("./");
        File files[] = dir.listFiles();
        for (File file : files){
            System.out.println(file);
        }
    }

//        .\.git
//        .\.gitignore
//        .\.idea
//        .\afile.txt
//        .\java-exercise-push.iml
//        .\out
//        .\src
}
