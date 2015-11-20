/*
Problem16

215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?
*/

public class problem16 {
	
	/*
	 * The string str in input is a number that is multiply by 2, return a string as result  
	 */
	public String multiplyBy2(String str){
		
		StringBuffer res=new StringBuffer();
		
		if (str==null) return null;
		char array[] = str.toCharArray();
		int retenue = 0;
		
		for (int i=array.length-1; i>=0; --i){
			
			int e=array[i] - 48;
			int result = 2*e + retenue;
			if (result>=10)  {
				retenue=1;
				res.insert(0,result-10);
			}
			else { 
				retenue=0;
				res.insert(0,result);
			}
		}
		
		if (retenue==1) res.insert(0,retenue);
		return res.toString();
	
	}
	
	/*
	 * Compute the operation pow(2, indice) and return a String of digits as result
	 */
	public String puissance(int indice){
		
		if (indice==0) return "1";
		
		String res="1";
		for (int i=1; i<=indice; i++)
			res = multiplyBy2(res);
		
		return res;
	}
	
	/*
	 * Sum all the digits of a string 
	 */
	public int sum(String n){
		
		int som=0;
		for (char c: n.toCharArray())
			som+= (c-48);
			
		return som;
	}
	
	public static void main(String args[]){
		
		problem16 p16 = new problem16();
		int p=1000;
		String puiss2 = p16.puissance(p);
		int res=p16.sum(puiss2);
		System.out.println(res);
		
		
	}
}
