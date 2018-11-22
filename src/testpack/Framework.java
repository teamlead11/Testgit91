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