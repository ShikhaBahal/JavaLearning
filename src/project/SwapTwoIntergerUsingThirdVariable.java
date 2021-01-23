package project;

public class SwapTwoIntergerUsingThirdVariable {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 0;
		System.out.println("Before Swapping");
		System.out.println("a ::" + a);
		System.out.println("b ::" + b);
		c = a;
		a = b;
		b = c;
		System.out.println("After Swapping");
		System.out.println("a ::" + a);
		System.out.println("b ::" + b);

	}

}
