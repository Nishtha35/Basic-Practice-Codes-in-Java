import java.util.Scanner;
class second_smallest_array{
	public static void main(String[] args){
		int ar[] = {7, 2, 6, 3, 9};
		int min = ar[0];
		int sm = Integer.MAX_VALUE;
		for(int i = 0; i < ar.length; i++){
			if(ar[i] < min){
				sm = min;
				min = ar[i];
			}
		}

		for(int i = 0; i < ar.length; i++){
			if((ar[i] < sm) && (ar[i] > min)){
				sm = ar[i];
			}
		}
		System.out.print("Second smallest element in array: "+sm);
	}
}