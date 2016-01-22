import java.util.ArrayList;
import java.util.List;

/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
*/		
		
public class Problem7 {

	List<Integer> listPrimeNumber(int ieme){
	
		List<Integer> l = new ArrayList<Integer>();
		int count=2;
		
		while (l.size()<ieme){
			boolean prime=true;
			for (Integer elem: l){
				if (count%elem==0){
					prime=false;
					break;
				}
			}
			if (prime) l.add(count);
			count++;
		}
		
		return l;
	}
	
	public static void main(String[] args){
		
		Problem7 p7 = new Problem7();
		int ieme=10001;
		List<Integer> l = p7.listPrimeNumber(ieme);
		//System.out.println(" list of primes = "+l);
		System.out.println(" The "+ieme+" prime is "+l.get(ieme-1));
	}
}
