import java.util.Scanner;
import java.util.TreeMap;

public class Stacking_Cups {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		TreeMap<Integer, String> cups = new TreeMap<Integer, String>();
		int numberOfCups = Integer.parseInt(sc.nextLine());
		while (numberOfCups-- > 0) {
			String[] string = sc.nextLine().split(" ");
			if (Character.isDigit(string[0].charAt(0))) {
				int num = Integer.parseInt(string[0]);
				num = num/2;
				cups.put(num, string[1]);
			}
			else {
				cups.put(Integer.parseInt(string[1]), string[0]);
			}
		}
		for (String s : cups.values()) {
			System.out.println(s);
		}
		sc.close();
	}
}
