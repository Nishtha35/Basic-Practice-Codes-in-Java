import java.util.Scanner;
import java.lang.Math;
class replace0_1{
	static int replace(int no){
		int r, s = 0;	
		while(no > 0){
			r = no % 10;
				if(r == 0){
					r = 1;
				}
			no = no / 10;
			s = replace(s) * 10 + r;
		}
		return s;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
	System.out.print(replace(n));	
	}
}