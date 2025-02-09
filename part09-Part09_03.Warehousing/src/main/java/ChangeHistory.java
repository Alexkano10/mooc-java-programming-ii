
import java.util.ArrayList;
public class ChangeHistory {

    private ArrayList<Double> history;
    
    //Constructor
    public ChangeHistory() {
        history = new ArrayList<Double>();
    }

    //Método para añadir un nuevo estado del historial
    public void add(double status) {
        history.add(status);
    }
    //Método para limpiar el historial
    public void clear() {
        history.clear();
    }

     // Método que devuelve el valor máximo del historial
     public double maxValue() {
        if (history.isEmpty()) {
            return 0.0;
        }
        double max = history.get(0);
        for (double value : history) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // Método que devuelve el valor mínimo del historial
    public double minValue() {
        if (history.isEmpty()) {
            return 0.0;
        }
        double min = history.get(0);
        for (double value : history) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    // Método que devuelve el promedio de los valores del historial
    public double average() {
        if (history.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (double value : history) {
            sum += value;
        }
        return sum / history.size();
    }

    //Método para devolver uan representación en cadena del historial
    @Override
    public String toString() {
        return history.toString();
    }

}
