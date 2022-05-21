import java.util.Scanner;
class automorphic_N{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int a = n, x = 1, r1;
		 int s = n * n;
		 while(n > 0){
		 	x = x * 10;
		 	n = n / 10;
		 }
		 r1 = s % x;
		 if(r1 == a){
		 	System.out.print("Automorphic number");
		 }
		 else{
		 	System.out.print("Not Automorphic number");
		 }
	}
}