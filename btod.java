import java.util.Scanner;
class btod{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Binary number: ");
		int bin = sc.nextInt();
		int b = bin;
		double dec = 0, n = 0;

		while(bin > 0){
			int t = bin % 10;
			dec = dec + t * Math.pow(2,n);
			bin = bin / 10;
			n++;
		}
		System.out.print("Decimal number of "+b+" : "+dec);
	}
}