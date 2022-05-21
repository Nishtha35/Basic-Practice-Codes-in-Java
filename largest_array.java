class largest_array{
	public static void main(String[] args){
		int ar[] = {7, 2, 6, 3, 9};
		int max = ar[0];

		for(int i = 0; i < ar.length; i++){
			if(ar[i] > max){
				max = ar[i];
			}
		}
		System.out.print("Leargest element of array: "+max);
	}
}