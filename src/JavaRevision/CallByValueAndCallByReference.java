package JavaRevision;

public class CallByValueAndCallByReference {
	
	int p,q;

	public static void main(String[] args) {
		
		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		int i = obj.sum(10, 20); //Call by Reference
        System.out.println(i);
        obj.p = 80;
        obj.q = 90;
        System.out.println("Before Swap p is "+obj.p);
        System.out.println("Before Swap q is "+obj.p);
        obj.swap(obj);
	}

	public int sum(int a , int b) {
		a=30;
		b=50;
		int c;
		c = a + b;
		return c;
	}
	
	public void swap(CallByValueAndCallByReference t) {
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
		System.out.println("Value of p is::"+t.p);
		System.out.println("Value of q is::"+t.q);
	}
}
