import java.util.Scanner;
class power_N{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		System.out.print("Enter power: ");
		int p = sc.nextInt();
		int res = 1;
		while(p > 0){
			res = res * n;
			p = p - 1;
		}
		System.out.print("Power: "+res);
	}
}