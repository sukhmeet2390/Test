package normal;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

public class CardTest {
    @Test
    public void shouldReturnNumberWhenValueIsLessThanTenTest() {
        Card c = new Card(5, 2);
        assertEquals(5, c.value());
    }

    @Test
    public void shouldReturnTenWhenValueIsGreaterThanEqualToTenTest() {
        Card c = new Card(11, 2);
        assertEquals(10, c.value());
    }


    @Test
    public void shouldThrowExceptionIfNumberIsMoreThan13() {
        try {
            Card c = new Card(16, 1);
        } catch (RuntimeException exception) {
            return;
        }
        fail("Number is more than 13 Failure");

    }

    @Test
    public void shouldThrowExceptionIfNumberIsLessThan1() {
        try {
            Card c = new Card(-1, 1);
        } catch (RuntimeException exception) {
            return;
        }
        fail("Number is less than 1 Failure");

    }

    @Test
    public void shouldThrowExceptionIfSuitIsLessThan1() {
        try {
            Card c = new Card(11, -1);
        } catch (RuntimeException exception) {
            return;
        }
        fail("Suit is Less than 1 Failure");

    }

    @Test
    public void shouldThrowExceptionIfSuitIsGreaterThan4() {
        try {
            Card c = new Card(11, 5);
        } catch (RuntimeException exception) {
            return;
        }
        fail("Suit is Greater than 5 Failure");

    }
    @Test
    public void shouldCheckExceptionOnInValidCard(){
        try{
            Card c = new Card(10,2);

        }catch (RuntimeException exception){
            fail("Invalid Card Generated");
        }
        return;
    }
    @Test
    public void shouldCheckValidCardCreation(){
        Card c = new Card(11,3);
        assertEquals("♥:J",c.toString() );
    }

}
