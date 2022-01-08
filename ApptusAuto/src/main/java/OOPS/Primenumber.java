package OOPS;

public class Primenumber {

	public static boolean Isprime(int n)
	{
		
		if (n<=1)
		{
			
			return false;
			
		}
		
		for (int i=2;i<n;i++)
			
		{
			if (n%i==0) {
				//System.out.println(n+"...not PrimeNumber");
				return false;
				
			}
			
		}
		//System.out.println(n+"..Primenumber");
		return true;
		
	}
	
	public static void getPrimeNumbers(int num)
	
	{
		for ( int i=2;i<=num;i++)
		{
			if (Isprime(i))
			{
				System.out.print(i + " ");
			}
		}
			
			
		
	}


	public static void main(String[] args) {
		System.out.println(Isprime(10));
		getPrimeNumbers(100);
		
		// TODO Auto-generated method stub

	}

}
