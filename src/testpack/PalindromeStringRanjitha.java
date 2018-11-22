package testpack;

import java.util.Scanner;

public class PalindromeStringRanjitha {
	  public static void main(String args[])
	   {
	      String original, reverse = ""; // Objects of String class
	      Scanner ab = new Scanner(System.in);
	     
	      System.out.println("Check entered string is a palindrome or not");
	      original = ab.nextLine();
	     
	      int length = original.length();
	     
	      for (int i = length - 1; i >= 0; i--)
	         reverse = reverse + original.charAt(i);
	         
	      if (original.equals(reverse))
	         System.out.println("The string is a palindrome.");
	      else
	         System.out.println("The string isn't a palindrome.");
	         
	   }
}
