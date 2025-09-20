package Strings.Basic;

public class Palin {
    public static void main (String[] args) 
	{
		// your code goes here
		String s="abcba";
		int n=s.length();
		boolean isPalin=true;
		for(int i=0;i<n-1;i++)
		{
		    if(s.charAt(i)!=s.charAt(n-i-1))
		    {
		        isPalin=false;
		        break;
		    }
		}
		if(isPalin)
		System.out.println("Palindrome");
		else
		System.out.println("Not Palindrome");
		

	}
}
