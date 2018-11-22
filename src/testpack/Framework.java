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
	public void PalindromeMeena() {
		String s, rev = "";
	      Scanner in = new Scanner(System.in);
	     
	      System.out.println("Enter a string");
	      s = in.nextLine();
	     
	      int length = s.length();
	     
	      for (int i = length - 1; i >= 0; i--)
	         rev = rev + s.charAt(i);
	         
	      if (s.equals(rev))
	         System.out.println("The string is a palindrome.");
	      else
	         System.out.println("The string isn't a palindrome.");
	}
}