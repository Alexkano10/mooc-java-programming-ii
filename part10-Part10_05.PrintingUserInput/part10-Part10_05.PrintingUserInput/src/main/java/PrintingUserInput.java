
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();
        
        while (true){
            String input = scanner.nextLine();
            
            if (input.equals("")){
                break;
            }
            
            lines.add(input);
        }
        
        lines.forEach(line -> System.out.println(line));
        
        
    }
}
