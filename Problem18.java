/*
By starting at the top of the triangle below and moving to adjacent numbers on the row below, 
the maximum total from top to bottom is 23.

3
7 4
2 4 6
8 5 9 3

That is, 3 + 7 + 4 + 9 = 23.
Find the maximum total from top to bottom of the triangle below:

75
95 64
17 47 82
18 35 87 10
20 04 82 47 65
19 01 23 75 03 34
88 02 77 73 07 63 67
99 65 04 28 06 16 70 92
41 41 26 56 83 40 80 70 33
41 48 72 33 47 32 37 16 94 29
53 71 44 65 25 43 91 52 97 51 14
70 11 33 28 77 73 17 78 39 68 17 57
91 71 52 38 17 14 91 43 58 50 27 29 48
63 66 04 68 89 53 67 30 73 16 69 87 40 31
04 62 98 27 23 09 70 98 73 93 38 53 60 04 23

NOTE: As there are only 16384 routes, it is possible to solve this problem by trying every route. 
However, Problem 67, is the same challenge with a triangle containing one-hundred rows; 
it cannot be solved by brute force, and requires a clever method! ;o)

*/
public class Problem18 {

   public static void main(String args[]){
	
	int [][] triangle = { {75},
  			      {95, 64},
			      {17, 47, 82},
			      {18, 35, 87, 10},
			      {20, 04, 82, 47, 65},
			      {19, 01, 23, 75, 03, 34},
			      {88, 02, 77, 73, 07, 63, 67},
			      {99, 65, 04, 28, 06, 16, 70, 92},
			      {41, 41, 26, 56, 83, 40, 80, 70, 33},
			      {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
			      {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
			      {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
			      {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
			      {63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
			      {04, 62, 98, 27, 23,  9, 70, 98, 73, 93, 38, 53, 60, 04, 23}  };

	System.out.println("triangle.length = "+triangle.length);
	
	for (int k=triangle.length-2; k>=0;k--){
			
		int length = triangle[k].length;
		int[] ntriangle = new int[length];
		for (int l=0; l<length; l++){

			ntriangle[l]= triangle[k][l] + triangle[k+1][l];
			//System.out.print("### s1=("+triangle[k][l]+"+"+triangle[k+1][l]+")= "+ntriangle[l]);
			int s3=triangle[k][l] + triangle[k+1][l+1];
			//System.out.println(", s3 =("+triangle[k][l]+"+"+triangle[k+1][l+1]+") = "+s3);
				
			if (s3>ntriangle[l]) ntriangle[l]=s3;
			System.out.print(ntriangle[l]+" ");
		}
		System.out.println();
		for (int l=0; l<length; l++)
			triangle[k][l]=ntriangle[l];	
		
		System.out.println(" max = "+triangle[0][0]);
	}
}
