package main;

public interface Expression {
	Money reduce(Bank bank, String to);
	Money reduce(String to);
}
