package cf222jf_lab3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Collections;


public class Deck {
	public static List<Card> cards;
	Random rand = new Random(52);

	public Deck(){
		List<Enum<Card.CardSuits>> cardSuitValues = Arrays.asList(Card.CardSuits.values());
		List<Enum<Card.CardValue>> cardValueValues =  Arrays.asList(Card.CardValue.values());

		cards = new ArrayList<Card>();
		for (Enum<Card.CardSuits>suit : cardSuitValues) {
			for(Enum<Card.CardValue> value : cardValueValues) {
				cards.add(new Card(Card.CardSuits.valueOf(suit.toString()), Card.CardValue.valueOf(value.toString())));
			}
		}

	}
	public void print(){
		for(Card card : Deck.cards) {
            System.out.println(card.suit + " " +card.value);
		}
	}
	public Deck shuffle(){
	Collections.shuffle(cards);
			
	return this;
		
	}
	public void deal(int n){
	this.shuffle();
	for(int i = 0; i < n; i++) {
		System.out.println(cards.get(i).suit + " " + cards.get(i).value);
		   
		}
	
	}
	
}