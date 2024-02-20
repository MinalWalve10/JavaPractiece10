package javaPrograms;

public class OccuranceofNumArray {

	public static void main(String[] args) {

		int a[]= {10, 20, 30, 50, 10, 30, 90, 80, 40, 40};
		
		for(int i=0; i<a.length; i++)
		{
			int counter=0;
			
			boolean counted= false;
			for (int k = 0; k < i; k++) {
	            if (a[i] == a[k]) {
	                counted = true;
	                break;
	            }
	        }
			
			if (!counted) {
			for (int j=0; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					counter=counter+1;
				}
			}
			System.out.println("Occurance of Number" + a[i] +"is =" +counter);
		}
		}
	
	
	}

}
