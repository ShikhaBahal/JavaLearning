package OppsConceptPart1;

public class WrapperClass {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		
		// Data conversion : String to integer , Where "Integer" is wrapper class available in java
		// Wrapper classes available in java : Integer , Double , Boolean
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//Data Conversion : String to Double
		String a = "12.35";
		System.out.println(a+10);
		double d = Double.parseDouble(a);
		System.out.println(d+10);
		
		//Data Conversion : String to Boolean
		String c = "true";
		boolean b = Boolean.parseBoolean(c);
		System.out.println(b);
		
		//integer to String
		int j = 250;
		String s = String.valueOf(j);
		System.out.println(s+200 );
		
		//String to integer : with not a pure numeric string
//		String u = "100A";
//		int f = Integer.parseInt(u); // It will give you NumberFormatException for String "100A"
//      System.out.println(f);
	}

}
