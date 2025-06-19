public class Bot extends Player {

    public Bot(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Bot is playing...");
    }

    public void addMove(String move) {
        System.out.println("Move added: " + move);
    }
}