import java.util.Scanner;
class number_digits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int c = 0, r;
		while( n > 0){
			r = n % 10;
			c++;
			n = n / 10;
		}
		System.out.print("Number of digits: "+c);
	}
}