package claim4;

public class MasterCard extends Card {
	
	public MasterCard() {
		super(0, .05);
	}
	
	public MasterCard(double balance) {
		super(balance, .05);
	}
	
	String getCardBrand() {
		return "Mastercard";
	}
}
