package java8;

import java.util.ArrayList;
import java.util.List;

public class HexConverter {

	public static void main(String[] args) {
		
		int i = 999900, r=0;
		List<String> hexList = new ArrayList<String>();
		hexList.add("A");hexList.add("B");hexList.add("C");hexList.add("D");hexList.add("E");hexList.add("F");
		
		String hexString = "";
		
		System.out.println("Functional Hex String = " + Integer.toHexString(i));
		while (i > 16)
		{
			r = i%16;
			i = i/16;
			hexString = ((r>9) ? hexList.get((r-10)): r) + hexString;
		}
		
		hexString = ((i>9) ? hexList.get((i-10)): i) + hexString;
		System.out.println("Algorithmic Hex String = " + hexString);
		System.exit(0);

	}

}
