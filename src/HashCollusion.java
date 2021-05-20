import java.util.HashMap;
import java.util.Map;

import java8.Emp;

public class HashCollusion {

	String demoClassName = "HashCollusion" ;
	public static void main(String[] args) {

		Map<Emp,String> empString = new HashMap<Emp,String>();
		Emp e1 = new Emp("1","Mathen");
		Emp e2 = new Emp("2","Jeff");
		Emp e3 = new Emp("2","Sundar");
		
		empString.put(e1, "Val1Bkt");
		empString.put(e2, "Val2Bkt");
		empString.put(e3, "Val3Bkt");
		
		System.out.println("Demo Done!!!");
		
	}

}
