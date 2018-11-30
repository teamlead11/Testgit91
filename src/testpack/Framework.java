package testpack;

import java.util.Scanner;

public class Framework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frameworkMethodsByuser2();
		frameworkMethods();
		PalindromeMeena();
		newPalindrome();
	}
	
	public static void newPalindrome(String args[]){  
		  int r,sum=0,temp;    
		  int n=454;
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;   
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");   
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
	public void stringPaliTest() {
		System.out.println("my implementation");
	}
	
	
	public static void PalindromeMeena() {
		String s, rev = "";
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a string");
		s = in.nextLine();

		int length = s.length();

		for (int i = length - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (s.equals(rev)) {
			System.out.println("The string is a palindrome.");
		}

		else {
			System.out.println("The string isn't a palindrome.");
		}
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
	
	public void paLindromeByManivel() {
		String rev="";
		System.out.println("Enter the string");
		Scanner aal = new Scanner(System.in);
		String name = aal.next();
		int j=name.length();
		System.out.println(j);
		for (int i = j-1; i >=0; i--) {
			rev=rev+name.charAt(i);
		}
		if (name.equals(rev)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}
}