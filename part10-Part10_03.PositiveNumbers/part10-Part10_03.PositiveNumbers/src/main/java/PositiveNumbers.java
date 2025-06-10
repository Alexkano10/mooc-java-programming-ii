
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
         // Prueba opcional
        List<Integer> numbers = List.of(-5, 3, 0, 7, -2, 10);
        System.out.println(positive(numbers)); // Debería imprimir: [3, 7, 10]
    }
    
      public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                      .filter(n -> n > 0)
                      .collect(Collectors.toList());
        // Alternativa: .collect(Collectors.toCollection(ArrayList::new));
    }

}
