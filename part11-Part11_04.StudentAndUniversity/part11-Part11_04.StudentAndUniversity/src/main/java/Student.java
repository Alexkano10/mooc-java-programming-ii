
public class Student {
    
    private int studentID;
    private String name;
    private University university;

    public Student(int studentID, String name, University university) {
        this.studentID = studentID;
        this.name = name;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public University getUniversity() {
        return university;
    }
}
