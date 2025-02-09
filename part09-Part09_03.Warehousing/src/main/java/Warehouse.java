

public class Warehouse {

    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        if (capacity > 0.0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0.0;
        }

        this.balance = 0.0;
    }

    //Devuelve el balance actual del almacén, es decir, la cantidad de espacio ocupado por los productos.
    public double getBalance() {
        return this.balance;
    }

    //Devuelve la capacidad total del almacén
    public double getCapacity() {
        return this.capacity;
    }

    //Devuelve la cantidad de  espacio que queda en el almacen
    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }

    //Agrega una cantidad de productos al almacen
    //Si la cantidad es negativa, no se hace nada
    //Si la cantidad es cero, no se hace nada
    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            this.balance = this.balance + amount;
        } else {
            this.balance = this.capacity;
        }
    }


    //Retira una cantidad de productos del almacen
    //Si la cantidad es negativa, se retira 0
    //Si la cantidad es mayor que el balance, se retira lo que queda
    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > this.balance) {
            double allThatWeCan = this.balance;
            this.balance = 0.0;
            return allThatWeCan;
        }

        this.balance = this.balance - amount;
        return amount;
    }
    //Devuelve una representación en cadena del almacen
    public String toString() {
        return "balance = " + this.balance + ", space left " + howMuchSpaceLeft();
    }
}
