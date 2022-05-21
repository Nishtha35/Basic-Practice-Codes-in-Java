import java.util.Scanner;
class area_circle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		float r = sc.nextFloat();
		double a = 3.14 * r * r;
		System.out.print("Area of Circle: "+a);
	}
}