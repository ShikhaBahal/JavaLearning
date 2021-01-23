package OppsConceptPart1;

public class LocalvsGlobalVariable {
	
	String name = "Shikha"; //Global Variable or Class variable
	int age = 23; //Global Variable or Class variable

	public static void main(String[] args) {
		LocalvsGlobalVariable obj = new LocalvsGlobalVariable();
		System.out.println(obj.name); 
		System.out.println(obj.age);
		int i = 20; // Local variable for main() method
		System.out.println(i);
		obj.sum();

	}
	
	public void sum() {
		int i = 10; // Local variable for sum() method
		int j = 15; // Local variable for sum() method
		System.out.println(i);
		System.out.println(j);
	}

}
