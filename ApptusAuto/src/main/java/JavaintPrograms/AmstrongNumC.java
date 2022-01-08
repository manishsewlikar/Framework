package JavaintPrograms;

public class AmstrongNumC {

	public AmstrongNumC() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsAmstrongNum(153);
		//System.out.println(SumofDigit(2321));
	}

	private static int SumofDigit(int number) 
	{
		int sum=0;
		// TODO Auto-generated method stub
		while (number!=0)
			
		{
			 sum=sum+number%10;
			 number=number/10;
			 
			 
		}
		return sum;
	}

	public static void IsAmstrongNum(int n) {
		// TODO Auto-generated method stub
		System.out.println("Inputed number"+n);
		int cube=0;
		int r,t;
		t=n;
		while (n>0)
		{
			r=n%10;
			n=n/10;
			cube=cube+(r*r*r);
		}
		if (t==cube)
		{
			System.out.println("Given number is Ams");
			
		}
		else
		{
			System.out.println("Given number is NOT Ams");
		}
	}
	
	

}
