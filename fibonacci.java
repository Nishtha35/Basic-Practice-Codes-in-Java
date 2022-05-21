import java.util.Scanner;
class fibonacci{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter limit: ");
		int n = sc.nextInt();
		int f1 = 0, f2 = 1, f;
		System.out.print(f1+" "+f2);

		for(int i = 2; i < n; i++){
			f = f1 + f2;
			System.out.print(" "+f);
			f1 = f2;
			f2 = f;
		}
	}
}