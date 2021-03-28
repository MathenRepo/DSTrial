package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sun.org.apache.xpath.internal.functions.Function2Args;

public class Movie {

	public static void main(String[] args) {

		System.out.println("Start Movie ... Playing Movie...");
		
		Hero vijaySethupathy = new Hero();
		
		vijaySethupathy.act();
		vijaySethupathy.dance();
		
		IActor vijay = new IActor() {
			
			@Override
			public void dance() {
				System.out.println("Vijay Dancing...");
				
			}
		};
		vijay.act();
		vijay.dance();
		
		IActor actorAjith = () -> System.out.println("Ajith is dancing...");
		actorAjith.act();
		actorAjith.dance();
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		
		list.forEach(i -> {
			
			int j = i*100;
			System.out.println("Printing Current Multiplier Value : " + new Integer(j));
		});
		
		Function f = new Function() {

			@Override
			public Object apply(Object t) {
				// TODO Auto-generated method stub
				int j = new Integer((int) t);
				return new Integer(j + 500);
			}
			
		};
		list.forEach(System.out::println );
		
		@SuppressWarnings("unchecked")
		List<Integer> modifiedListObj = (List<Integer>) list.stream().filter(i -> (i > 4)).map(f).collect(Collectors.toList());
		
		modifiedListObj.forEach(System.out::println);
		
		int result = modifiedListObj.stream().reduce((a,b) -> a < b ? a : b).orElse(0);
		
		System.out.println(result);
		
		List<Integer> intArr = Arrays.asList(100,99,88,200,300,2,5,4,3,2,1);
		
		System.out.println(intArr);
		Object[] arr = intArr.toArray();
		Arrays.sort(arr);
		Arrays.asList(arr).stream().forEach(System.out::println);
		
		Collections.sort(list);
		
 	}

} 
