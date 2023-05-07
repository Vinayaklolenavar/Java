import java.util.*;

public class Scanner_2D_array {
	public static void main(String args[]) {
		
		//Here we are taking input from the keyboard
		
		Scanner sc = new Scanner(System.in);
		
		//enter the number of rows and column
		System.out.println("Please enter the number of row: ");
		int row =sc.nextInt();
		
		System.out.println("Please enter the number of column: ");
		int column =sc.nextInt();
		int[][] arr = new int[row][column];
		
		for(int i=0; i<arr.length; i++)
		{
			
			System.out.println("Please enter the value in " +(i+1)+" row: ");
			
			//Here Second loop is used for number of columns
			for(int j=0;j<arr[i].length;j++)
				// Here arr[i].length gives the length of particular row.
			{
				//Here we are storing the enter value in matrix
				arr[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
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
