package OOPS;

public class Palindromnumber {

	public  static void IsPalindromnumber(int num) 
	{
		// TODO Auto-generated constructor stub
		int r=0;
		int sum=0;
		int t=0;
		t=num;
		System.out.println("Inputed number "+num);
		while (num>0)
			
		{
			r=num%10;//get reminder
			sum=(sum*10)+r;
			num=num/10;
					
			
		}
		
		if(t==sum)
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not Palindrome number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsPalindromnumber(121);
	}

}
