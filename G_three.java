// greatest of 3 numbers
import java.util.Scanner;
class G_three{
	public static void main(String[] args){
		int max;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(a > b && a > c){
			max = a;
		}
		else if(b > a && b > c){
			max = b;
		}
		else{
			max = c;
		}

		System.out.print("Greatest number: "+max);
	}
}