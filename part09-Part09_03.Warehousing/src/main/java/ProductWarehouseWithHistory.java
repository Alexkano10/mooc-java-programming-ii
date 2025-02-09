public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistory;
    
    //constructor
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.changeHistory = new ChangeHistory();
        this.addToWarehouse(initialBalance);
    }

    //método para agregar una cantidad de productos al almacen
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changeHistory.add(this.getBalance());
    }

    //método para retirar una cantidad de productos del almacen
    public double takeFromWarehouse(double amount) {
        double removed = super.takeFromWarehouse(amount);
        this.changeHistory.add(this.getBalance());
        return removed;
    }

    //método para imprimir el historial de cambios
    public String history() {  
        return this.changeHistory.toString();
    }

    //método para imprimir el analisis del almacen
    public void printAnalysis() {
        
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + this.changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + this.changeHistory.minValue());
        System.out.println("Average: " + this.changeHistory.average());
    }


}
