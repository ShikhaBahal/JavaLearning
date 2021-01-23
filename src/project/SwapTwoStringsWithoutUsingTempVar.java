package project;

public class SwapTwoStringsWithoutUsingTempVar {

	public static void main(String[] args) {
		
		String x = "Hello";
		String y = "World";
		
		x = x+y; //HelloWorld
		y = x.substring(0, y.length());
		System.out.println("y is::"+y);
		x = x.substring(y.length());
		System.out.println("x is::"+x);
	}

}
