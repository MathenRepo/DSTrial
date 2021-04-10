package java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class API_Alt {

	public static void main(String[] args) {

		//List<Integer> 1,17,38,24,6,5 - 2nd largest
		
		//List<String>  Apple(4), Orange(3),Mango(2), Banana(1) -> map(Fruitname, count of that fruit) - printing , in descending order of fruit count. 
		
		List<Integer> intList = new ArrayList<Integer>();
		
		intList.add(1);intList.add(17);intList.add(38);intList.add(24);intList.add(6);intList.add(5);
		
		intList.sort((i,j) -> i.compareTo(j));
		
		System.out.println("Q1 ->" + intList.get(intList.size()-2));
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");fruits.add("Apple");fruits.add("Apple");fruits.add("Apple");
		fruits.add("Orange");fruits.add("Orange");fruits.add("Orange");
		fruits.add("Mango");fruits.add("Mango");
		fruits.add("Banana");
		
		List<String> fruits1 = (List<String>) ((ArrayList) fruits).clone();
		System.out.println(fruits1);
		List<String> convertedList = fruits1.stream().map(i -> i + " Fruit").sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(convertedList);
		Map<String,Integer> countMap = new HashMap<>();
		countMap.put("Apple", 0);countMap.put("Orange", 0);countMap.put("Mango", 0);countMap.put("Banana", 0);
//		countMap.put("Apple",
		for(String s : countMap.keySet()) {
			fruits.forEach(i -> {
		
				int count = (i.equalsIgnoreCase(s)) ? countMap.put(s,countMap.get(s) + 1) : 0;
			});
		}

		Stream<Entry<String, Integer>> sortedMapStream = countMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));
		LinkedHashMap<String,Integer> sortedMap = sortedMapStream.collect(Collectors.toMap(Map.Entry::getKey, 
                Map.Entry::getValue,
                (v1,v2)->v1,
                LinkedHashMap::new));
		System.out.println(sortedMap);
		
	}
	
	

}
