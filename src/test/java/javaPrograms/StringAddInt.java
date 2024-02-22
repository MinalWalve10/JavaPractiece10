package javaPrograms;

public class StringAddInt {

	public static void main(String[] args) {
		String S= "assd1223";
		
		String S1= S.replaceAll("[^0-9]", "");
		int Sum=0;
		
		for(int i=0; i<S1.length(); i++)
		{
			int num= Character.getNumericValue(S1.charAt(i));
			Sum= Sum+num;
		
		}
		System.out.println(Sum);
		
		
	}

}
