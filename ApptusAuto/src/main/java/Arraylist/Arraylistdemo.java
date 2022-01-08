package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylistdemo {

	public Arraylistdemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> obj  =new ArrayList<String>();
		obj.add("M"	);
		obj.add("12.4");
		obj.add("89");
		
		//for (int i=0;i<obj.size();i++)
		for(Object obj1:obj)
		{
		System.out.println(obj1);

	}
		Iterator<String> it =obj.iterator();	
		 
		while (it.hasNext())
			
		{
			Object itr=it.next();
			System.out.println("using iterator"+itr);
		}
		

}
}