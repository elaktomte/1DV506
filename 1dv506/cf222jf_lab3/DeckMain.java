package cf222jf_lab3;

public class DeckMain {
	 
    public static void main(String[] args) {
        Deck deck = new Deck();
 
        deck.print();
        deck.shuffle();
        deck.print();
        System.out.println("gurka");
        deck.deal(4);
        
    }
    
}
