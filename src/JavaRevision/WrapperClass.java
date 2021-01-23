package JavaRevision;

public class WrapperClass {

	public static void main(String[] args) {
		
		String s = "100";
		System.out.println(s+20);
		int i = Integer.parseInt(s);
		System.out.println(i+20);
		
		String r = String.valueOf(i);
		System.out.println(r+50);

	}

}
