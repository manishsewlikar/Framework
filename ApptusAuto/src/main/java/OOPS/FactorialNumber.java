package OOPS;

public class FactorialNumber {

	public static int Factorial(int n) 
	{
		System.out.println("Given number "+n);
		
		int fact=1;
		
		// TODO Auto-generated constructor stub
		if (n==0)
			return 1;
		for (int i=1;i<=n;i++)
		{
			
			
			fact=fact*i;
			
		}
		
	
		return fact;

	}
	// calling recursive way
	
	public static  int Refact(int num)
	{
		if (num==0)
			
		return 1;
		
		else
			return (num*Refact(num-1));
		
	}
	public static void main(String[] args) {
		System.out.println(Factorial(5));;
		System.out.println("Recursive way  " +Refact(5));;
		// TODO Auto-generated method stub

	}

}
