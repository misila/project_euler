/*
Problem 20 : 

n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!

*/
public class Problem20 {


	public int sum_all_digits(int n){
		
		if (n<10) return n;
		return (sum_all_digits(n/10)+sum_all_digits(n%10));
	}
	
	public int sum_all_digits(StringBuilder s){
		
		int sum = 0;
		
		for (int h = 0; h< s.length(); h++){
			
			sum += s.charAt(h) - 48;
		}
		return sum;
	}
	
	
	public StringBuilder multiply(StringBuilder sa, int sb){
		
		if (sb==10) return sa.append(0);
	
		StringBuilder res = new StringBuilder();
	
		int retenue=0;
		
		for (int v = sa.length()-1; v>=0; v--){
			char c = sa.charAt(v);
			
			int mult = (c - 48)*sb + retenue;
			retenue = mult/10;
			res.insert(0, mult%10);
		}
		
		if (retenue>0) res.insert(0, retenue);
		
		return res;
	}
	
	public static void main(String[] args){
		
		Problem20 p20 = new Problem20();
		
		
		try {
			
			// factoriel 100 ! = ???
			int facto = 100;
			StringBuilder res = new StringBuilder();
			res = res.append(facto);
			
			int v = facto - 1; 
			while (v > 0){
				
				res = p20.multiply(res, v);
				v--;
			}
			
			int total = p20.sum_all_digits(res);
			System.out.println (facto+" = "+res.toString()+", la somme = "+total);
			
		}catch (Exception io){}
		
		
	}
}
