import java.util.*;

public class Crypt13_5
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1 = ""; 
		
		for (int i = 0; i < s.length(); ++i) {
		    char c = s.charAt(i);
		    int step = 0;
		    if (i%2==0) {
		        step = 13;
		    } else {
		        step = 5;
		    }
		    int numChar = 0;
		    if (c >= 65 && c <= 90) {
		        numChar = (((int)c-64+step)%26)+64;
		    }
		    else if(c == ''){
		    	numChar = (((int)c-64)%26)+64;
		    } else {
		        numChar = (((int)c-96+step)%26)+96;
		    }
		    s1 += (char)numChar;
		    
		}
		
		System.out.println(s1);
	}
}
