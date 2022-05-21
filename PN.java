// Postive or negative number

import java.util.Scanner;
public class PN{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		int n = sc.nextInt();

		if(n > 0){
			System.out.print("Positive Number");
		}
		else if (n < 0){
			System.out.print("Negative Number");
		}
		else{
			System.out.print("Zero");
		}
	}
}