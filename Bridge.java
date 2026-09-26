public class Bridge extends CardGame {

    public Bridge() {
        super();
        cardsDealt = 13; // Standard bridge hand (entire suit or full hand fraction)
    }

    @Override
    public void displayDescription() {
        System.out.println("=== Game: Contract Bridge ===");
        System.out.println("Description: A trick-taking card game played with a complete 52-card deck by four players in partnerships.");
    }

    @Override
    public void deal() {
        System.out.println("Dealing " + cardsDealt + " cards to a bridge player:");
        for (int i = 0; i < cardsDealt; i++) {
            System.out.println("  -> " + deck[i]);
        }
        System.out.println();
    }
}