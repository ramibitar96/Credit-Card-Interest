package claim4;

import java.util.*;

public class Person {
	String firstName;
	String lastName;
	List<Wallet> wallets;
	
	
	public Person() {
		this.firstName = "John";
		this.lastName = "Doe";
		this.wallets = new ArrayList<>();
		Wallet w = new Wallet();
		this.wallets.add(w);
	}
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.wallets = new ArrayList<>();
		Wallet w = new Wallet();
		this.wallets.add(w);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Wallet> getWallets() {
		return wallets;
	}

	public void setWallets(List<Wallet> wallets) {
		this.wallets = wallets;
	}
	
	public void newWallet() {
		Wallet w = new Wallet();
		this.wallets.add(w);
	}
	
	public void addCard(int index, Card c) {
		if (index >= this.wallets.size())
			return;
		else
			this.wallets.get(index).addCard(c);
	}
	
	public double totalInterest() {
		double total = 0;
		for (Wallet w : this.wallets) {
			for (Card c : w.getCards()) {
				total+=c.calculateInterest();
			}
		}
		return total;
	}
	
	public double singleWalletInterest(int i) {
		if (i >= this.wallets.size())
			return 0;
		double total = 0;
			for (Card c : this.wallets.get(i).getCards()) {
				total+=c.calculateInterest();
			}
		return total;
	}
}
