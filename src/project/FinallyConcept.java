package project;

public class FinallyConcept {

	public static void main(String[] args) {

		// finally is a block
		// always used with try-catch block
		// Used to execute the code with finally block no matter exception is occurring or not
		// finally block will be always executed

	    test();
	    test1();
		div();
	}
	
	public static void test() {
		
		System.out.println("***********Test Method*************");
		
		try {
			
			System.out.println("***********try*************");
	        throw new RuntimeException("**********RuntimeException************");
		}
		catch(Exception e){
			System.out.println("***********catch*************");
			System.out.println(e);
		}
		
		finally {
			System.out.println("***********finally*************");
		}
	}
	
	public static void test1() {
		System.out.println("***********Test1 Method*************");
         try {
			
			System.out.println("***********Test1 try*************");
	        throw new RuntimeException("**********Test1 RuntimeException************");
		}

         finally {
	        System.out.println("***********Test1 finally*************");
     }
		
		
	}
	
	public static void div() {
		System.out.println("*********Div method*********");
		try {
			System.out.println("*******Try Block**********");
			throw new RuntimeException("**********div runtime exception**********");
		}
		catch(NullPointerException e){
			System.out.println("*****Catch Block*******");
			System.out.println(e);
		}
		
		finally {
			
			System.out.println("*******Finally block**********");
		}
	}

}


