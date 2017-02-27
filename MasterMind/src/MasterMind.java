import java.util.Random;
import java.util.Scanner;

public class MasterMind {
	public static void main(String[] args) {

		StringBuilder s = new StringBuilder();
		Random r = new Random();

		// generating code
		for (int loop = 0; loop < 4; loop++) {
			int num = r.nextInt(7);
			if (num == 0)
				num = 1;
			s.append(Integer.toString(num));
		}
		String code = s.toString();
		boolean win = false;
		int attempts = 0;
		Scanner reader = new Scanner(System.in);
		int maxAttempts = 6;

		// main loop of game where user guesses code
		String input;
		while (attempts < maxAttempts && win == false) {
			StringBuilder returnString = new StringBuilder();
			System.out.println("Make a guess!");
			input = reader.nextLine();
			if (input.equals(code)) {
				System.out.println("You guessed it!");
				win = true;
			} else {
				int index = 0;
				StringBuilder temp = new StringBuilder(input);
				StringBuilder codeTemp = new StringBuilder(code);

				// determining how many +'s to print out
				while (index < temp.length()) {
					// for if position+number match
					if (temp.charAt(index) == (codeTemp.charAt(index))) {
						returnString.append("+");
						temp.deleteCharAt(index);
						codeTemp.deleteCharAt(index);
						index = 0;
					} else
						index++;
				}
				index = 0;

				// determining number of -'s to print out
				while (index < temp.length()) {
					if (codeTemp.toString().indexOf(temp.charAt(index)) != -1) {
						returnString.append('-');
						codeTemp.deleteCharAt(codeTemp.toString().indexOf(temp.charAt(index)));
						temp.deleteCharAt(index);
						index = 0;
					} else
						index++;
				}
				System.out.println(returnString.toString());

			}
			attempts++;
		}
		if (win == false) {
			System.out.println("You lose :(");
		}

	}
}
