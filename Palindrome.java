import java.util.*;
 
public abstract class Palindrome implements CheckPalindrome {
		
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			
			CheckPalindrome ip = (str) -> {    
				 String rev = "";
				 int length = str.length();
				 
			      for ( int i = length - 1; i >= 0; i-- )
			         rev = rev + str.charAt(i);
			 
			      if (str.equals(rev))
			    	  System.out.println(str+" is a palindrome");
			      else
			         System.out.println(str+" is not a palindrome");
				
				
				
				
				
				
			};
			ip.spalindrome(s);
		
		}


		
		

	}