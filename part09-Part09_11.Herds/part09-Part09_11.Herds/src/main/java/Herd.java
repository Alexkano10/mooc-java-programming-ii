import java.util.ArrayList;
import java.util.List;


public class Herd implements Movable {
    
    private List<Movable> herd;
    
    public Herd (){
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }
    
    @Override
    public void move (int dx, int dy){
        for(Movable member : this.herd){
            member.move(dx, dy);
        }
    }
    
    @Override 
     public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Movable member : this.herd){
            sb.append(member.toString()).append("\n");
        }
        
        return sb.toString();
    }
    
    
}
