import java.util.Scanner;
class root_QE{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter coefficient of quadratic equation: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		double d = Math.pow(b,2) - 4 * a * c;

		if(d > 0){
			double root1 = (-b + Math.sqrt(d)) / (2 * a);
			double root2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.print(root1+" and "+root2);
		}
		else{
			double root = (-b / (2 * a));
			System.out.print(root);
		}
	}
}