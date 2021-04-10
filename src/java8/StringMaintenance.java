package java8;

public class StringMaintenance {

	public static void main(String[] args) {

		String s="aabaarbarccrabmq";
		//brbarrabmq
		//brbaabmq
		String modString = new String();
		boolean dupInd = false;
		while(true) {
		char[] cArray = s.toCharArray();
		int i=0;
		char currChar = '1';
		for(char c : cArray) {
			
			if(i == 0)
			{
				dupInd = false;
				modString = modString + (c);
				currChar = c;
				i++;
				continue;
			}
			if(c == currChar)
			{
				dupInd = true;
				modString = modString.substring(0,modString.length()-1);
			}
			else
			{
				
				modString = modString + (c);
				currChar = c;
			}
				
			i++;
		}
		System.out.println(modString);
		if(dupInd)
		{
			s = modString;
			modString = "";
		}

		else
		{
			break;
		}
		}
	}

}
