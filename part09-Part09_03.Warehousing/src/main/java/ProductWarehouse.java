public class ProductWarehouse extends Warehouse {
    private String productName;

    //Constructor
    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    //Getter para el nombre del producto
    public String getName() {
        return this.productName;
    }

    //Setter para el nombre del producto
    public void setName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return this.productName + ", " + super.toString();
    }

}
