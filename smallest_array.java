import java.util.Scanner;
class smallest_array{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = {3, 6, 8, 2, 10, 1};
		int min = arr[0];
		for(int i  =0; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		System.out.print("Smallest element of array: "+min);
	}
}