import java.util.Scanner;
public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while(true){
            System.out.println("Command: ");
            String command = this.scanner.nextLine();
            if(command.equals("stop")){
                break;
            }
            
            if(command.equals("add")){
                System.out.println("To add: ");
                String task = scanner.nextLine();
                list.add(task);
            } else if (command.equals("list")) {
                list.print();
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int number = Integer.valueOf(scanner.nextLine());
                list.remove(number);
            } else {
                System.out.println("Unknown command");
            }
        }
    }
    
}
