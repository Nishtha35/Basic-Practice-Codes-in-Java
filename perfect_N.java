import java.util.Scanner;
class perfect_N{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();

		int s = 0, x = n;
		for(int i = 1; i < n; i++){
			if(n % i == 0){
				s = s + i;
			}
		}
		if(x == s){
			System.out.print("Perfect number");
		}
		else{
			System.out.print("Not Perfect number");
		}
	}
}