import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private Random random;
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
    }

    //Come up with a method to populate the deck of cards.

    public ArrayList<Card> getCards(){
        return this.cards;
    }

    public void populate() {
        for (SuitType suit : SuitType.values()) {
            for (RankType rank : RankType.values()) {
              Card card = new Card(suit, rank);
              cards.add(card);
            }
        }

    }

    public Card deal() {
       Card card = cards.remove(0);
       return card;
    }


    //Find a way to shuffle the cards.

    public void shuffleDeck() {
        Collections.shuffle(this.cards);
    }



    //Create a method to deal a card from the deck.

}
