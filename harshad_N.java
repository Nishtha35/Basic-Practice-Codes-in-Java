import java.util.Scanner;
class harshad_N{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int a = n;
		int s = 0, r;
		while(n > 0){
			r = n % 10;
			s = s + r;
			n = n / 10;
		}
		if(a % s == 0){
			System.out.print("Harshad Number");
		}
		else{
			System.out.print("Not Harshad Number");
		}
	} 
}