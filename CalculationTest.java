
import static org.junit.Assert.*;
import org.junit.Test;
public class CalculationTest {
	private Calculation c ;
	@Test
	public void WhenAddingProteinTotalIncrease() {
		assertEquals(10, c.add(7,3));
	}
	
}
