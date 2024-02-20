package javaPrograms;

public class MaxNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {10, 20, 30, 50, 110, 90, 80};
			
			int temp=a[0];
			for(int i=0; i<a.length; i++)
			{
			  if(a[i]>temp)
			  {
			    temp=a[i];
			  }
			}
			
			System.out.println("Max number from array is = " +temp);

	}

}
