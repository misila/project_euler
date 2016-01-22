/*
Problem 19 

You are given the following information, but you may prefer to do some research for yourself.

1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
*/

public class Problem19 {

	/*
	You are given the following information, but you may prefer to do some research for yourself.

	1 Jan 1900 was a Monday.
	Thirty days has September, April, June and November.
	All the rest have thirty-one,
	Saving February alone, Which has twenty-eight, rain or shine.
	And on leap years, twenty-nine.
	A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.

	How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
	*/
	

			
	static int[] month_nl = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	static int[] month_l =  { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static boolean IsLeapYear(int year){
		
		if (year == 2000 && year%400 ==0) return true;
		if (year%4 == 0 && year%100!=0) return true;
		
		return false;
	}
	
	
	
	public static void main(String [] args){
		
		int d=7, m=0, y=1900;
		int csunday = 0;

		
		while (y<2001){
			
			System.out.print("d="+d+", m="+m+", y="+y+", nb sunday = "+csunday+", ");
			if (d==1 && y>=1901) csunday++;
			int nd = 0, nm = m;
			if (IsLeapYear(y))  {
				System.out.println(y+" est une année bissextile");
				if (d+7==month_l[m]) nd=d+7;
				else  nd = (d+7)%month_l[m];
			}
			else  {
				System.out.println();
				if (d+7==month_nl[m]) nd=d+7;
				else nd = (d+7)%month_nl[m]; 
			}
				
			if (nd==0) nd=1;
			if (nd < d)  { 
				nm = (m+1)%12;
				if (nm < m) y++; 
			}
			d=nd;
			m=nm;
			
			
		}
		/*
		while (y<2001){
			if (IsLeapYear(y)) System.out.println (y+ " est une année bissextile");
			y++;
		}*/
			
		
		System.out.println (" Nombre de dimanche tombant sur le 1er du mois au XXème siècle = "+csunday);
		
	}
	
}
