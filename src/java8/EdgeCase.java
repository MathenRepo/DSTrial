package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EdgeCase {

	public static void main(String[] args) {


		List<Heavy> ls1 = new ArrayList<Heavy>();
		

		for(int i=1; i< 200000;i++) {
			ls1.add(new Heavy());
		}
		
		for(Heavy h : ls1)
		System.out.println(h);
		
	}

	
}

class Heavy{
	
	private List<ArrayList<String>> field1 = new ArrayList<ArrayList<String>>();
	
	private List<ArrayList<String>> field2 = new ArrayList<ArrayList<String>>();
	
	Map<Integer,Integer> field3 = new HashMap<>();
	
	Heavy(){
		for(int i=1; i< 100;i++) {
			field3.put(i, i);
			field1.add(new ArrayList<String>(i));
			field2.add(new ArrayList<String>(i));
		}
	}
	
	@Override
	public String toString() {
		return "Field 1" + field1 + ", Field 2=" + field2 + ", Field 3=" + field3
				+ "]";
	}
}
