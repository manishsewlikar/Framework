package JavaintPrograms;

public class AmstrongNo {

	private static final String IntStream = null;

	public AmstrongNo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsAmsNumber(123);
		//IntStream.(new int[] {4, 7, 1, 8, 3, 9, 7}).filter((int i) -> i > 5).distinct().forEach(System.out::println);

	}

	public static void IsAmsNumber(int n)
	
	{
		System.out.println("Number inputed is "+n);
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
			System.out.println(" Given number is Ams");
		}
		else
		{
			System.out.println(" Given is not number is Ams");
		}
	}
}
