

public class Main {

    public static void main(String[] args) {
        
         // Creamos un ProductWarehouseWithHistory para "Juice" con capacidad 1000.0 y saldo inicial 1000.0
         ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);

         // Realizamos algunas operaciones en el almacén
         juice.takeFromWarehouse(11.3);
         juice.addToWarehouse(1.0);
 
         // Imprimimos el análisis del producto
         juice.printAnalysis();


    }

}
