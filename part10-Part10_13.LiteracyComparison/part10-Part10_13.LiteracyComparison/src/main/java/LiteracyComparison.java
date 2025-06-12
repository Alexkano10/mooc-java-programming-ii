
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<Record> records = new ArrayList<>();
        
         try {
            Files.lines(Paths.get("literacy.csv"))
                .map(line -> line.split(","))
                .forEach(parts -> {
                    String gender = parts[2].trim().split(" ")[0].toLowerCase(); // "female (%)" → "female"
                    String country = parts[3].trim();
                    int year = Integer.parseInt(parts[4].trim());
                    double percent = Double.parseDouble(parts[5].trim());

                    records.add(new Record(gender, country, year, percent));
                });
        } catch (IOException e) {
            e.printStackTrace();
        }
         Collections.sort(records); // usa compareTo
         records.forEach(System.out::println);

    }
}
