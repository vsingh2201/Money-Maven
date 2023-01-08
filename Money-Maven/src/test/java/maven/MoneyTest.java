package maven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import maven.Money;

public class MoneyTest {
	@Test
	public void same_currency_n_amount_is_equal() {
		Money m1 = new Money(12, "SGD");
		Money m2 = new Money(12, "SGD");
		assertEquals(m1, m2, m1.getAmount() + " and " + m2.getAmount() + " aren't equals");
	}

	@Test
	public void adding_same_currency_return_amount_added_up() {
		Money m1 = new Money(12, "SGD");
		Money m2 = new Money(14, "SGD");
		Money sum = m1.add(m2);
		assertEquals(new Money(26, "SGD"), sum, m1.getAmount() + " and " + m2.getAmount() + " don't add up to 26");
	}
}