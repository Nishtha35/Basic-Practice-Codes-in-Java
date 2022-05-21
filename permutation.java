import java.util.Scanner;
class permutation{
	public static void main(String[] args){ 		// nPr = n!/(n-r)!
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of people: ");
		int n = sc.nextInt();
		System.out.print("Enter number of seats: ");
		int r = sc.nextInt();
		int fact1, fact2, per = 0;
		fact1 = 1;
		int i = n;
		while(i > 0){
			fact1 = fact1 * i;
			i = i -1;
		}
		int num = n - r;
		fact2 = 1;
		while(num > 0){
			fact2 = fact2 * num;
			num = num - 1; 
		}
		per = fact1 / fact2;
		System.out.print(per);
	}
}