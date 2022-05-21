class sum_array{
	public static void main(String[] args){
		int ar[] = {3, 2, 6, 1};
		int sum = 0;
		for(int i = 0; i <ar.length; i++){
			sum = sum + ar[i];
		}
		System.out.print("Sum of elements: "+sum);
	}
}