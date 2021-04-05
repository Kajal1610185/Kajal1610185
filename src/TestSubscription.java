import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSubscription {
	private Subscription subs;
	@BeforeEach
	public void setup() {
		subs=new Subscription();
	}
	@Test
	public void testQuarterly() throws SubscriptionException{
		assertEquals(250,subs.quarterly());
	}
	@Test
	public void testAnnualy() throws SubscriptionException{
		assertEquals(1000,subs.annualy());
	}
	@Test
	public void testMonthly() throws SubscriptionException {
		assertEquals(100,subs.monthly());
	}



}
