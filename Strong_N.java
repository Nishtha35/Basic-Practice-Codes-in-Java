import java.util.Scanner;
class Strong_N{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();

		int x = n;
		int f = 1, s = 0, r;
		while(n > 0){
			r = n % 10;
			while( r > 0){
				f = f * r;
				r = r -1;
			}
			s = s + f;
			n = n / 10;
			f = 1;
		}
		if(x == s){
			System.out.print("Strong number");
		}
		else{
			System.out.print("Not Strong number");
		}
	}
}