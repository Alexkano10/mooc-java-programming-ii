
public class Main {

    public static void main(String[] args) {
        // Test your code here!

        CustomTacoBox customBox = new CustomTacoBox(5); // Caja con 5 tacos
        System.out.println(customBox.tacosRemaining()); // 5
        customBox.eat();
        System.out.println(customBox.tacosRemaining()); // 4
        customBox.eat();
        customBox.eat();
        customBox.eat();
        customBox.eat();
        customBox.eat(); // Intento comer más de lo que hay
        System.out.println(customBox.tacosRemaining()); // 0

    }
}
