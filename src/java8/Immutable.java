package java8;

public final class Immutable {
	
	public String getField1() {
		return field1;
	}

	public String getField2() {
		return field2;
	}

	private final String field1 = new String();
	
	private final String field2 = new String();

	@Deprecated
	public void meth1() {
		
	}
}
