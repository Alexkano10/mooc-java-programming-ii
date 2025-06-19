
public abstract class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(this.name);
    }

    public abstract void play();
}
