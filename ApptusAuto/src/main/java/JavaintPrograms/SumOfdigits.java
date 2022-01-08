package JavaintPrograms;

public class SumOfdigits {

	public SumOfdigits() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumOfAllDigits(121);

	}
	
	    public static void sumOfAllDigits(int inputNumber)
	    {
	        //Creating a copy of input number
	 
	        int copyOfInputNumber = inputNumber;
	 
	        //Initializing sum to 0
	 
	        int sum = 0;
	 
	        while (copyOfInputNumber != 0)
	        {
	            //Getting last digit of the input number
	 
	            int lastDigit = copyOfInputNumber%10;
	 
	            //Adding last digit to sum
	 
	            sum = sum + lastDigit;
	 
	            //Removing last digit from the input number
	 
	            copyOfInputNumber = copyOfInputNumber/10;
	        }
	 
	        //Printing sum
	 
	        System.out.println("Sum Of All Digits In "+inputNumber+" = "+sum);
	    }
	 
}