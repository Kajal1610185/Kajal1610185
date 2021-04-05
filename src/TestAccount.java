import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestAccount {
	private Account acnt;
	@BeforeEach
	public void init() {
		acnt = new Account(1000);
	}
	@Test
	public void TestDeposit() throws Test1Exception {
		assertEquals(1500,acnt.deposit(500));
	}
	
	@Test
	public void testWithdraw() throws Test1Exception {
		assertEquals(500,acnt.withdraw(500));
	}
	@Test
	public void testInvalidWithdraw() {
		assertThrows(Test1Exception.class,()->acnt.withdraw(15000));
	}
	@Test
	public void testNegativeWithdraw() {
		assertThrows(NumberFormatException.class,()->acnt.withdraw(-200));
	}
	


	
}