package javaPrograms;

public class SingleDiamentionArray {

	public static void main(String[] args) {

		int a[]= {80, 30, 60, 10, 40, 20};
		
		//PRINT 

		for(int Value: a)
		{
			System.out.println(Value);
		}
	
		//SORT ARRAY
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]<a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
	}
		
		for(int Print: a)
		{
			System.out.println(Print);
		}

		
		//REVERSE ARRAY
		  int b[]= {10, 20, 30, 50, 10, 30, 90, 80, 40, 40};
			
			for(int i=b.length-1; i>0; i--)
			{
			
			System.out.println(b[i]);
			}
}
}