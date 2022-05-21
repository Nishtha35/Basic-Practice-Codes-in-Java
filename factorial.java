import java.util.Scanner;
class factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int n1 = n;
		int fact = 1;
		while(n > 0){
			fact = fact * n;
			n = n - 1;
		}
		System.out.print("Factorial of "+n1+" : "+fact);
	}
}