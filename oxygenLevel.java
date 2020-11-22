import java.util.Scanner;

public class oxygenLevel {
	private static void trainee(int arr[]) {
		int a = 0, b = 0, c = 0, max = 0;
		int avg[] = new int[3];
		for (int i = 0; i < 9; i++) {
			if (i == 0 || i % 3 == 0) {
				a += arr[i];
			}
			avg[0] = a / 3;
			if (i == 1 || i == 4 || i == 7) {
				b += arr[i];
			}
			avg[1] = b / 3;
			if (i == 5 || i % 2 == 0) {
				c += arr[i];
			}
			avg[2] = c / 3;
		}
		for (int i = 0; i < avg.length; i++) {
			if (arr[i] < 70) {
				System.out.println("The trainee is unfit" + arr[i]);
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (int i = 0; i < avg.length; i++) {
			if (arr[i] == max)
				System.out.println("Trainee Number : " + (i + 1));
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[9];
		for (int i = 0; i < 9; i++) {
			int value = scan.nextInt();
			if (value <= 1 || value >= 100) {
				System.out.println("Invalid Input");
			} else {
				arr[i] = value;
			}
		}
		trainee(arr);
		scan.close();
	}
}