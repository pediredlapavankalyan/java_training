package lib2;

import java.util.Arrays;

public class StreamDemo {

	public static void main(String[] args) {
		int[] a = { 10, 20, 40, 50, -20, 15, -44 };
		
		Arrays.stream(a)
		      .filter( v ->  v >= 0) // IntPredicate 
		      .sorted()
		     // .forEach(v -> System.out.println(v));
		      .forEach(System.out::println); // IntConsumer

	}

}
