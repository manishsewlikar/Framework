/**
 * 
 */
package OOPS;

/**
 * @author Admin
 *
 */
public class StrReval {

	/**
	 * 
	 */
	public StrReval() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String IStr="PESIPCO";
		String revString = "";
		for (int i=IStr.length()-1;i>=0;--i)
		{	
			revString+=IStr.charAt(i);
	}	
		System.out.println("Reverse String   "+revString);
	}
}
