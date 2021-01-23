package OOpsConceptPart2;

public class ConstructorWithThisKeyword {

	String name;
	int age;

	public ConstructorWithThisKeyword() {
		System.out.println("ConstructorWithThisKeyword");
	}

	public ConstructorWithThisKeyword(int i) {
		System.out.println("The value of i: " + i);
	}

	public ConstructorWithThisKeyword(int i, int j) {
		System.out.println("The value of i: " + i);
		System.out.println("The value of j: " + j);
	}

	public ConstructorWithThisKeyword(String name, int age) {
		this.name = name; // to initialize the class variables
		this.age = age;
		System.out.println(this.name);
		System.out.println(this.age);
	}

	public static void main(String[] args) {

		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword();
		ConstructorWithThisKeyword obj1 = new ConstructorWithThisKeyword(10);
		ConstructorWithThisKeyword obj2 = new ConstructorWithThisKeyword(20, 30);
		ConstructorWithThisKeyword obj3 = new ConstructorWithThisKeyword("Shikha", 23);

	}

}
