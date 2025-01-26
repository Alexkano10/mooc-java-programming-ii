
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!

        // Create a HashMap and add Book objects
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and Prejudice", 1813, "...."));

        // Test printValues method
        Program.printValues(hashmap);
        System.out.println("---");

        // Test printValueIfNameContains method
        Program.printValueIfNameContains(hashmap, "prejud");
    }
    
    //Prints all the values (Books) in the HasMap using their toString() method

    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book b : hashmap.values()) {
            System.out.println(b);
        }
    }

    //Prints only the Books whose name contains the given text

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book b : hashmap.values()) {
            if (b.getName().toLowerCase().contains(text.toLowerCase())) {
                System.out.println(b);
            }
        }
    }
}
