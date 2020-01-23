import java.util.Scanner;

public class Take_Two_Stones {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		if (sc.nextInt() % 2 == 1) {
			System.out.println("Alice");
		}
		else {
			System.out.println("Bob");
		}
		sc.close();
	}
}
