package SingletonConcept;

public class Singleton {

	//Singlton class that can have only one object or instance of class at a time.
	//how to desing single ton class
	// constructor is private
	//static method having return type object of singleton class or lazy inilization 
	private static Singleton single_inst=null;
	public String str;
	
	private Singleton()
	{
		str="Iam singleton";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
