public class Q2{
	public static void main(String[] args) {
		byte varr = 10;
		short a = 20;
		int i = 50;

		long l = 50000L + 10L * (varr + a + i);
		System.out.print(l);

		short s = (short) (1000 + 10  * (varr + a + i));
		System.out.print(s);

	}

}