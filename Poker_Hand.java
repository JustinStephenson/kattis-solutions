import java.util.HashMap;
import java.util.Scanner;

public class Poker_Hand {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String[] hand = sc.nextLine().split(" ");
		HashMap<String, Integer> countMap = new HashMap<String, Integer>();
		for (String s: hand) {
			String first = s.substring(0, 1);
			if (countMap.containsKey(first)) {
				int temp = countMap.get(first);
				countMap.put(first, ++temp);
			}
			else
				countMap.put(first, 1);
		}
		int max = 0;
		for (int i : countMap.values()) {
			if (i > max)
				max = i;
		}
		System.out.println(max);
		sc.close();
	}
}
