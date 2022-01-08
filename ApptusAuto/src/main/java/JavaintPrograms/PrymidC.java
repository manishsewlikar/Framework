package JavaintPrograms;

public class PrymidC {

	public PrymidC() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatePraymkid(9);

	}
	public static void CreatePraymkid(int NoofRows)
	
	{
		int rowcount=1;
		
		for (int i=NoofRows;i>0;i--)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=rowcount;j++)
				
			{
				System.out.print(rowcount+" ");
				
			}
			System.out.println();
			rowcount++;
		}
		
	}


}
