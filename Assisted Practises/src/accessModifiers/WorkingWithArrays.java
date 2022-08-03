package accessModifiers;

public class WorkingWithArrays {
	
	public static void main(String[] args) {
		

		int a[]= {1,2,3,4,5};
		for(int i=0;i<5;i++) {
		System.out.println("Elements of the array a: "+a[i]);
		}


		
		int[][] b = {
		            {2, 4, 6, 8}, 
		            {3, 6, 9} };
		      
		      System.out.println("\nLength of row 1: " + b[0].length);
		      }
		}

