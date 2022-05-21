import java.util.Scanner;
class armstrong_range{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range: ");
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.print("Armstrong number between range "+s+" and "+e+" are: ");
		for(int i = s; i <= e; i++){
			int n = i;
			int rev = 0, r;
			while(n > 0){
				r = n % 10;
				rev = rev + r * r * r;
				n = n / 10;
			}
			if(rev == i){
				System.out.print(i+" ");
			}
		}
	}
}