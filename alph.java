import java.util.Scanner;
class alph{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter character: ");
		char c = sc.next().charAt(0);
		if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'){
			System.out.print(c+" is alphabet");
		}
		else{
			System.out.print(c+" is not alphabet");
		}
	}
}