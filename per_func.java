import java.util.Scanner;
class per_func{
	static int fact(int no){
	 int fact = 1;
    	while(no > 0){
	      	fact = fact * no;
	        no = no - 1;
     	}
     	return fact;
    } 
	public static void main(String[] args){ 		// nPr = n!/(n-r)!
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of people: ");
		int n = sc.nextInt();
		System.out.print("Enter number of seats: ");
		int r = sc.nextInt();
		int per = fact(n) / fact(n - r);
		System.out.print(per);
	}
}