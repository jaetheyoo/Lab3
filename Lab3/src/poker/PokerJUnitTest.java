package poker;

import static org.junit.Assert.*;


import java.util.ArrayList;

import org.junit.Test;


//FiveOfAKind(110),
//RoyalFlush(100),
//StraightFlush(90),
//FourOfAKind(80),
//FullHouse(70),
//Flush(60),
//Straight(50),
//ThreeOfAKind(40),
//TwoPair(30),
//Pair(20),
//HighCard(10);

public class PokerJUnitTest {
	@Test
	public void testNaturalRoyalFlush() {
		ArrayList<Card> SH = new ArrayList<Card>(); 
		SH.add(new Card(eSuit.CLUBS, eRank.ACE));
		SH.add(new Card(eSuit.CLUBS, eRank.KING));
		SH.add(new Card(eSuit.CLUBS, eRank.QUEEN));
		SH.add(new Card(eSuit.CLUBS, eRank.JACK));
		SH.add(new Card(eSuit.CLUBS, eRank.TEN));
 		
 		Hand h = Hand.EvalHand(SH); 		
		assertEquals("Expected NaturalRoyalFlush, but returned somethine else;", 120, h.getHandStrength());
	}
	
	@Test
	public void testFiveOfaKind() {
		ArrayList<Card> SH = new ArrayList<Card>(); 
		SH.add(new Card(eSuit.CLUBS, eRank.ACE));
		SH.add(new Card(eSuit.CLUBS, eRank.ACE));
		SH.add(new Card(eSuit.CLUBS, eRank.ACE));
		SH.add(new Card(eSuit.CLUBS, eRank.ACE));
		SH.add(new Card(eSuit.CLUBS, eRank.ACE));
 		
 		Hand h = Hand.EvalHand(SH);
		assertEquals("Expected FiveOfAKind, but returned somethine else;", 110, h.getHandStrength());
	}
	
	@Test
	public void testRoyalFlush() {
		ArrayList<Card> SH = new ArrayList<Card>(); 
		SH.add(new Card(eSuit.JOKER, eRank.JOKER));
		SH.add(new Card(eSuit.CLUBS, eRank.KING));
		SH.add(new Card(eSuit.CLUBS, eRank.QUEEN));
		SH.add(new Card(eSuit.CLUBS, eRank.JACK));
		SH.add(new Card(eSuit.CLUBS, eRank.TEN));
		Hand h = Hand.EvalHand(SH); 
		assertEquals("Expected RoyalFlush, but returned somethine else;", 100, h.getHandStrength());
	}
 	
	@Test
	public void testFourOfaKind() {
		ArrayList<Card> SH = new ArrayList<Card>();
		SH.add(new Card(eSuit.CLUBS, eRank.ACE));
		SH.add(new Card(eSuit.CLUBS, eRank.ACE));
		SH.add(new Card(eSuit.CLUBS, eRank.ACE));
		SH.add(new Card(eSuit.CLUBS, eRank.ACE));
		SH.add(new Card(eSuit.CLUBS, eRank.EIGHT));

		Hand h = Hand.EvalHand(SH);
		assertEquals("Expected FourOfAKind, but returned somethine else;", 80,
				h.getHandStrength());
	}
	
}