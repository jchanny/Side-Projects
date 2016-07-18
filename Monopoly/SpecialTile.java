
public class SpecialTile extends Tile {

	private int type;

	/**
	 * @param type
	 *            1=chance, 2=treasure chest, 3=jail, 4=parking, 5=go to jail,
	 *            6=utility, 7=railroad, 8=tax
	 */
	public SpecialTile(String name, int type, int purchaseCost, int mortgageValue, int landingFee) {
		super(name, purchaseCost, mortgageValue, landingFee, 0);
		this.type = type;
	}

	public boolean isPurchaseable() {
		if (getMortgageValue() == 0 && getPurchaseCost() == 0)
			return false;
		else
			return super.isPurchaseable();
	}

	public String getType() {
		switch (type) {
		case 1:
			return "Chance";
		case 2:
			return "Treasure Chest";
		case 3:
			return "Jail";
		case 4:
			return "Free Parking";
		case 5:
			return "Go to Jail";
		case 6:
			return "Utility";
		case 7:
			return "railroad";
		case 8:
			return "tax";
		}
		return "";
	}
}
