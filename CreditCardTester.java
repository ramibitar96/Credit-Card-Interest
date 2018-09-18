package claim4;

import static org.junit.Assert.*;

import org.junit.Test;

public class CreditCardTester {

	@Test
	public void threeCardsOneWallet() {
		Person p  = new Person();
		Card a = new VisaCard(100);
		Card b = new MasterCard(100);
		Card c = new DiscoverCard(100);
		
		p.addCard(0, a);
		p.addCard(0, b);
		p.addCard(0, c);
		
		double firstCard = p.getWallets().get(0).getCards().get(0).calculateInterest();
		double secondCard = p.getWallets().get(0).getCards().get(1).calculateInterest();
		double thirdCard = p.getWallets().get(0).getCards().get(2).calculateInterest();
		
		double interest = p.totalInterest();
		assertEquals(10.0, firstCard, .01);
		assertEquals(5.0, secondCard, .01);
		assertEquals(1.0, thirdCard, .01);
		assertEquals(16.0, interest, .01);
	}

	@Test
	public void onePersonTwoWallets() {
		Person p = new Person();
		Card firstWalletOne = new VisaCard(100);
		Card firstWalletTwo = new DiscoverCard(100);
		

		p.addCard(0, firstWalletOne);
		p.addCard(0, firstWalletTwo);
		
		Card secondWalletOne = new MasterCard(100);
		p.newWallet();
		p.addCard(1, secondWalletOne);
		
		double totalInterest = p.totalInterest();
		double firstWalletInterest = p.singleWalletInterest(0);
		double secondWalletIntrest = p.singleWalletInterest(1);
		
		assertEquals(16.0, totalInterest, .01);
		assertEquals(11.0, firstWalletInterest, .01);
		assertEquals(5.0, secondWalletIntrest, .01);
	}
	
	@Test
	public void twoPeopleOneWalletEach() {
		Person p1 = new Person();
		Person p2 = new Person();
		
		Card firstPersonOne = new VisaCard(100);
		Card firstPersonTwo = new DiscoverCard(100);
		Card firstPersonThree = new MasterCard(100);
		
		p1.addCard(0, firstPersonOne);
		p1.addCard(0, firstPersonTwo);
		p1.addCard(0, firstPersonThree);
		
		Card secondPersonOne = new VisaCard(100);
		Card secondPersonTwo = new MasterCard(100);
		
		p2.addCard(0, secondPersonOne);
		p2.addCard(0, secondPersonTwo);
		
		double totalInterestPersonOne = p1.totalInterest();
		double totalInterestPersonTwo = p2.totalInterest();
		double firstWalletFirstPerson = p1.singleWalletInterest(0);
		double firstWalletSecondPerson = p2.singleWalletInterest(0);
		
		assertEquals(16.0, totalInterestPersonOne, .01);
		assertEquals(15.0, totalInterestPersonTwo, .01);
		assertEquals(16.0, firstWalletFirstPerson, .01);
		assertEquals(15.0, firstWalletSecondPerson, .01);
	}
}
