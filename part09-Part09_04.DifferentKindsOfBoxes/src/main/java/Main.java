

public class Main {

    public static void main(String[] args) {
        // You can test your program here

        Box box = new BoxWithMaxWeight(10);
        box.add(new Item("Book", 5));
        box.add(new Item("Laptop", 7));

        System.out.println(box.isInBox(new Item("Book", 5))); // true
        System.out.println(box.isInBox(new Item("Laptop", 7))); // false

    }
}
