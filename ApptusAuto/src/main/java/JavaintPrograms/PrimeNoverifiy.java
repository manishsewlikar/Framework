package JavaintPrograms;

public class PrimeNoverifiy {

	public PrimeNoverifiy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Isprime(5));
		
	}
		public static boolean Isprime(int n)
		
		{
			System.out.println("Number inputed "+n);
			if (n<=1)
				
			{
				return false;
			}
			
			for (int i=2;i<Math.sqrt(n);i++)
				
			{
				if (n%i==0)
				{
					System.out.println(n  +" Is not Prime");
				return false;
				
			}
				System.out.println(n+" Is  Prime");
			return true;
			
		}
			return false;
}
}
