

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        
        Item book = new Item("Book", 1);
        Item laptop = new Item("Laptop", 2);
        Item dumbbell = new Item("Dumbbell", 5);
        Item pen = new Item("Pen", 1);

        // Crear maleta con peso máximo 5 kg
        Suitcase suitcase1 = new Suitcase(5);
        suitcase1.addItem(book);
        suitcase1.addItem(laptop); // total 3kg

        // Otra maleta
        Suitcase suitcase2 = new Suitcase(10);
        suitcase2.addItem(dumbbell); // 5kg
        suitcase2.addItem(pen);      // total 6kg

        // Crear Hold con máximo 15 kg
        Hold hold = new Hold(15);
        hold.addSuitcase(suitcase1); // 3kg
        hold.addSuitcase(suitcase2); // 6kg → total 9kg

        // Imprimir el peso total
        System.out.println("Total weight in hold: " + hold.totalWeight() + " kg");

        // Imprimir todos los objetos del Hold
        System.out.println("\nItems in hold:");
        hold.printItems();
        
    }

}
