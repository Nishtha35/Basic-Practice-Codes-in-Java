import java.util.Scanner;
class quadrant{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x and y: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x == 0 && y == 0){
			System.out.print("Origin");
		}
		else{
			if(x > 0 && y > 0){ 
				System.out.print("quadrant 1");
			}
			else if(x < 0 &&  y > 0){
				System.out.print("quadrant 2");
			}
			else if(x < 0 && y < 0){
				System.out.print("quadrant 3");
			}
			else{
				System.out.print("quadrant 4");
			}
		}
	}
}