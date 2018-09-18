package claim4;

public class VisaCard extends Card {
	
	public VisaCard() {
		super(0, .1);
	}
	
	public VisaCard(double balance) {
		super(balance, .1);
	}
	
	String getCardBrand() {
		return "Visa Card";
	}
}
