import java.util.ArrayList;

public class Main {

    public static void printPersons(ArrayList<Person> persons) {
        // Recorre la lista de personas e imprime cada una
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        
        // Creamos instancias de Teacher y Student
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));
        
        // Imprimimos todas las personas
        printPersons(persons);
        
        // Creamos un estudiante y le damos créditos de estudio
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        int i = 0;
        while (i < 25) {
            ollie.study();
            i++;
        }
        // Imprimimos el estado de Ollie después de estudiar
        System.out.println(ollie);
    }
}