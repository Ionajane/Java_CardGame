import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void canPopulateDeck() {
        deck.populate();
        assertEquals(52, deck.getCards().size());
    }
    @Test
    public void canDeal() {
        deck.populate();
        deck.deal();
        assertEquals(51, deck.getCards().size());
    }

    @Test
    public void canShuffleCards() {
        deck.populate();
        deck.shuffleDeck();
        Card cardOne = deck.deal();
        Card cardTwo = deck.deal();
        assertEquals(true, cardOne != cardTwo);
    }

    @Test
    public void canShuffleCardsTwo(){
        deck.populate();
        deck.shuffleDeck();
        Card firstCard = deck.deal();
        Card originalFirstCard = new Card (SuitType.HEARTS, RankType.ACE);
        Card secondCard = deck.deal();
        Card originalSecondCard = new Card(SuitType.HEARTS, RankType.TWO);
        assertEquals(true, firstCard != originalFirstCard);
        assertEquals(true, secondCard != originalSecondCard);
    }
}
