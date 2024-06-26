public class Student extends User{
    int groupId;
    int id;

    public Student(int id, String name, String lastName, int groupId) {
        super(id, name, lastName);
        this.groupId = groupId;
    }


}
