
/*
 * 
 * The sum of the squares of the first ten natural numbers is,

1² + 2² + ... + 10² = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)² = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

public class Problem6 {

	int sumOfSquare(int number){
		
		int sum=0;
		
		for (int i=1; i<=number; i++){
			
			sum+=i*i;
		}
		return sum;
	}
	
	int squareOfSum(int number){
		
		int sum=0;
		
		for (int i=1; i<=number; i++){
			sum+=i;
		}
		return sum*sum;
		
	}
	
	public static void main(String[] args){
		
		
		Problem6 p6 = new Problem6();
		
		int s1 = p6.squareOfSum(100);
		int s2 = p6.sumOfSquare(100);
		int result=0;
		if (s1>=s2)  result = s1-s2;
		else result = s2-s1;
		
		System.out.println(" The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is "+result);
	}
	
}
