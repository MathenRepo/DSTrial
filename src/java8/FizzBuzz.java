package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String numberofInputs = s.nextLine();
		String inputs = s.nextLine(); 

		int numberofCase = Integer.parseInt(numberofInputs);
		for (int i=1;i <= numberofCase; i++)
		{
			
			List<String> inputsArr = Arrays.asList(inputs.split(" "));
			for (String curr : inputsArr)
			{
				for(int j = 1; j <=Integer.parseInt(curr); j++)
				{
					if(j %3 == 0 && j%5 == 0)
					{
						System.out.println("FizzBuzz");
					}
					else if(j%3 == 0)
					{
						System.out.println("Fizz");
					}
					else if(j%5 == 0)
					{
						System.out.println("Buzz");
					}
					else {
						System.out.println(j);
					}
				}
			}
		}

	}

}
