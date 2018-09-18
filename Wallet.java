package claim4;

import java.util.*;

public class Wallet {
	List<Card> cards;
	
	public Wallet() {
		cards = new ArrayList<>();
	}
	
	public Wallet(List<Card> cards) {
		this.cards = cards;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	public void addCard(Card c) {
		this.cards.add(c);
	}
	
}
