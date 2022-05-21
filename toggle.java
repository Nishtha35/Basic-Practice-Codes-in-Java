import java.util.Scanner;

class toggle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.nextLine();
		String str2 = "";
		for(int i = 0; i < str.length(); i++){
			if(Character.isUpperCase(str.charAt(i))){
				str2 = str2 + Character.toLowerCase(str.charAt(i));
			}
			else{
				str2 = str2 + Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.print(str2);
	}
}