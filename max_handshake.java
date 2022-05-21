import java.util.Scanner;
public class max_handshake{
	public static void main(String[] args){   // nC2 = n * (n - 1) / 2
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of people: ");
		int n = sc.nextInt();

		int res = n * (n - 1) / 2;

		System.out.print("Max. handshakes: "+res);
	}
}