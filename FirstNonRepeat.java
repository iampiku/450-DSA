import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class FirstNonRepeat {
	private static char nonRepeat(String a) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character i : a.toCharArray()) {
			if (map.containsKey(i)) {
				Integer count = map.get(i);
				map.put(i, count + 1);
			} else {
				map.put(i, 1);
			}
		}
		for (Character j : a.toCharArray()) {
			if (map.get(j) == 1)
				return j;
		}
		return '$';
	}

	public static void main(String args[]) {
		var scan = new Scanner(System.in);
		String a = scan.nextLine().toLowerCase();
		System.out.println(nonRepeat(a));
		scan.close();
	}
}