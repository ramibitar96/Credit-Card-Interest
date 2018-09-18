package claim4;

public class DiscoverCard extends Card {
	
	public DiscoverCard() {
		super(0, .01);
	}
	
	public DiscoverCard(double balance) {
		super(balance, .01);
	}
	
	String getCardBrand() {
		return "Discover Card";
	}
}
