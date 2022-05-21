import java.util.Scanner;
class count_occ{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		System.out.print("Enter number to be counted: ");
		int x = sc.nextInt();
		int c = 0, r;
		int a = n;
		while(n > 0){
			r = n % 10;
			if( r == x){
				c++;
			}
			n = n / 10;
		}
		System.out.print(x+" occured "+c+" times in number "+a);
	}
}