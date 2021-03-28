package java8;

@FunctionalInterface
public interface IActor<T> {
	
	public static final String stageName = "stagename";
	
	public static final String actorName = "actorname";
	
	void dance(); 
		
	default void act() {
		System.out.println("Im Acting Generally");
	}

}
