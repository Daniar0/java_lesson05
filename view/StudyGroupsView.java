public class StudyGroupsView {
    public void out(StudyGroup studyGroup){
        System.out.println(" Teacher: "+ studyGroup.getTeacher().getId());
        System.out.println("Students:");
        for (Student student : studyGroup.getStudents()) {
            System.out.println(student.getId());
            
        }
    }

}
