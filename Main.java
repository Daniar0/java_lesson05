import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher=new Teacher(1, "John", "Doe");
        List<Student> students=new ArrayList<>();
        students.add(new Student(1, "Donald", "Tramp", 12));
        students.add(new Student(2, "Kevin", "Rider", 12));

        StudyGroupController controller=new StudyGroupController();

        StudyGroup studyGroup=controller.createStudyGroup(teacher,students);
        System.out.println(studyGroup.getTeacher());
        System.out.println(studyGroup.getStudents());
        
    }
    
}
