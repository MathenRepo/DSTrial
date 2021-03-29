package java8;

import java.util.Arrays;
import java.util.List;

public class StreamOpDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		System.out.println("Success Get It!!!");
		
		List<Integer> myList = Arrays.asList(1,2,3);
		
		myList.forEach(i -> System.out.print(i*3));
		
		myList.forEach(i -> System.out.print(i*4));
		
		myList.forEach(System.out::print);
		
		System.out.println("\n\r");
		Integer result = myList.stream().map(i -> i*2).reduce(0,(e1,e2) -> e1+e2);
		
		System.out.println(result);

	}

}
