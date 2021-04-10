package pass.by;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MethodReference {

	public static void main(String[] args) {

		int val = 10;
		
		List<String> sam = new ArrayList<String>();
		
		List<Integer> sam1 = new ArrayList<Integer>();
		
		sam.add("Google");
		sam.forEach(System.out::print);
		sam1.add(10);sam1.add(20);sam1.add(30);
		
		sam1.forEach(MethodReference::doubleValue); 
		
//		Map<String,String> kvSample = new HashMap<String,String>();
//		kvSample.put("Mathen", "Mathen");
//		Set<String> ks = (Set<String>) kvSample.keySet();
//		
//		ks.forEach(i -> {
//			System.out.println(i);
//			System.out.println(kvSample.get(i));
//		});
	}

	private static void doubleValue(int i) {
		System.out.println(i * 2);
	}
}
