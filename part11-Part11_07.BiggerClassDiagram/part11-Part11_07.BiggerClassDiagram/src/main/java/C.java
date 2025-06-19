import java.util.ArrayList;
import java.util.List;

public class C extends B implements IC {
    
    private List<E> eList;

    public C() {
        this.eList = new ArrayList<>();
    }

    public void addE(E e) {
        this.eList.add(e);
    }

    public List<E> getEs() {
        return eList;
    }
    
    
}
