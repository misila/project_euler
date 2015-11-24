
/*
Problem 15

Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
there are exactly 6 routes to the bottom right corner.

       ___________       ___________     ___________           ___________
      |X    |     |			|X    |     |   |X    |     |         |X X X|X X X|
      |X____|_____|			|X_X_X|_____|   |X_X_X|X_X_X|         |_____|____X| 
      |X    |     |			|     |X    |   |     |    X|         |     |    X|
      |X_X_X|X_X_X|			|_____|X_X_X|   |_____|____X|         |_____|____X|
      
      
       ___________           ___________ 
      |X X X|X    |         |X X X|X    |
      |_____|X____|         |_____|X_X_X|
      |     |X    |         |     |    X|
      |_____|X_X_X|         |_____|____X|  
       

How many such routes are there through a 20×20 grid?
		
		
*/	
public class Problem15 {

	long H=20;
	long L=20;
	/* (x,y) are the coordinates of a node in the grid
	 *  
 	 *     A_____B_____C        A(0,0)  B(1,0)  C(2,0)
           |     |     | 
 	 *     D_____E_____F        D(1,0)  E(1,1)  F(2,1)
	 *     |     |     |
 	 *     G_____H_____I        G(0,2)  H(1,2)  I(2,2)
	 *      
	*/
	long computeLatticePaths(int x, int y){
		
		if (x==H && y==L) return 1;
		if (x<H){
			if (y<L){
				return computeLatticePaths(x,y+1)+computeLatticePaths(x+1,y);
			}else return computeLatticePaths(x+1, y);
		}else return computeLatticePaths(x,y+1);
	}
	
	public static void main(String[] args){
		
		Problem15 p15 = new Problem15();
		long soluce = p15.computeLatticePaths(0,0);
		System.out.println("There are "+soluce+" for a grid "+p15.H+"*"+p15.L);
		
	}
}
