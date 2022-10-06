package Week3.Day3;

import java.util.List;

public class ListExerciseMain{
    public static void main(String[] args) {
        ListExercise listExercise = new ListExercise();

        List<String> students = listExercise.getStudents(); // for문 안에서의 getStudents의 반복때문에 새로 생성

        for (String student : students){
            System.out.println(student);
        }

        System.out.println(students.size());

    }

}
