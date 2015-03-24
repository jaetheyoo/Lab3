package poker;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

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
	
}