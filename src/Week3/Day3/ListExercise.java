package Week3.Day3;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    private List<String> students; // 외부에서 수정할 수 없도록 private

    public ListExercise(){
        this.students = new ArrayList<>();
        this.students.add("송진우1");
        this.students.add("송진우2");
        this.students.add("송진우3");
        this.students.add("송진우4");
    }

    public List<String> getStudents(){
        return this.students;
    }
}
