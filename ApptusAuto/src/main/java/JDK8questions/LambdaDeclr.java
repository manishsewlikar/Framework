package JDK8questions;

public class LambdaDeclr{

	public LambdaDeclr() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		WebPage w1=(value) ->{System.out.println(value.toUpperCase());};
//		// TODO Auto-generated method stub
//		WebPage w1=new WebPage() {
//			
//			@Override
//			public void hearder(String value) {
//				// TODO Auto-generated method stub
//				System.out.println(value);
//			}
//		};
			w1.hearder("gpppg");
	}

}
