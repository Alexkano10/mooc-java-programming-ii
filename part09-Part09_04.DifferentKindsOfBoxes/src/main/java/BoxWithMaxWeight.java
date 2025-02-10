import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    
    private int maxWeight;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
        
    }
    
    @Override
    public void add(Item item){
        int currentWeight = this.items.stream().mapToInt(Item::getWeight).sum();
        if (currentWeight + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
    
}