
public class StringPractice {

	public StringPractice() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringStudy();
	}



public static void StringStudy()
{
	String str="abck1238xyz23mno04pqr08t";
	String str1="the rain is started";
	String str2="  I am man";
	String revstr="Manish";
	String test="Hello World Java";
	String rev = "";
	String junk="x222222XXX$AA";
	
	int len=revstr.length();
	for (int i=len-1;i>=0;i--)
	{
		 rev=rev+revstr.charAt(i);
	}
	StringBuffer sb= new StringBuffer(revstr);
	System.out.println(sb.reverse());
System.out.println("Length"+str.length());
System.out.println(str.charAt(4));

System.out.println(str.indexOf("4"));

System.out.println(str.indexOf('k',str.indexOf('t')+1));
System.out.println(str1.indexOf("is"));
 System.out.println(str1.substring(0,8));
 System.out.println(str2.trim());
 String testval []=test.split(" ");
 for (int i=0;i<testval.length;i++)
 {
	 System.out.println(testval[i]);
 }
 String x="Hello";
 String y="world";
int a=100;
int b=200;
System.out.println((a+b)+(x+y));
System.out.println(rev);
System.out.println(junk.replaceAll("[a-zA-Z0-9]",""));

}

}