import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // You can test your method here
        Set<String> names = new HashSet<>();
        
        // Agregar elementos al Set (sin duplicados)
        names.add("first");
        names.add("first");  // Este valor no se agregará, ya que "first" ya existe
        names.add("second");
        names.add("second"); // Este valor tampoco se agregará

        // Llamamos al método y mostramos el resultado
        System.out.println(returnSize(names)); // Output esperado: 2
    }

    // Método que recibe un Set como parámetro y devuelve su tamaño
    public static int returnSize(Set<String> set) {
        return set.size(); // Devuelve el tamaño del Set (número de elementos únicos)
    }
}
