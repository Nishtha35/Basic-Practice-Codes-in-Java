import java.util.Scanner;

class Prime_Nrange{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter range: ");
		int f = sc.nextInt();
		int l = sc.nextInt();
		
		for(int j = f; j <= l; j++){
			int flag = 0;
				for(int i = 2; i < j; i++){
					if(j % i == 0){
						flag = 1;
						break;
					}
				}
			if(flag == 0){
				System.out.print(" "+j);
			}
		}
	}
}