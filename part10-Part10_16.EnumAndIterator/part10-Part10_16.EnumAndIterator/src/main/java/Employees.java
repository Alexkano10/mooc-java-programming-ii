import java.util.*;

public class Employees {
    
     private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }
    
     public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }
     
     public void add(List<Person> peopleToAdd) {
        this.employees.addAll(peopleToAdd);
    }
     
    public void print() {
        for (Person p : this.employees) {
            System.out.println(p);
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            Person next = iterator.next();
            if (next.getEducation() == education) {
                System.out.println(next);
            }
        }
    }
    
    public void fire(Education education) {
    Iterator<Person> iterator = this.employees.iterator();

    while (iterator.hasNext()) {
        if (iterator.next().getEducation() == education) {
            iterator.remove(); // ¡seguro y correcto!
        }
    }
}

}
