import java.util.ArrayList;
import java.util.List;

public class E {
    private List<C> list;

    public E() {
        this.list = new ArrayList<>();
    }

    public void add(C c) {
        list.add(c);
    }

    public List<C> getList() {
        return list;
    }
    
    
}
