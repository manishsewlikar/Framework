/**
 * 
 */
package OOPS;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Admin
 *
 */
public class SmallestNLargest {

	/**
	 * 
	 */
	public SmallestNLargest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[]= {10,20,102 ,-998,999,00,100};
		int largest=numbers[0];
		int smallest=numbers[0];
		
		
		for (int i=1;i<numbers.length;i++)
			
		{
			if (numbers[i]>largest)
				
			
			{
				largest=numbers[i];
			}
			else if(numbers[i]<smallest)
			{
				smallest=numbers[1];
			}
			
		}
			System.out.println("Original array is "+Arrays.toString(numbers));
			
			System.out.println("Largest number is "+largest);
			
			System.out.println("smallest number is "+smallest);
			
			
		}

	


}