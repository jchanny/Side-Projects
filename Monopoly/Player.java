public class Player {

	private long bankAccount;

	/** array of Tile objects representing properties player owns */
	private Tile[] properties;

	private int location;

	/**
	 * @param initialAmount
	 *            how much money each player starts with
	 */
	public Player(long initialAmount) {
		location = 0;
		bankAccount = initialAmount;
		properties = new Tile[28];
		for (int loop = 0; loop < properties.length; loop++) {
			properties[loop] = null;
		}
	}

	public long balance() {
		return bankAccount;
	}

	public void addMoney(int amount) {
		bankAccount += amount;
	}

	public void loseMoney(int amount) {
		bankAccount -= amount;
	}

	public int getLocation() {
		return location;
	}

	/**
	 * to be used when told to not pass go but to jump directly to space
	 * 
	 * @param space
	 */
	public void goToSpace(int space) {
		location = space;
	}

	/**
	 * advances player's position by numSpaces
	 * 
	 * @param numSpaces
	 * @return true if go is passed; false if go is not passed
	 */
	public void advance(int numSpaces) {
		location += numSpaces;
		if (location >= 40) {
			location = location - 40;
			bankAccount += 200;
		}
	}

}