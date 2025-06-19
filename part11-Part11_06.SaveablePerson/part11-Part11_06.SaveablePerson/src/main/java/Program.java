

public class Program {

    public static void main(String[] args) {
        
        Person alex = new Person("Alex", "Calle Falsa 123");
        
        alex.save();  // Simula guardar
        alex.load("Nueva Dirección 456");  // Simula cargar nueva dirección
        alex.delete();  // Simula eliminación
    

    }
}
