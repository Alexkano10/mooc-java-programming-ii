
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!

        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        // Pruebas de los métodos
        Program.printKeys(hashmap);
        System.out.println("---");
        Program.printKeysWhere(hashmap, "i");
        System.out.println("---");
        Program.printValuesOfKeysWhere(hashmap, ".e");
    }
    

    public static void printKeys(HashMap<String, String> hashmap) {
        for(String key : hashmap.keySet()){
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for(String key : hashmap.keySet()){
            if(key.contains(text)){
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for(String key : hashmap.keySet()){
            if(key.contains(text)){
                System.out.println(hashmap.get(key));
            }
        }
    }
}
