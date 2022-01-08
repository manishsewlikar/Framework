package OOPS;

import java.util.HashSet;

public class DuplicatesnamePractice {

	public DuplicatesnamePractice() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindDup();
	}
	
	public static void FindDup()
	{
		String names[]= {"jack","mack","rack","jack","mack"};
		 HashSet<String>Store= new HashSet<String>();
		 for (String name:names)
		 {
			 if (Store.add(name)==false) {
				 
				 System.out.println(name);
			 }
		 }
	}

}
