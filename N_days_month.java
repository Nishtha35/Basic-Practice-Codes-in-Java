import java.util.Scanner;
class N_days_month{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month (1-12) : ");
		int mon = sc.nextInt();
		System.out.print("Enter year: ");
		int year = sc.nextInt();
		if((mon == 2) && ( (year % 4 == 0) || (year % 100 == 0) && (year % 400 == 0))){
			System.out.print("29 days");
		}
		else if(mon == 2){
			System.out.print("28 days");
		}
		else if(mon == 1|| mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12){
			System.out.print("31 days");
		}
		else{
			System.out.print("30 days");
		}
	}
}