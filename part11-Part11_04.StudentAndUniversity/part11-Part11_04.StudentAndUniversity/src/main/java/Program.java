


public class Program {

    public static void main(String[] args) {
        
        University uni = new University("Universitat de Barcelona");

        Student s1 = new Student(101, "Alex", uni);
        Student s2 = new Student(102, "Andrea", uni);

        System.out.println(s1.getName() + " studies at " + s1.getUniversity().getName());
        System.out.println(s2.getName() + " studies at " + s2.getUniversity().getName());

    }
}
