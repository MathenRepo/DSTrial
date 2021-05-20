package pass.by;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MethodReference {

	public static void main(String[] args) {

		List<String> sam = new ArrayList<String>();
		
		List<Integer> sam1 = new ArrayList<Integer>();
		
		sam.add("Google");
		sam.forEach(System.out::print);
		sam1.add(10);sam1.add(20);sam1.add(30);
		
		sam1.forEach(MethodReference::doubleValue); 
		
	}

	private static void doubleValue(int i) {
		System.out.println(i * 2);
	}
}
