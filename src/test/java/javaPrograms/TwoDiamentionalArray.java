package javaPrograms;

public class TwoDiamentionalArray {

	public static void main(String[] args) {

		int array[][]= { {10, 20,40}, {70, 60, 20} };
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	
		
	}

}
