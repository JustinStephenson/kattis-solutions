import java.util.Scanner;

public class Tarifa {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int dataEachMonth = scanner.nextInt();
		int totalMonths = scanner.nextInt();
		int totalDataLeft = 0;
		while (totalMonths-- > 0)
		{
			int dataUsed = scanner.nextInt();
			totalDataLeft += dataEachMonth - dataUsed;
		}
		System.out.println(totalDataLeft + dataEachMonth);
		scanner.close();
	}
}
