
public class ProjectEulerSolutions {

	public static void problemOne() {
		int sum = 0;
		for (int loop = 0; loop < 1000; loop++) {
			if (loop % 3 == 0 || loop % 5 == 0)
				sum += loop;
		}
		System.out.println(sum);
	}

	public static void problemTwo() {
		long fibSum = 2;
		long[] fibSeq = new long[2];
		long term = 3;
		fibSeq[0] = 2;
		fibSeq[1] = 3;
		long[] fibTemp = new long[2];
		do {
			fibTemp[0] = fibSeq[0] + fibSeq[1];
			fibTemp[1] = fibTemp[0] + fibSeq[1];
			if (fibTemp[0] % 2 == 0)
				fibSum += fibTemp[0];
			if (fibTemp[1] % 2 == 0)
				fibSum += fibTemp[1];
			fibSeq = fibTemp;
			term = fibSeq[1];
		} while (term < 4000000);
		System.out.println(fibSum);
	}

	public static void problemThree(double x) {
		double num = x;

		if (num % 2 == 0) {
			num = myProblemThree(num / 2);
		} else if (num % 3 == 0) {
			num = myProblemThree(num / 3);
		} else if (num % 5 == 0) {
			num = myProblemThree(num / 4);
		} else if (num % 7 == 0) {
			num = myProblemThree(num / 7);
		} else if (num % 11 == 0) {
			num = myProblemThree(num / 11);
		}

		System.out.println(num);
	}

	public static double myProblemThree(double num) {
		if (num % 2 == 0)
			return myProblemThree(num / 2);
		else if (num % 3 == 0)
			return myProblemThree(num / 3);
		else if (num % 5 == 0)
			return myProblemThree(num / 5);
		else if (num % 7 == 0)
			return myProblemThree(num / 7);
		else if (num % 11 == 0)
			return myProblemThree(num / 11);
		else
			return 0;

	}

	public static void main(String[] args) {
		problemOne();
		problemTwo();
		problemThree(600851475143);
	}
}
