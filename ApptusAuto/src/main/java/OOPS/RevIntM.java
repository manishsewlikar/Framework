package OOPS;

public class RevIntM {

	static void RevInt(int n,String Str,int k)
	
	{
		
		int p=0;
		p=k%2;
		System.out.println("remider after division  "+p);
		
		if (p==0)
		{
			System.out.println(k+" ..Is not Prime number");
		}
		else
		{
			System.out.println(k+"..Is  Prime number");
		}
		StringBuffer SB=new StringBuffer(String.valueOf(n));
		StringBuffer sf=new StringBuffer(Str);
		System.out.println(sf.reverse());
		 
	System.out.println(SB.reverse());
	
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RevInt(12345,"MANISH",5);
	}

}
