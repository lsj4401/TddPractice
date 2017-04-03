package main;

public class Money implements Expression {
	protected int amount;
	private String currency;

	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	public static Money franc(int amount) {
		return new Money(amount, "CHF");
	}

	public Money(int amount, String to) {
		this.amount = amount;
		this.currency = to;
	}

	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && currency().equals(money.currency());
	}

	private String currency() {
		return this.currency;
	}

	@Override
	public Money reduce(Bank bank, String to) {
		return null;
	}

	@Override
	public Money reduce(String to) {
		return this;
	}



	public String toString() {
		return amount + " " + currency;
	}
}
