
public class Ticket {
    
    private int seat;
    private int code;
    private Show show; // conexión con Show

    public Ticket(int seat, int code, Show show) {
        this.seat = seat;
        this.code = code;
        this.show = show;
    }

    public Show getShow() {
        return show;
    }

    public int getSeat() {
        return seat;
    }

    public int getCode() {
        return code;
    }
    
    
}
