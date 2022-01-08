/**
 * 
 */
package OOPS;

/**
 * @author Admin
 *
 */
public class RevIntegersimplway {

	/**
	 * 
	 */
	public RevIntegersimplway() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//Revintger(12345);
		MissingnumberinArr();
	}

public static void Revintger (int num)
{
	
	int rev=0;
	
	while(num!=0)
	{
		rev=rev*10+num%10;
		num=num/10;
	}
	System.out.println("Reversal"+rev);
	long num1=12345;
 	StringBuffer sb=new StringBuffer(String.valueOf(num1));
 	System.out.println("Reversal SB>>>>>>"+sb.reverse());
}

public static void MissingnumberinArr ()
{
	
	int a[]= {1,2,4,5};
	
	int sum=0;
	for (int i=0;i<a.length;i++)
	{
		
		sum=sum+a[i];
System.out.println(sum);
	}
	int sum1=0;
	for (int j=1;j<=10;j++)
	{
		sum1=sum1+j;
	}
	System.out.println(sum1);
	System.out.println("Missing number is"+(sum1+sum));
}
 
}