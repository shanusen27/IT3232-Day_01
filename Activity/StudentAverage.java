import java.util.ArrayList;
import java.util.List;

class  Student{
    String name;
    int marks;

    Student(String name, int marks){
        this.name=name;
        this.marks=marks;
    }
}

public class StudentAverage{
    public static void main (String[] args){
        List<Student> students = new ArrayList<>();
        
        students.add(new Student("Student01",85));
        students.add(new Student("Student02",78));
        students.add(new Student("Student03",92));
        students.add(new Student("Student04",74));
        students.add(new Student("Student05",88));

        int totalMarks = 0;
        for(Student student : students){
            totalMarks += student.marks;
        }
        double averageMarks =  totalMarks/ (double) students.size();

        System.out.println("The average marks of students: " + averageMarks);
    }
}