
import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description
        
        VehicleRegistry registry = new VehicleRegistry();

        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        registry.add(li1, "Alex");
        registry.add(li2, "Chris");
        registry.add(li3, "Alex"); // Alex tiene dos coches

        System.out.println("\nAll license plates:");
        registry.printLicensePlates();

        System.out.println("\nOwners:");
        registry.printOwners();

        System.out.println("\nRemoving FI ABC-123...");
        registry.remove(li1);

        System.out.println("\nAll license plates after removal:");
        registry.printLicensePlates();
    }
}
