import java.util.Scanner;

public class Stuck_In_A_Time_Loop {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		for (int i = 1; i < total + 1; i++) {
			System.out.println(i + " Abracadabra");
		}
		sc.close();
	}
}
