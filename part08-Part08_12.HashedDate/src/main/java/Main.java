
public class Main {

    public static void main(String[] args) {
        // make test programs here
        SimpleDate date1 = new SimpleDate(1, 2, 2000);
        SimpleDate date2 = new SimpleDate(1, 2, 2000);
        SimpleDate date3 = new SimpleDate(5, 6, 2010);

        System.out.println("HashCode de date1: " + date1.hashCode());
        System.out.println("HashCode de date2: " + date2.hashCode());
        System.out.println("HashCode de date3: " + date3.hashCode());

        System.out.println("¿date1 es igual a date2? " + date1.equals(date2));
        System.out.println("¿date1 es igual a date3? " + date1.equals(date3));
    }
}
