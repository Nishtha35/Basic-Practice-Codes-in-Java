import java.util.Scanner;
class lcm{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 number: ");
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		int lcm = 0, max = 0;
		if( n1 > n2){
			max = n1;
		}
		else{
			max = n2;
		}
		while(max != 0){
			if(max % n1 == 0 && max % n2 == 0){
				lcm = max;
				break;
			}
			max = max + 1;
		}
	System.out.print("LCM: "+lcm);
	}
}