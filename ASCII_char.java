import java.util.Scanner;

class ASCII_char{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter character: ");
		char c = sc.next().charAt(0);
		int i = c;
		System.out.print("ASCII value of "+c+" is "+i);
		
	}
}