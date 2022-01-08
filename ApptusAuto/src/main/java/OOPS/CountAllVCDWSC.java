/**
 * 
 */
package OOPS;import java.awt.im.InputContext;
import java.io.InputStream;

import javax.swing.text.AttributeSet.CharacterAttribute;

/**
 * @author Admin
 *
 */
public class CountAllVCDWSC {

	/**
	 * 
	 */
	public CountAllVCDWSC() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countAll("Neovasolutions @1");

	}
	
	public static void countAll(String InputStr)
	
	{
		int Vcount=0; int Ccount=0; int digits=0; int spaces=0; int spe_char=0;
		
		for (int i=0;i<=InputStr.length()-1;i++)
		{
			char ch= InputStr.charAt(i);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='o')
			{
				Vcount++;
			}
			else if (ch<='a' && ch>='z'||ch<='A' && ch>='Z')
				
			{
				Ccount++;
			}
			
			else if (ch>='0' && ch<='9') 
			{
				digits++;
			}
			
			else if (ch==' ') 
			{
				spaces++;
			}
			else
			{
				spe_char++;
			}
			
			
		}
		System.out.println("\n Total vowel count is "+Vcount);
		System.out.println("\n Total Cosoent count is "+Ccount);
		System.out.println("\n Total Digits count is "+digits);
		System.out.println("\n Total White Spaces count is "+spaces);
		System.out.println("\n Total Special Characters "+spe_char);
	}

}
