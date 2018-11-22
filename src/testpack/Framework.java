package testpack;

import java.util.Scanner;

public class Framework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frameworkMethodsByuser2();
		frameworkMethods();
	}

	public static void frameworkMethodsByuser2() {

		System.out.println("modifed framework method by user1");

	}

	private static void frameworkMethods() {
		// TODO Auto-generated method stub
		System.out.println("changes done by user2");
		System.out.println("changes done by user1");
	}

	public static void frameworkMethodsByuser1() {
		System.out.println("modifed framework method by user1");
	}
	public static void PalindromeRanjitha() {
	      String original, reverse = ""; 
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
// muthu Palindrome 	
	{ int num = 121, reversedInteger = 0, remainder, originalInteger;

    originalInteger = num;

    // reversed integer is stored in variable 
    while( num != 0 )
    {
        remainder = num % 10;
        reversedInteger = reversedInteger * 10 + remainder;
        num  /= 10;
    }

    // palindrome if orignalInteger and reversedInteger are equal
    if (originalInteger == reversedInteger)
        System.out.println(originalInteger + " is a palindrome.");
    else
        System.out.println(originalInteger + " is not a palindrome.");
}
}