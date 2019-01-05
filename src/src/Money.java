package src;

abstract public class Money {
	protected int amount;
	
	abstract public Money times(int multiplier);
	
	public static Money dollar(int amount) {
		return new Dollar(amount);
	}
	
	public static Money franc(int amount) {
		return new Dollar(amount);
	}
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return this.amount == money.amount
			&& getClass().equals(money.getClass());
	}
}
