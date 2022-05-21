import java.util.Scanner;

class Prime_N{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int f = 0;
		if(n >= 2){
			for(int i = 2; i < n; i++){
				if(n % i == 0){
					f = 1;
					break;
				}
			}
			if(f == 0){
				System.out.print("Prime number");
			}
			else{
				System.out.print("Not Prime number");
			}
		}
		else{
			System.out.print("CND");
		}
	}
}