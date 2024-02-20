package javaPrograms;

public class CharacterSortArray {

	public static void main(String[] args) {

		char Character[]= {'z', 'a', 'B', 'y', 'c'};
		
		System.out.println("PRINT ARRAY");

		for(int i=0;i<Character.length; i++)
		{
			System.out.println(Character[i]);
		}
		
		//SORTING ARRAY
		for(int i=0;i<Character.length; i++)
		{
			for(int j=i+1;j<Character.length; j++)
			{
				if(Character[i]>Character[j])
				{
				char temp= Character[i];
				Character[i]=Character[j];
				Character[j]=temp;
				}
			}
		}
		
		System.out.println("SORTED ARRAY");

		for(char Value: Character)
		{
			System.out.println(Value);
		}
	}

}
