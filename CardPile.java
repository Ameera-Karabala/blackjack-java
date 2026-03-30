
/**
 *
 * @author 
 */
import java.util.ArrayList;
import java.util.Random;



public class CardPile {
    //Instance variables
    private ArrayList<Card> cardGroup;

    public CardPile() {
        cardGroup = new ArrayList<>();
    }
    /**
     * Add a card to the pile.
     * @param card
     */
    public void add(Card inputCard) {
       cardGroup.add(inputCard);
    }

    /**
     * Remove a card chosen at random from the pile.
     * @return
     */
    public Card removeRandom() {
        if(cardGroup.isEmpty()){
        return null; 
    }
        Random randomSelector = new Random();
        int randomIndex = randomSelector.nextInt(cardGroup.size());
        return cardGroup.remove(randomIndex); }

    /**
     * The string representation is a space separated list
     * of each card.
     * @return
     */
    @Override
    public String toString() {
       StringBuilder pileString = new StringBuilder();
       for(Card singleCard : cardGroup){
           pileString.append(singleCard.toString()).append(" ");
       }
       return pileString.toString().trim();
       }
      
    
    
    /**
     * @return the cards
     */
    public ArrayList<Card> getCards() {
        return cardGroup;
    }

    public static void main(String[] args) {
        CardPile p = new CardPile();
        p.add(new Card(2, 1, true));
        p.add(new Card(3, 2, true));
        p.add(new Card(4, 3, false));
        p.add(new Card(14, 1, true));
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("");
        CardPile deck = new CardPile();
        for(int i = 2; i < 15; i++) {
            for(int j = 0; j < 4; j++) {
                deck.add(new Card(i, j, true));
            }
        }
        for (int i = 0; i < 52; i++) {
            System.out.println((i+1) + ": " + deck.removeRandom());

        }
    }


}
