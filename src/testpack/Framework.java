package testpack;

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

	// muthu Palindrome 
	{
		
		
	int num = 121, reversedInteger = 0, remainder, originalInteger;

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
	//Shankar Palindrome
	  {
		  int r,sum=0,temp;    
		  int n=454;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		}  
