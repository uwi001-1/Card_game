public class Poker extends CardGame {

    public Poker() {
        super();
        cardsDealt = 5; // Standard poker hand
    }

    @Override
    public void displayDescription() {
        System.out.println("=== Game: Poker ===");
        System.out.println("Description: A popular card game where players wager on which hand is best according to specific rankings.");
    }

    @Override
    public void deal() {
        System.out.println("Dealing " + cardsDealt + " cards to a poker player:");
        for (int i = 0; i < cardsDealt; i++) {
            System.out.println("  -> " + deck[i]);
        }
        System.out.println();
    }
}