import java.util.Scanner;
class amicable_N{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int n1 = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int n2 = sc.nextInt();
		int s1 = 0, s2 = 0;

		for(int i = 1; i < n1; i++){
			if(n1 % i == 0){
				s1 = s1 + i;
			}
		}

		for(int i = 1; i < n2; i++){
			if(n2 % i == 0){
				s2 = s2 + i;
			}
		}

		if((s1 == n2) && (s2 == n1)){
			System.out.print("Amicable number");
		}
		else{
			System.out.print("Not Amicable number");
		}
	}
}