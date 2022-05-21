// Sum of first N natural numbers
import java.util.Scanner;

public class N_Sum{
	public static void main(String[] args){
		int n , s = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		n = sc.nextInt();

		for( int i = 1; i <= n; i++){
			s = s + i;
		}
		System.out.print("\nSum of first "+n+" natural numbers: "+s);
	}
}