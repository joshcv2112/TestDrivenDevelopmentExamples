package src;

public class Franc extends Money {
	
	private String currency;
	
	public Franc(int amount, String currency) {
		super(amount, currency);
		this.amount = amount;
		this.currency = currency;
	}
	
	public static Money franc(int amount) {
		return new Money(amount, "CHF");
	}
	
	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	
<<<<<<< HEAD
	public Money times(int multiplier) {
		return new Franc(this.amount * multiplier);
=======
	public String currency() {
		return this.currency;
>>>>>>> 06e726e169938f294b39e5982766d82a86872c5e
	}
}
