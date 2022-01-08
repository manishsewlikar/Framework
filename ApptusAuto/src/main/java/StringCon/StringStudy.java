/**
 * 
 */
package StringCon;

import java.util.HashMap;
import java.util.Iterator;

import org.testng.annotations.BeforeClass;

import com.gargoylesoftware.htmlunit.javascript.host.Map;
import com.google.common.util.concurrent.Service.State;

import ch.qos.logback.core.net.SyslogOutputStream;

/**
 * @author Admin
 *
 */
public class StringStudy {

	/**
	 * 
	 */
	public StringStudy() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumofDigitsinString();
		findDuplicateString("I am am learning java java");
		//sumofDigitsinStringonlynumbers();
	}
	public static void sumofDigitsinString()
	{
		String str="abc123xyz23mno04pqr08";
		int sum=0;
		for (int i=0;i<str.length();i++)
			
		{
			if (Character.isDigit(str.charAt(i)))
			 sum= sum+Integer.parseInt(str.charAt(i)+"");
		}
		System.out.println("Original string"+str);
		System.out.println(sum);
	} 
	
	public static void sumofDigitsinStringonlynumbers()
	{
		String str="abc123xyz23mno04pqr08";
		int sum=0;
		int count=0;
		boolean Isdigit=false;
		int length=str.length();
		for (int i=0;i<str.length();i++)
			
		{
			if (Character.isDigit(str.charAt(i)))
				
			{
			 count++;
			Isdigit=true;
			
		}else
			{
			 if (Isdigit)
			{
				sum=sum +Integer.parseInt(str.substring(i-count,1));
				Isdigit=false;
				count=0;
			}
				
		}
			if (count>0 && Isdigit)
			{
				sum=sum+Integer.parseInt(str.substring(length - count,length));
			}
		System.out.println(sum+"Sum of number block");
	} 
	

}
	public static void findDuplicateString(String inputstring)
	{
		String words[]=inputstring.split(" ");
		HashMap<String, Integer> hm=new HashMap<>();
		for(String tempString:words)
		{
			if (hm.get(tempString)!=null)
			{
				hm.put(tempString, hm.get(tempString)+1);
			}
			else
				
			{
			hm.put(tempString,1);
			}
			
		}
		System.out.println(hm);
		Iterator<String> tempString=hm.keySet().iterator();
		while(tempString.hasNext())
		{
			String temp=tempString.next();
			if (hm.get(temp) > 1)
				{
					System.out.println("The Word"+temp+hm.get(temp)+"No of times");	
		}
	} 
}

}