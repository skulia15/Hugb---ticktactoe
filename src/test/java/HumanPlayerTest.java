import org.junit.Test;
import static org.junit.Assert.*;

public class HumanPlayerTest {
    @Test public void testPointIsValid() {
        HumanPlayer p = new HumanPlayer(new Console());
        assertEquals(true, p.pointIsValid(2));
    }

    @Test public void testPointIsValidExpectFalse() {
        HumanPlayer p = new HumanPlayer(new Console());
        assertEquals(false, p.pointIsValid(123));
    }
     
    @Test public void testIsHuman() {
        HumanPlayer p = new HumanPlayer(new Console());
        assertEquals(true, p.isHuman());
    }
}
