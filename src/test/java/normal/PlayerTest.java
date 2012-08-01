package normal;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;


public class PlayerTest {
    public class DealerStub extends Dealer {
        private Card card;

        public void setCard(Card card) {
            this.card = card;
        }

        @Override
        public Card deal() {
            return card;
        }
    }

    @Test
    public void sumIsLessThan10WithNoAce() {

        DealerStub dealer = new DealerStub();
        Player player = new Player(dealer);
        dealer.setCard(new Card(5, 2));
        player.deal();
        dealer.setCard(new Card(5, 2));
        player.deal();
        dealer.setCard(new Card(5, 2));
        player.deal();
        assertEquals(15, player.value());


    }

    @Test
    public void sumIsLessThan10WithOneAce() {
    }

    @Test
    public void sumIsGreaterThan21() {
        try {
            DealerStub dealer = new DealerStub();
            Player player = new Player(dealer);
            dealer.setCard(new Card(8, 2));
            player.deal();
            dealer.setCard(new Card(10, 2));
            player.deal();
            dealer.setCard(new Card(10, 2));
            player.deal();
            assertEquals(player.value(), -1);

        }catch (RuntimeException exception){
            return;
        }
        fail("Failed !! Sum is greater than 21 and Exception not thrown");
    }

    @Test
    public void sumIsLessThan21() {

    }
}
