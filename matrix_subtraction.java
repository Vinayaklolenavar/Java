import java.util.*;
public class matrix_subtraction {
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
		
		//enter the number of rows and column
		System.out.println("Please enter the number of row: ");
		int row =sc.nextInt();
		
		System.out.println("Please enter the number of column: ");
		int column =sc.nextInt();
		int[][] first = new int[row][column];
		int[][] second = new int[row][column];
		int[][] matrix_addition= new int[row][column];
		
		//Entering the value in first matrix
		System.out.println("Entering the value for First matrix");
		for(int i=0; i<first.length; i++)
		{
			
			System.out.println("Please enter the value in " +(i+1)+" row: ");
			
			//Here Second loop is used for number of columns
			for(int j=0;j<first[i].length;j++)
				// Here arr[i].length gives the length of particular row.
			{
				//Here we are storing the enter value in matrix
				first[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		//Entering the value for second matrix
		System.out.println("Entering the value for second matrix");
		
		for(int i=0; i<second.length; i++)
		{
			
			System.out.println("Please enter the value in " +(i+1)+" row: ");
			
			//Here Second loop is used for number of columns
			for(int j=0;j<second[i].length;j++)
				// Here arr[i].length gives the length of particular row.
			{
				//Here we are storing the enter value in matrix
				second[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		//Matrix Addition
		
		
		for(int i=0; i<matrix_addition.length; i++)
		{
			
			//Here Second loop is used for number of columns
			for(int j=0;j<matrix_addition[i].length;j++)
				// Here arr[i].length gives the length of particular row.
			{
				//Here we are storing the enter value in matrix
				matrix_addition[i][j]=first[i][j]-second[i][j];
			}
			System.out.println();
		}
		
		// Printing the Matrix after addition
		
		System.out.println("Matrix after Addition");
		for(int i=0; i<matrix_addition.length; i++)
		{
			
			//Here Second loop is used for number of columns
			for(int j=0;j<matrix_addition[i].length;j++)
				// Here arr[i].length gives the length of particular row.
			{
				//Here we are storing the enter value in matrix
				System.out.print(matrix_addition[i][j]+ " ");
			}
			System.out.println();
		}	
		
	}


}
