import java.util.Scanner;
class abundant_N{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int s = 0;
		for(int i = 1; i < n; i++){
			if(n % i == 0){
				s = s + i;
			}
		}
		if(s > n){
			System.out.print("Abundant Number");
		}
		else{
			System.out.print("Not Abundant Number");
		}
	}
}