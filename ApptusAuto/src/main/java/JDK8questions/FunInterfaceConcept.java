package JDK8questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.eclipse.jetty.client.api.Response.AsyncContentListener;

public class FunInterfaceConcept {

	public FunInterfaceConcept() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunInterface();
		FunInterface_Binary();
		FunInterface_Unary();
		FunInterface_Prdicate();
		FunInterface_Consumer();
		FunInterface_Supplier();
	}
	
	public static void FunInterface()
	{
		StringBuffer sb= new StringBuffer("CVBP");
		Function <String,Integer> func=x ->x.length();
		int len=func.apply("ManishsewlikarLK");
	System.out.println(sb.reverse());
		//System.out.println(func.apply("RMAJ"));
		Function<Integer, Integer> Func2=x -> x*2;
	//	System.out.println(func.andThen(Func2).apply("JAVA"));
		int result=func.andThen(Func2).apply("Manishsewlikar");
		System.out.println(result);
	}
	
	public static void FunInterface_Binary()
	{
		BinaryOperator<Integer> Bfunc=(x1,x2) -> x1*x2/100;
		int t=Bfunc.apply(100, 100);
		System.out.println("Addtion using binary  "+t);
	}
	
	public static void FunInterface_Unary()
	{
		List<String> LangList = new ArrayList<String>() ;
		LangList.add("DAC");
		LangList.add("PSL");
		UnaryOperator<Integer> Ufunc= x1 -> x1%2;
		int t=Ufunc.apply(100);
		System.out.println("Addtion using Unary Operator  "+t);
		LangList.replaceAll(ele-> ele+"---MCK");
		System.out.println(LangList);
	}
	
	public static void FunInterface_Prdicate()
	{
		Predicate<Integer> Func=x->x>5;
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer>collist=list.stream().filter(Func).collect(Collectors.toList()	);
		List<Integer>collist1=list.stream().filter(x -> x>5 && x<9).collect(Collectors.toList()	);
		System.out.println(collist);
		System.out.println(collist1);
		List<String>Namlist=Arrays.asList("Naveen","Navee","java","ja");
		Predicate<String>Funcstr=x->x.startsWith("Nav");
		List<String> namelist1= Namlist.stream().filter(Funcstr.negate()).collect(Collectors.toList());
		System.out.println(namelist1);
	}
	
	
	public static void FunInterface_Consumer()
	{
		Consumer<String> Cfunc=x ->System.out.println(x);
		Cfunc.accept("Consumer consumed");
	}

	
	public static void FunInterface_Supplier()
	{
		
		 //does not take any argument but return result.
		gettext(()-> "Manish");
		 
	}
	
	public static  void gettext(Supplier<String> text)
	{
		System.out.println(text.get().length());
	}

}

