public class PlayCardGames {
    public static void main(String[] args) {
        // Polymorphic array of CardGame objects
        CardGame[] games = { new Poker(), new Bridge() };

        for (CardGame game : games) {
            game.displayDescription();
            game.shuffle();
            game.deal();
            System.out.println("--------------------------------------------------");
        }
    }
}