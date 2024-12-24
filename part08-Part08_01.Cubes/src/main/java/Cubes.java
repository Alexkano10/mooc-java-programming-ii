
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")){
                break;
            } try {
                int number = Integer.valueOf(input);
                System.out.println(number * number * number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number.");
                // TODO: handle exception
            }
        }
    }   
}