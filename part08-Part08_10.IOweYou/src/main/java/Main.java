
public class Main {

    public static void main(String[] args) {
        // Test your program here

        IOU mattsIOU = new IOU();

        // Registrar deudas
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        // Consultar deudas
        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));  // Salida: 51.5
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael")); // Salida: 30.0
        System.out.println(mattsIOU.howMuchDoIOweTo("John"));    // Salida: 0.0

        // Actualizar deuda
        mattsIOU.setSum("Arthur", 10.5);
        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));  // Salida: 10.5
    

    }
}
