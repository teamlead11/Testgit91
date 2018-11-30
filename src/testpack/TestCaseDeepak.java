package testpack;

public class TestCaseDeepak {
	public void sampleInfo() {
		System.out.println("Deepak New Test Case");
	}

	public static void main(String[] args) {
		TestCaseDeepak deep = new TestCaseDeepak();
		deep.sampleInfo();
	
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

}
