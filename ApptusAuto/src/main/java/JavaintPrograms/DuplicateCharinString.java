package JavaintPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharinString {

	public DuplicateCharinString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DupCharInString("DDLJL");
	}
		public static void DupCharInString(String Str)
		
		{
			HashMap<Character, Integer> charcountmap= new HashMap<Character,Integer>();
			char StrArr[]=Str.toCharArray();
			
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
			}
			
		 for (Map.Entry entry:charcountmap.entrySet())
		 {
			 System.out.println("Occurence of "+entry.getKey() +" "+ entry.getValue()+" Times.");
		 }
		}
}
