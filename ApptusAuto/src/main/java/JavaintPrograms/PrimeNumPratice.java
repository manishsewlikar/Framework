package JavaintPrograms;

public class PrimeNumPratice {

	public PrimeNumPratice() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsPrime(5);

	}
	
	public static boolean IsPrime(int n)
	
	{
		System.out.println("Number Inputed..."+n);
		
		if (n<=0)
		{
			return false;
		}
			
		for (int i=2;i<=Math.sqrt(n);i++)
		{
			if (n%10==0)
				
			{
				System.out.println("NoT Prime number");
			}
			else
				
			{
				System.out.println(" Prime number");
				return true;
			}
		}
			
		
		
		return false;
		
	}

}
