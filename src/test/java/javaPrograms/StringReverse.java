package javaPrograms;

import java.util.ArrayList;

public class StringReverse {

	public static void main(String[] args) {
		String string= "Welcome To Codemind";
		
		for(int i=string.length()-1; i>=0; i--)
		{
			System.out.print(string.charAt(i));
		}
		
//		
		System.out.println(" ");

		
		String arr[]= string.split(" "); 
		String Reverse="";
		
		for(String Value: arr)
		{
		for(int i=Value.length()-1; i>=0; i--)
		{
			Reverse= Reverse+Value.charAt(i);
		}
		Reverse= Reverse+" ";
		}
		System.out.println(Reverse.trim()+ "  ");
	}

}
