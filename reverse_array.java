class reverse_array{
	public static void main(String[] args){
		int ar[] = {7, 2, 6, 3, 9};
		int p1 = 0;
		int p2 = ar.length - 1;

		while(p1 < p2){
			int temp = ar[p1];
			ar[p1] = ar[p2];
			ar[p2] = temp;
			p1++;
			p2--;
		}
		System.out.print("Reverse of array: ");
		for(int i = 0; i < ar.length; i++){
			System.out.print(ar[i]+" ");
		}
	}
}