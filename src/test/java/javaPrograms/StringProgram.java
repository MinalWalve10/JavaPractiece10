package javaPrograms;

public class StringProgram {

	public static void main(String[] args) {
		String string= "welcome To Codemind";
		
		String S2= "";
		int Counter=0;
        for(int i=0; i<string.length(); i++)
        {
           if(string.charAt(i)=='a' || string.charAt(i)=='e' || string.charAt(i)=='i'  || string.charAt(i)=='o' || string.charAt(i)=='u' )
           {
        	 Counter=Counter+1;
             S2= S2+ string.charAt(i);
           }
           
         
        }
        System.out.println("Vowels in String = "+ S2);
        System.out.println("Numbers of Vowels = "+Counter);
	}

}
