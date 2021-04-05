import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPizzaOrder {
	private Pizza ord;
	@BeforeEach
	public void init() {
		ord=new Pizza();
	}
	@Test
	public void testOrder() throws OrderException{
		assertEquals(250,ord.order("S", 3));
	}
	
}
