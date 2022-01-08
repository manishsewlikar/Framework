package OOPS;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.net.imap.IMAP.IMAPChunkListener;

public class Stroccur {

	public Stroccur() 
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountCharOccur("FDDDDPPLLWWLQ!");

	}



static void CountCharOccur (String str)
{
	HashMap<Character, Integer> charcountmap= new HashMap<Character,Integer>();
	char StrArr[]=str.toCharArray();
	for (char c:StrArr)
	{
		if (charcountmap.containsKey(c))
		{
			charcountmap.put(c, charcountmap.get(c)+1);
		}
		else
		{
			charcountmap.put(c, 1);
		}
		for (Map.Entry entry :charcountmap.entrySet())
		{
			System.out.println("Occurence  "+entry.getKey()+" "+entry.getValue()+" Times.");
		}
	}
}
}