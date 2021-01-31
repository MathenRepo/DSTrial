 package pass.by;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class Ball implements Comparable, Comparator<Ball>{
	
	public String colour;
	public int id;

	public Ball(String colour) {
		super();
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Ball [colour=" + colour + "]";
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compare(Ball o1, Ball o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
