

public class Program {

    public static void main(String[] args) {
        
        Show s = new Show("Inception", "21:30");
        Ticket t1 = new Ticket(12, 12345, s);
        Ticket t2 = new Ticket(13, 12346, s);

        System.out.println("Ticket 1 for: " + t1.getShow().getMovie());
        System.out.println("Ticket 2 time: " + t2.getShow().getTime());
    }

    
}
