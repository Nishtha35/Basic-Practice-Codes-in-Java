import java.util.Scanner;
class palindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int x = n;
		int rev = 0, r;
		while(n > 0){
			r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}

		if(x == rev){
			System.out.print(x+" Palindrome Number");
		}
		else{
			System.out.print(x+" Not Palindrome Number");
		}
	}
}