import java.util.ArrayList;
import java.util.List;

/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/

public class Problem3 {

	
	boolean isPrimeNumber(double n){
		
		boolean loop=false;
		boolean prime=true;
		
		if (n<1) return false;
		if (n==1) loop=true;
		
		int count=2;
		
		while (!loop){

			if (n%(count++)==0) {
				loop=true;
				prime=false;
			}
			else loop = count>=n;
		}
		
		if (count==n) prime=true;
		/*if (prime) System.out.println(n+" is a prime number !!!");
		else System.out.println(n+" is NOT a prime number !!!");
		*/
		return prime;
	}
	
	List<Double> isPrimeFactor(double n){
		
		double count=2;
		List<Double> l = new ArrayList<Double>();
		
		while (count<n){
			
			if (n%count==0 && !l.contains(count)){
				//System.out.println(count+" is factor of "+n);
				boolean noprime=false;
				for (Double elem: l){
					if (count>elem && count%elem==0) noprime=true;
				}
				if (!noprime && isPrimeNumber(count)){
					l.add(count);
					System.out.println(count+" is prime factor and prime number ");
				}
			}
			count++;
		}
		return l;
	}
	
	
	public static void main(String[] args){
		
		Problem3 p3 = new Problem3();
		double number = 600851475143.0;
		
		List<Double> list = p3.isPrimeFactor(number);
		System.out.println(" list of prime factor {= "+list);
		
	}
}
