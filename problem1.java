import java.util.ArrayList;
import java.util.List;

/*
*  
* If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
*  Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class Problem1 {

	public List<Integer> findMultiplesOf_3_5(int max){
		
		List<Integer> result = new ArrayList<Integer>();
		
		for (int i=max-1; i>0; i--){
			if (i%3==0 || i%5==0)
				result.add(i);
		}
		
		return result;
		
	}
	public static void main(String[] args){
		
		Problem1 p1 = new Problem1();
		List<Integer> l = p1.findMultiplesOf_3_5(1000);
		
		int som=0;
		for (Integer i: l){
			System.out.print(i+" ");
			som+=i;
		}
			
		System.out.println();
		System.out.println("Somme = "+som);
		
		
	}
}
