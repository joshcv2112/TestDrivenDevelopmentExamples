package src;

public class Money {
	protected int amount;
	protected String currency;
	
	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public String currency() {
		return this.currency;
	}
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && currency().equals(money.currency());
	}
	
	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	
	// Factory method
	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}
	
	// Factory method
	public static Money franc(int amount) {
		return new Money(amount, "CHF");
	}
}
