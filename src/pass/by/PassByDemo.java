package pass.by;

public class PassByDemo {
	
	public static void main (String args[])
	{
		Ball red = new Ball("Red");
		
		Ball green = new Ball("Green");
		swap(red,green);
		System.out.println(red.toString() + green);
		swapColours( red,green);
		System.out.println(red.toString() + green);

		
	}
	
	public static void swap(Ball b1, Ball b2) {
		Ball temp = b1;
		b1 = b2;
		b2 = temp;
	}

	public static void swapColours(Ball b1, Ball b2) {
		b1.colour = "Yellow";
		b2.colour = "Blue";
	}

}
