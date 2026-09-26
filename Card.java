public class Card {
    private String suit;
    private String value;

    // Constructor
    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    // Getters
    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }

    // toString method for easy display
    @Override
    public String toString() {
        return value + " of " + suit;
    }
}