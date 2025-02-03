
import java.util.ArrayList;
import java.util.HashMap;


public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> storage = new HashMap<>();

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item){
        this.storage.putIfAbsent(unit, new ArrayList<>()); 
        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnits){
        return this.storage.getOrDefault(storageUnits, new ArrayList<>());
    }

    public void remove(String storageUnit, String item){
        if (this.storage.containsKey(storageUnit)){
            ArrayList<String> items = this.storage.get(storageUnit);
            items.remove(item);
        

        if (items.isEmpty()) {
            this.storage.remove(storageUnit);
           }
        }

    }

    public ArrayList<String> storageUnits(){
        return new ArrayList<>(this.storage.keySet());
    }

}
