import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {
        // 1. Crear lector de entrada y lista para libros
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        // 2. Bucle de entrada de datos
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String title = scanner.nextLine();

            // Condición de parada: línea vacía
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int age = Integer.parseInt(scanner.nextLine());

            // 3. Crear objeto Book y añadirlo a la lista
            books.add(new Book(title, age));
        }

        // 4. Mostrar resultados
        System.out.println();
        System.out.println(books.size() + " books in total.");
        System.out.println();
        System.out.println("Books:");
        
        // Ordenar por edad y luego por título
        books.sort(Comparator
            .comparing(Book::getAgeRecommendation)
            .thenComparing(Book::getTitle));

        // 5. Imprimir cada libro
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
