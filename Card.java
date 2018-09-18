package claim4;

public abstract class Card {
	double balance;
	double interest;
	
	public Card() {
		this.balance = 0;
		this.interest = 0;
	}
	
	public Card(double balance, double interest) {
		this.balance = balance; 
		this.interest = interest;
	}
	
	double getBalance() {
		return this.balance;
	}
	
	double getInterestRate() {
		return this.interest;
	}
	
	
	abstract String getCardBrand();
	
	void setBalance(double balance) {
		this.balance = balance;
	}
	
	double calculateInterest() {
		return this.getInterestRate() * this.getBalance();
	}
	
}
