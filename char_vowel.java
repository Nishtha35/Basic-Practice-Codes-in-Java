import java.util.Scanner;
class char_vowel{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter character: ");
		char c = sc.next().charAt(0);
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
			System.out.print(c+" is vowel");
		}
		else{
			System.out.print(c+" is consotant");
		}
	}
}