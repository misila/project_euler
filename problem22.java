import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class AlphabeticalSort implements Comparator<Map.Entry<String,Integer>> {
	
	
	public int compare(Map.Entry<String,Integer> e1, Map.Entry<String,Integer> e2) {
        if (e1.getValue() < e2.getValue()){
            return 1;
        } else if (e1.getValue() == e2.getValue()) {
            return 0;
        } else {
            return -1;
        }
    }
}

public class Problem22 {

	private static Dictionary<Character, Integer>  alphabetic = new Hashtable<Character, Integer>();
	Map<String, Integer> dico;
	
	public Problem22(){
		
		AlphabeticalSort sort = new AlphabeticalSort();
		 dico = new TreeMap<String, Integer>();
	}
	
	
	public static void main(String args[]){
		
		long start = System.currentTimeMillis();
		
		alphabetic.put('A', 1);
		alphabetic.put('B', 2);
		alphabetic.put('C', 3);
		alphabetic.put('D', 4);
		alphabetic.put('E', 5);
		alphabetic.put('F', 6);
		alphabetic.put('G', 7);
		alphabetic.put('H', 8);
		alphabetic.put('I', 9);
		alphabetic.put('J', 10);
		alphabetic.put('K', 11);
		alphabetic.put('L', 12);
		alphabetic.put('M', 13);
		alphabetic.put('N', 14);
		alphabetic.put('O', 15);
		alphabetic.put('P', 16);
		alphabetic.put('Q', 17);
		alphabetic.put('R', 18);
		alphabetic.put('S', 19);
		alphabetic.put('T', 20);
		alphabetic.put('U', 21);
		alphabetic.put('V', 22);
		alphabetic.put('W', 23);
		alphabetic.put('X', 24);
		alphabetic.put('Y', 25);
		alphabetic.put('Z', 26);
		
		Problem22 p22 = new Problem22();
		p22.feedDico();
		
		//long stop = System.currentTimeMillis();
		//System.out.println (" speed program = "+(stop-start));
	}
	
	public void feedDico(){
	
		try {
		
			System.out.println (System.getProperty("user.dir"));
			BufferedReader reader = new BufferedReader(new FileReader("name.txt"));
			int fcharacter = 0;
			int state = 0;
			StringBuffer buf = new StringBuffer();
			int sum = 0;
			int nbword = 0;
			
			while ((fcharacter = reader.read()) != -1) {
				
				char c = (char)fcharacter; 
				if (c == '"') {
					switch (state) {
						case 0: 
							state = 1;
							break;
						case 1: 
							state = 2;
							nbword++;
							dico.put(buf.toString(), sum);
							break;
					}
				}
				else if (c == ','){
					if (state==2) state=0;
					buf.delete(0, buf.length());
					sum = 0;
				}
				else { 
					buf.append(c);
					sum += alphabetic.get(c);
				}
			}
			
		}
		catch (EOFException eofe) { System.out.println (" End of File "); }
		catch (IOException e) { System.out.println (" file not found");}
		
		
		System.out.println (" dico.size() = "+dico.size());
		Set<String> keys = dico.keySet();
		Iterator<String> iterKeys = keys.iterator();
		
		int total = 0;
		int indice = 0;
		while (iterKeys.hasNext()) {
			indice++;
			String next = iterKeys.next();
			int som = indice* dico.get(next);
			dico.put(next, som);
			total += som;
			System.out.println("key : "+next+", value = "+som);
		}
		
		System.out.println ("total = "+total);
		
	}
	
	
}
