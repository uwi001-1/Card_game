import java.util.Random;

public abstract class CardGame {
    protected Card[] deck;
    protected int cardsDealt;

    // Constructor initializes the 52-card deck
    public CardGame() {
        deck = new Card[52];
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        int index = 0;
        for (String suit : suits) {
            for (String value : values) {
                deck[index++] = new Card(suit, value);
            }
        }
    }

    public int getCardsDealt() {
        return cardsDealt;
    }

    // Shuffle method using the Fisher-Yates algorithm
    public void shuffle() {
        Random rand = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    // Abstract methods to be implemented by child classes
    public abstract void displayDescription();
    public abstract void deal();
}