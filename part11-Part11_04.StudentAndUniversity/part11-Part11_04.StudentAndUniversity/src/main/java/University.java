import java.util.ArrayList;
import java.util.List;

public class University {
    
    private String name;
    private List<Student> students;
    
    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void addStudent(Student student) {
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}
