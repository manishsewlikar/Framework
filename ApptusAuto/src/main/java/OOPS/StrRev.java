package OOPS;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class StrRev {

	public StrRev() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gstr="$$*Manish124&";
		System.out.println(gstr.indexOf('4'));
		gstr=gstr.replaceAll("[$$&*0-9]", "");
		System.out.println(gstr);
		String Str="ManishMack";
		System.out.println("");
		String revstr="";
		int len=Str.length();
		System.out.println("String compare "+gstr.equals(Str));
		System.out.println("Length is"+len);
		for (int i=len-1;i>=0;i--)
			
		{	
			revstr=revstr+Str.charAt(i);
			// System.out.println("stringreversal "+revstr);
			 
			 
	

   
   
	
}
		StringBuffer sf=new StringBuffer(Str);
		System.out.println("Output"+revstr);
		System.out.println(sf.reverse());
	

	}
}