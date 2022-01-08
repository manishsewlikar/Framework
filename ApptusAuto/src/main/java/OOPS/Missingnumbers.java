package OOPS;

public class Missingnumbers {

	public Missingnumbers() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,4};
		int sum=0;
		
		for (int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
			//System.out.println(sum);
	
	
	int sum1 = 0;
	for (int j=1;j<=10;j++)
		{
		sum1=sum1+j;
	}

	System.out.println("Total..."+sum1);
	System.out.println("Missing number:::"+(sum1-sum));
}
}