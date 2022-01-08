package JDK8questions;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.Stream;

public class Parllelstreamconcpet {

	public Parllelstreamconcpet() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForkJoinPool  corepool=ForkJoinPool.commonPool();
		System.out.println(corepool.getParallelism());
		Stream stream=Stream.of("Naveen","Navee","java","ja");
		//BaseStream ParallelStream = Stream.

	}

}
