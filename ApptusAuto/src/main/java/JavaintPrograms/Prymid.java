package JavaintPrograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Prymid {

	public Prymid() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatePrymid(5);
		String str="ABCD";
		/*
		 * duplicateCharCount("abbaaddbabdd");
		 * System.out.println("Recursive way"+recursiveMethod(str));
		 * printMaxOccurringChar("abbaddbab");
		 */
	}
	
	public static void CreatePrymid(int noOfRows)
	
	{
		   
		 
		        //Taking noOfRows value from the user
		 
		        System.out.println("How Many Rows You Want In Your Pyramid?   "+noOfRows);
		 
		     
		 
		        //Initializing rowCount with 1
		 
		        int rowCount = 1;
		 
		        System.out.println("Here Is Your Pyramid");
		 
		        //Implementing the logic
		 
		        for (int i = noOfRows; i > 0; i--)
		        {
		            //Printing i spaces at the beginning of each row
		 
		            for (int j = 1; j <= i; j++)
		            {
		                System.out.print(" ");
		            }
		 
		            //Printing 'rowCount' value 'rowCount' times at the end of each row
		 
		            for (int j = 1; j <= rowCount; j++)
		            {
		                System.out.print(rowCount+" ");
		            }
		 
		            System.out.println();
		 
		            //Incrementing the rowCount
		 
		            rowCount++;
		        }
		    }
	static void duplicateCharCount(String inputString)
    {
        //Creating a HashMap containing char as key and it's occurrences as value
 
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
 
        //Converting given string to char array
 
        char[] strArray = inputString.toCharArray();
 
        //checking each char of strArray
 
        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                //If char is present in charCountMap, incrementing it's count by 1
 
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
 
                charCountMap.put(c, 1);
            }
        }
 
        //Getting a Set containing all keys of charCountMap
 
        Set<Character> charsInString = charCountMap.keySet();
 
        System.out.println("Duplicate Characters In "+inputString);
 
        //Iterating through Set 'charsInString'
 
        for (Character ch : charsInString)
        {
            if(charCountMap.get(ch) > 1)
            {
                //If any char has a count of more than 1, printing it's count
 
                System.out.println(ch +" : "+ charCountMap.get(ch));
            }
        }
    }
	 static String recursiveMethod(String str)
	{
	     if ((null == str) || (str.length() <= 1))
	     {
	            return str;
	     }
	 
	     return recursiveMethod(str.substring(1)) + str.charAt(0);
	}
	 
	 public  static void printMaxOccurringChar(String inputString)
	    {   
	        HashMap<Character, Integer> charCountMap = new HashMap<>();
	         
	        char[] charArray = inputString.replaceAll("\\s+", "").toCharArray();
	         
	        for (char c : charArray) 
	        {
	            if (charCountMap.containsKey(c))
	            {
	                charCountMap.put(c, charCountMap.get(c)+1);
	            }
	            else
	            {
	                charCountMap.put(c, 1);
	            }
	        }
	         
	        Set<Entry<Character, Integer>> entrySet = charCountMap.entrySet();
	         
	        int maxCount = 0;
	         
	        char maxChar = 0;
	         
	        for (Entry<Character, Integer> entry : entrySet) 
	        {
	            if (entry.getValue() > maxCount)
	            {
	                maxCount = entry.getValue();
	                 
	                maxChar = entry.getKey();
	            }
	        }
	         
	        System.out.println("Input String : "+inputString);
	         
	        System.out.println("Maximum Occurring char and its count :");
	         
	        System.out.println(maxChar+" : "+maxCount);
	    }
	     
	    
	 
		}
	


