
public class Main {

    public static void main(String[] args) {
         NoiseCapable dog = new Dog();
        dog.makeNoise();  // Dog barks

        NoiseCapable cat = new Cat("Garfield");
        cat.makeNoise();  // Garfield purrs

        Cat c = (Cat) cat;
        c.purr();         // Garfield purrs


    }

}
