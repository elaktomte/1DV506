package cf222jf_lab3;

public class Card {
    public enum CardSuits {Hearts,Diamonds,Clubs,Spades};
    public enum CardValue {Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King}
    public CardSuits suit;
    public CardValue value;
 
    public Card(CardSuits suit1, CardValue value1){
        suit = suit1;
        value = value1;
    }
}

