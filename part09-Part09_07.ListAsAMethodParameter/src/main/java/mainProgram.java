import java.util.List;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // test your method here
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");

        // Llamamos al método y mostramos el resultado
        System.out.println(returnSize(names)); // Output esperado: 3


    }

    // Implement here a method returnSize
    // which returns the size of the list given to it
    //as a parameter

    public static int returnSize(List<String> list) {
        return list.size();
    }
}
