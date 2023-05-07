import java.util.*;

public class Simple_2s_array {
	
	public static void main(String args[])
	{
		//initializing 2D array
		
		//Here we have declared an array of 2 rows and 3 columns
		
		int[][] arr= {{1,3,3},{1,4,5}};
		
		//Printing the array
		
		//Here first loop is used for number of rows
		
		for(int i=0; i<arr.length; i++)
		{
			//Here Second loop is used for number of columns
			for(int j=0;j<arr[i].length;j++)
				// Here arr[i].length gives the length of particular row.
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}