package com.euler;
 
 
 
public class Main {
 
     
      //private static Hashtable<Integer, Number> dico = new Hashtable <Integer, Number>();
     
      public static int count_letters(String n){
           
            int count = 0, k;
            String [] array = n.split(" ");
            for (k = 0; k< array.length; k++){
           
                  count += array[k].length();
                  if (array[k].contains("-"))  count -=1;
            }
            return count;
      }
     
      public static void main(String args[]){
           
 
            int i;
            int counter = 0;
           
            for (i=1000; i>=1; i--){
                 
                  StringBuilder number = generate_word(i);
                  int c = count_letters(number.toString());
                  System.out.println (i+" = "+number+", compte "+c+" lettres");
                  counter += c;          
            }
     
            System.out.println(" entre 1 et 1000 compte "+counter+", letters");
           
            // three hundred and forty-two = 23 letters
            /*
            String s1 = new String("three hundred and forty-two");
            String s2 = new String("one hundred and fifteen");
            String s3 = new String("forty-two");
           
            int nb = count_letters(s2);*/
           
            //System.out.println(" nb of letters in 115 = "+nb);
            /*
            StringBuilder sbb1 = generate_word(100);
            System.out.println (" 1 = "+sbb1.toString()+", "+count_letters(sbb1.toString())+" letters");
           
            StringBuilder sbb2 = generate_word(342);
            System.out.println (" 342 = "+sbb2.toString()+", "+count_letters(sbb2.toString())+" letters");
           
            StringBuilder sbb3 = generate_word(932);
            System.out.println (" 932 = "+sbb3.toString()+", "+count_letters(sbb3.toString())+" letters");;
            */
      }
     
      // function pour generer un mot correspondant à un nombre entre 1 et 1000
      public static StringBuilder  generate_word(int number){
     
            StringBuilder sb = new StringBuilder();
            int n = number;
           
            if (n == 0) return sb;
            if (n == 1000) return sb.append("one").append("thousand");
            if (n >= 100) {
                  sb = sb.append(generate_word(n/100));
                  sb = sb.append("hundred ");
                  if (n%100>0) sb = sb.append("and ");
                  sb = sb.append(generate_word(n%100));
                  return sb;
            }
            if (n >= 90) return sb.append("ninety ").append(generate_word(n-90));
     
            if (n >= 80) return sb.append("eighty ").append(generate_word(n-80));
                 
            if (n >= 70) return sb.append("seventy ").append(generate_word(n-70));
                 
            if (n >= 60) return sb.append("sixty ").append(generate_word(n-60));
 
            if (n >= 50) return sb.append("fifty ").append(generate_word(n-50));
 
            if (n >= 40) return sb.append("forty ").append(generate_word(n-40));
                 
            if (n >= 30) return sb.append("thirty ").append(generate_word(n-30));
 
            if (n >= 20) return sb.append("twenty ").append(generate_word(n-20));
           
            if (n == 19) return sb.append("nineteen ");
            if (n == 18) return sb.append("eighteen ");
            if (n == 17) return sb.append("seventeen ");
            if (n == 16) return sb.append("sixteen ");
            if (n == 15) return sb.append("fifteen ");
            if (n == 14) return sb.append("fourteen ");
            if (n == 13) return sb.append("thirteen ");
            if (n == 12) return sb.append("twelve ");
            if (n == 11) return sb.append("eleven ");
            if (n == 10) return sb.append("ten ");
            if (n == 9)  return sb.append("nine ");
            if (n == 8)  return sb.append("eight ");
            if (n == 7)  return sb.append("seven ");
            if (n == 6)  return sb.append("six ");
            if (n == 5)  return sb.append("five ");
            if (n == 4)  return sb.append("four ");
            if (n == 3)  return sb.append("three ");
            if (n == 2)  return sb.append("two ");
            if (n == 1)  return sb.append("one ");
 
            return sb;
      }
 
}
