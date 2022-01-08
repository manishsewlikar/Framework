package OOPS;

public class ArmstrongNumber {

	public static void IsArmstrongNumber(int num) {
		// TODO Auto-generated constructor stub
		System.out.println("Given number"+num);
		int cube=0;
		int r,t;
		t=num;
		while (num>0)
		{
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
			
		}
			if(t==cube)
				
			{
				System.out.println("Armstrong Number");
			}
			else
			{
				System.out.println("Not ArmstrongNumber");
			}
			
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsArmstrongNumber(123);
		
		}
	}


