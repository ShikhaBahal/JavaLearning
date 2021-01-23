package project;

public class SwapTwoIntegersWithoutUsingThirdVariable {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 25;
		
		x = x+y; //35
		y = x-y; //35-25=10
		x = x-y; // 35-10=25
		System.out.println("By using '+,-' operator");
		System.out.println("After swapping x is::"+x);
		System.out.println("After swapping y is::"+y);
		
		x = x*y; //250
		System.out.println("x::"+x);
		y = x/y; //250/25=10
		System.out.println("y::"+y);
		x = x/y; //250/10=25
		System.out.println("By using '*' operator");
		System.out.println("After swapping x is::"+x);
		System.out.println("After swapping y is::"+y);
		

	}

}
