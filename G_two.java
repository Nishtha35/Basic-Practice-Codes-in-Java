// greatest of 2 numbers
import java.util.Scanner;
public class G_two{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int max  = a  > b ? a : b;

		System.out.print("Greatest number: "+max);
	}
}