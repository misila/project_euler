import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class Problem21 {

	
	//Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
	//If d(a) = b and d(b) = a, where a  b, then a and b are an amicable pair and each of a and b are called amicable numbers.

	//For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

	//Evaluate the sum of all the amicable numbers under 10000.
	public Problem21(){
		
	}
	
	int sum_divisor(int number){
		
		int num = number-1;
		int n = number;
		int sum = 0;
		
		while (num>0){
			if (n%num == 0) 
				sum +=num; 
			num--;
		}
		return sum; 
	}

	
	public static void main(String args[]){
		
		Problem21 p21 = new Problem21();
		
		Map<Integer, Integer> l = new Hashtable<Integer, Integer>();
		
		int index = 10000;
		int somme=0;
		List<Integer> listAmicalNumber = new ArrayList<Integer>();
		
		while (index > 0){
		
			int ami = -1, ami2 = -1;
			if (!l.containsKey(index)){
				ami = p21.sum_divisor(index);
				l.put(index, ami);
			}
			else ami=l.get(index);
			
			if (!l.containsKey(ami)){
				ami2 = p21.sum_divisor(ami);
				l.put(ami, ami2);
			}
			else ami2=l.get(ami);
			
			if (index==ami2 && index!=ami)  { 
	
				if (!listAmicalNumber.contains(index)){
					listAmicalNumber.add(index);
					somme +=index;
				}
				if (!listAmicalNumber.contains(ami)){
					listAmicalNumber.add(ami);
					somme+=ami; 
				}
			}
			index--;
		}
		
		System.out.println(" somme totale="+somme);
		/*
		for (int v = 10000; v >=1; v--)
			System.out.println("index="+v+" ==> "+l.get(v));
		*/
		//System.out.println("the sum of all the amicable numbers under 10000 = "+total);
		
   }
}
