import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MonopolyGameTest {

	@Test
	public void test() {
		MonopolyGame test = new MonopolyGame();
		test.initialize(3);
		test.getPlayers().get(0).advance(3);
		test.purchaseProperty();
		assertTrue("players not being moved to correct location", test.getPlayers().get(0).getLocation() == 3);
		assertTrue("property not being purchased", test.getPlayers().get(0).returnProperties()[3] == true);
		test.getPlayers().get(1).advance(3);
		assertTrue("properties allowed to be purchased even though property already owned",
				test.purchaseProperty().equals("property cannot be purchased"));
		test.getPlayers().get(2).advance(4);
		assertTrue("SpecialTiles can be purchased", test.purchaseProperty().equals("property cannot be purchased"));
	}

	@Test
	public void testSwitchPlayer() {
		MonopolyGame test = new MonopolyGame();
		test.initialize(2);
		test.getPlayers().get(test.getCurrentPlayer()).advance(2);
		test.switchPlayer();
		test.getPlayers().get(test.getCurrentPlayer()).advance(3);
		assertTrue("not switching players", test.getPlayers().get(0).getLocation() == 2);
		assertTrue("not switching players", test.getPlayers().get(1).getLocation() == 3);
		test.switchPlayer();
		test.getPlayers().get(test.getCurrentPlayer()).advance(3);
		test.switchPlayer();
		test.getPlayers().get(test.getCurrentPlayer()).advance(3);
		assertTrue("switching behavior weird", test.getPlayers().get(0).getLocation() == 5);
		assertTrue("switching behavior off", test.getPlayers().get(1).getLocation() == 6);
		test.purchaseProperty();
		assertTrue("player unable to buy property", test.getPlayers().get(1).returnProperties()[6] == true);
		assertTrue("payment for property purchase doesn't occur", test.getPlayers().get(1).getBalance() == 150);
		test.switchPlayer();
		test.getPlayers().get(test.getCurrentPlayer()).advance(1);
		test.purchaseProperty();
		assertTrue("player able to buy property that has already been purchased",
				test.getPlayers().get(0).returnProperties()[6] == false);
	}

	@Test
	public void testBuyHouseHotel() {

	}

}
