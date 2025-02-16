import java.util.HashMap;
import java.util.Map;

public class MainProgram {

    public static void main(String[] args) {
        // test your method here
        Map<String, String> names = new HashMap<>();
        
        // Agregar pares clave-valor al mapa
        names.put("1", "first");
        names.put("2", "second");

        // Llamamos al método y mostramos el resultado
        System.out.println(returnSize(names)); // Output esperado: 2

    }

    // Implement here a method returnSize, which takes a Map-object as a parameter 
    // and returns the size of the map object

    public static int returnSize(Map<String, String> map) {
        return map.size(); // Devuelve el tamaño del mapa
    }
}
