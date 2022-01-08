package OOPS;

public class PrimeNo {

	static void IsPrime(int n)
	{
		int i,m ,flag=0;
		m=n/2;
		
		if (n<=1)  
		{
			System.out.println(n+"  is not prime number");
		}
		else
		{
			for (i=2;i<m;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+" ---is not prime number");
					flag=1;
					break;
				}
				
			}
				if (flag==0)
					
				{
					System.out.println(n+" is prime number");	
				}
				
				
				
			}
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsPrime(11);

	}

}
