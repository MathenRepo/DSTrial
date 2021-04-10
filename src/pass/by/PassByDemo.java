package pass.by;

public class PassByDemo {
	
	public static void main (String args[])
	{
		Ball red = new Ball("Red");
		
		Ball green = new Ball("Green");
		System.out.println(red.toString() + green);
		swapColours( red,green);
		System.out.println(red.toString() + green);

		
	}
	

	public static void swapColours(Ball b1, Ball b2) {
		b1.colour = "Yellow";
		b2.colour = "Blue";
	}

}
