public class DescentCalculator {

	/**
	 * assumes standard 3 degree descent path
	 */
	public static double descentRate(int groundSpeed) {
		return Math.tan(3) * groundSpeed;
	}

	/**
	 * gives necessary descentRate in order to reach target altitude within
	 * distance
	 */
	public static double descentRate(int currentAltitude, int targetAltitude, int distanceToDescend, int groundSpeed) {
		double descentAngle = ((currentAltitude - targetAltitude) / 100) / distanceToDescend;
		return Math.tan(descentAngle) * groundSpeed;

	}

	public static double whenToDescend(int groundSpeed, int targetAltitude, int currentAltitude) {
		if (groundSpeed == 0 || currentAltitude < targetAltitude)
			throw new IllegalArgumentException();
		return ((currentAltitude - targetAltitude) / 100) / 3;
	}

	public static void main(String[] args) {

	}
}
