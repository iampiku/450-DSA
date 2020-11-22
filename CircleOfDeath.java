public class CircleOfDeath {
	private static int circleDeath(int n, int k) {
		if (n == 1)
			return 1;
		return (circleDeath(n - 1, k) + k - 1) % n + 1;
	}

	public static void main(String args[]) {
		System.out.println(circleDeath(14, 2));
	}
}