package OOPS;

public class Revintger {

	public Revintger() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num=75431;
		long rev=0;
		while(num!=0) 
		{
			rev=rev * 10+num%10;
			num=num/10;
			
		}
		long num1=75431;
		StringBuffer SB=new StringBuffer(String.valueOf(num1));
		SB.reverse();
			System.out.println("Reversal simpleway"+rev);
			System.out.println(SB);
	}

}
