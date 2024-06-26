import java.util.List;

public class StudyGroupController {

    public StudyGroup createStudyGroup(Teacher teacher,List<Student> students){
        StudyGroupService studyGroupService=new StudyGroupService();
        StudyGroup studyGroup=studyGroupService.createStudyGroup(teacher,students);
        return studyGroup;
    }
}
