package OOPS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class findDuplicates {

	public findDuplicates() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<String > List = new ArrayList<String>();
		//input list
		for (int i=1;i<10;i++)
		{
			List.add(String.valueOf(i));
		}
		
		for (int i=0;i<5;i++)
		{
			List.add(String.valueOf(i));
		}
		System.out.println("Inputed list is"+List);
		System.out.println("\nFiltered duplicates : " + processList(List));
	}
	public static Set<String> processList(List<String> listContainingDuplicates)
	
	 {
		final HashSet <String> resultset = new HashSet<String>();
		final HashSet <String> itemp = new HashSet<String>();
		 for (String Yourint:listContainingDuplicates)
		 {
			 if (!itemp.add(Yourint))
			 {
				 resultset.add(Yourint);
			 }
		 }
	
		
		
		return resultset;
		 
	 }
}
		