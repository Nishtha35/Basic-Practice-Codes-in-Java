// Sum of N natural numbers
// Sum of numbers in a given range
import java.util.Scanner;

public class NSum{
	public static void main(String[] args){
		int f, l , s = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first: ");
		f = sc.nextInt();
		System.out.print("Enter last: ");
		l = sc.nextInt();


		for( int i = f; i <= l; i++){
			s = s + i;
		}
		System.out.print("\nSum of natural numbers in range "+f+ " and "+l+"  : "+s);
	}
}