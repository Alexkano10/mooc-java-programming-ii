

public class Program {

    public static void main(String[] args) {
         Bot bot = new Bot("AlexBot");
        bot.printName();               // De Player
        bot.play();                    // De Bot
        bot.addMove("attack");         // De Bot
        bot.addMove("defend");
    }
}
