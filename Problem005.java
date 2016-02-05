
/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

public class Problem5 {

	
	public int smallestDivided(int end){
		
		boolean found=false;
		int result=1;
		
		while (!found){
			result++;
			//System.out.println(" result="+result);
			boolean divided=true;
			for (int i=1; i<=end;i++)
				if (result%i!=0) {divided=false; break;}
			found=divided;
		}
		return result;
		
	}
	
	public static void main(String[] args){
	
		Problem5 p5 = new Problem5();
		int end=20;
		int res = p5.smallestDivided(end);
		System.out.println(res+" is the smallest positive number that is evenly divisible by all the numbers from 1 to "+end);
	}
}
