package src;

public class Dollar extends Money {
	
	private String currency;
	
	public Dollar(int amount, String currency) {
		super(amount, currency);
		this.amount = amount;
		this.currency = currency;
	}
	
	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}
	
	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	
	public String currency() {
		return this.currency;
	}
}
