package OppsConceptPart1;

public class CallByValCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		CallByValCallByRef obj = new CallByValCallByRef();
		int x = 10;
		int y = 20;
		obj.sum(x, y); //Call by value OR pass by value
		
		//*****Before Swapping*********
		obj.p = 40;
		obj.q = 60;
		System.out.println("Before swapping P is "+obj.p+" and q is "+obj.q);
		
		//***********After Swapping**************
		obj.swap(obj); // Call by Reference
		System.out.println("After swapping P is "+obj.p+" and q is "+obj.q);
		

	}
	
	public int sum(int a, int b) {
		int c = a+b;
		System.out.println(c);
		return c;
		
	}
	
	public void swap(CallByValCallByRef r) {
		int temp;
		temp = r.p;
		r.p = r.q;
		r.q = temp;
		
	}

}
