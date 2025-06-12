import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<>();
        students.add(new Student("Carlos"));
        students.add(new Student("ana"));
        students.add(new Student("Bea"));
        students.add(new Student("Alex"));

        System.out.println("Before sorting:");
        students.forEach(System.out::println);

        Collections.sort(students);  // Usa compareTo definido en Student

        System.out.println("\nAfter sorting:");
        students.forEach(System.out::println);
        
    }
}
