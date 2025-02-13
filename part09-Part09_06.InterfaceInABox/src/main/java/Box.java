import java.util.ArrayList;
public class Box implements Packable {
    private double maxWeight;
    private ArrayList<Packable> items;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    //Método para agregar un ítem a la caja
    public void add(Packable item) {
        if (this.weight() + item.weight() <= this.maxWeight) {
            this.items.add(item);
        } else{
            System.out.println("Box is full");
        }
    }

    @Override
    public double weight() {
        double weight = 0; 
        for (Packable item : this.items) {
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }

    
}
