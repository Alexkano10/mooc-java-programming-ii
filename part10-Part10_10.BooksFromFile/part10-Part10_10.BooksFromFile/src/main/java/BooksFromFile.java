
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
         List<Book> books = BooksFromFile.readBooks("books.txt");

    for (Book book : books) {
        System.out.println(book.getName() + " (" + book.getPublishingYear() + "), " +
                           book.getPagecount() + " pages, by " + book.getAuthor());
    }

    }
public static List<Book> readBooks(String file) {
        try {
            return Files.lines(Paths.get(file))
                .map(line -> line.split(","))
                .filter(parts -> parts.length == 4)
                .map(parts -> new Book(
                    parts[0].trim(),                      // nombre
                    Integer.parseInt(parts[1].trim()),    // año
                    Integer.parseInt(parts[2].trim()),    // páginas
                    parts[3].trim()                       // autor
                ))
                .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
            return new ArrayList<>();
        }
    }
    
}
