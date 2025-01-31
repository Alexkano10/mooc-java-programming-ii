import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class VehicleRegistry {
    // tributo de instancia con el tipo HashMap<LicensePlate, String>
    private HashMap <LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (registry.containsKey(licensePlate)) {
            return false; // No sobrescribir si ya existe
        }
        registry.put(licensePlate, owner);
        return true; // Añadido con éxito
    }

    public String get(LicensePlate licensePlate) {
        return registry.get(licensePlate); // 🔍 Devuelve el dueño o null si no está
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!registry.containsKey(licensePlate)) {
            return false; // No se puede eliminar si no existe
        }
        registry.remove(licensePlate);
        return true; // Eliminado correctamente
    }

    public void printLicensePlates() {
        for (LicensePlate plate : registry.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        Set<String> printedOwners = new HashSet<>(); // 🔄 Evitar duplicados
        for (String owner : registry.values()) {
            if (printedOwners.add(owner)) { // Solo imprime si no está en el set
                System.out.println(owner);
            }
        }
    }

}