

public class MainProgram {

    public static void main(String[] args) {
        Herd herd = new Herd();
        herd.addToHerd(new Organism(57, 66));
        herd.addToHerd(new Organism(73, 56));
        herd.addToHerd(new Organism(46, 52));
        herd.addToHerd(new Organism(19, 107));
        System.out.println("Initial positions:");
        System.out.println(herd);

        herd.move(1, -2);
        System.out.println("After moving (1, -2):");
        System.out.println(herd);
    }
}
