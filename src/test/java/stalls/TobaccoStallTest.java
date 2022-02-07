package stalls;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", 4, "Jack Jarvis", ParkingSpot.B1);
        visitor1 = new Visitor(16,160,10);
        visitor2 = new Visitor(35,170,30);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void isAllowedOver18(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitor2));
    }

    @Test
    public void isNotAllowedUnder18(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitor1));
    }

}
