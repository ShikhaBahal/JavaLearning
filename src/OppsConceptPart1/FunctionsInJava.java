package OppsConceptPart1;

public class FunctionsInJava {
	
	//Functions and Method are same thing don't be confuse
			//There are three types of functions
			//1-> No input No output
			//2-> No input Some output
			//3-> Some input and some output

	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava(); 
		//One Object will be created , obj is the reference variable , new FunctionsInJava() is the object
		//After creating the object , the copy of all non static methods will be given to this object 
		//but not the main method because object can not hold the static methods
		
		obj.NINO();
		String s1 = obj.NISO();
		System.out.println(s1);
		int c1 = obj.SISO(20, 30);
		System.out.println(c1);
		
		
		}
	
	//*****************Non Static Functions****************************
	
	//1-> No input No output
	public void NINO() {
		
		System.out.println("No input no output function");
		}
	
	//2-> No input Some output
	public String NISO() {
		String s = "No input some output function";
		return s;
	}
	
	//3-> Some input and some output
	public int SISO(int x,int y) {
		System.out.println("Some input and some output");
		int c = x+y;
		return c;
		}
	
	
}
