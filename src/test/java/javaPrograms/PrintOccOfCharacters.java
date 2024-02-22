package javaPrograms;

public class PrintOccOfCharacters {

	public static void main(String[] args) {
		String string= "Welcome To Codemind Pune";
		
		String Duplicate= "";
		for(int i=0; i<string.length(); i++)
		{
			if(Duplicate.contains(string.valueOf(string.charAt(i))))
				continue;
			
			int Counter=0;
			for(int j=0; j<string.length(); j++)
			{
				if(string.charAt(i)==string.charAt(j))
				{
					Counter++;
				}
				Duplicate=Duplicate+string.charAt(i);
			}
			System.out.println("Occurance of Character " +string.charAt(i)+ " is = " +Counter);
		}
	}

}
