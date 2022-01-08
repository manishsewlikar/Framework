package OOPS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {

	public DuplicateElements() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hashset store unique number
		String names[]= {"JavaS","C++","PHP","kkk","kkk","C++","Java"};
		Set <String> store = new HashSet<String>();
		for(String name:names)
		{
			if (store.add(name)==false)
			{
				System.out.println("\n Duplicate string "+name);
			}
		}
		List<String> name1 = Arrays.asList("ZINGO", "Charles", "Pinto", "David");
		Collections.sort(name1);
		//Collections.max(arg0, arg1)
		System.out.println(name1);
		ArrayList<String> listWithDuplicateElements = new ArrayList<String>();
		 
        listWithDuplicateElements.add("JAVA");
 
        listWithDuplicateElements.add("J2EE");
 
        listWithDuplicateElements.add("JSP");
 
        listWithDuplicateElements.add("SERVLETS");
 
        listWithDuplicateElements.add("JAVA");
 
        listWithDuplicateElements.add("STRUTS");
 
        listWithDuplicateElements.add("JSP");
 
        //Printing listWithDuplicateElements
 
        System.out.print("ArrayList With Duplicate Elements :");
 
        System.out.println(listWithDuplicateElements);
 
        //Constructing LinkedHashSet using listWithDuplicateElements
 
        LinkedHashSet<String> set = new LinkedHashSet<String>(listWithDuplicateElements);
 
        //Constructing listWithoutDuplicateElements using set
 
        ArrayList<String> listWithoutDuplicateElements = new ArrayList<String>(set);
 
        //Printing listWithoutDuplicateElements
 
        System.out.print("ArrayList After Removing Duplicate Elements :");
 
        System.out.println(listWithoutDuplicateElements);
    }

	}


