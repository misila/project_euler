
/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

public class Problem4 {

	public boolean isPalindrome(int number){
		
		String s = new Integer(number).toString();
		String r = new String();
		char[] array = s.toCharArray();
		for (int i=s.length()-1; i>=0; i--)
			r+=array[i];
		
		return (r.compareTo(s)==0);
	}
	
	public static void main(String args[]){
	
		Problem4 p4 = new Problem4();
		int max=0;
		
		for (int i=100; i<=999; i++){
			for (int j=100; j<=999; j++){
				
				int product=i*j;
				if (p4.isPalindrome(product) && product>max)
					max=product;
			}
		}
	
		System.out.println(" The largest palindrom made from the product of tow 3-digit numbers is "+max);
	}
}
