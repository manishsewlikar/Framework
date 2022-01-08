/**
 * 
 */
package OOPS;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Admin
 *
 */
public class arrayStudy {

	/**
	 * 
	 */
	public arrayStudy() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String [] array= {"manish","ravi","ashish","ravi"};
		Set <String> lists= new HashSet<String>();
		for (String  Names:array)
				{
					if (lists.add(Names)==false)
						System.out.println(Names);
				}
	}

}
