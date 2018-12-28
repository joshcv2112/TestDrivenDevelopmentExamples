package src;

public abstract class Money {
	protected int amount;
	protected String currency;
	
	public String currency() {
		return this.currency;
	}
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return this.amount == money.amount
			&& getClass().equals(money.getClass());
	}
	
	public abstract Money times(int multiplier);
	
	// Factory method
	public static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}
	
	// Factory method
	public static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}
}
