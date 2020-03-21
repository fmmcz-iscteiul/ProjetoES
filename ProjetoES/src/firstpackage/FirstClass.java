package firstpackage;
/** 
 *  Simple Class with a hello world method
 */
public class FirstClass {
	/**
	 * Main method
	 */
	public static void main(String[] args) {
		FirstClass firstClass = new FirstClass();
		firstClass.helloWorld();
	}
	/**
	 * Returns a string with Hello World
	 */
	public String helloWorld() {
		return "Hello World";
	}

}
