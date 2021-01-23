package project;

public class StringReverse {

	public static void main(String[] args) {
		
		String str = "Shikha_Bahal";
		String rev = "";
		int len = str.length();
	
		for(int i = (len-1);i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		
		System.out.println("Using for loop: "+rev);
		
		StringBuffer sf = new StringBuffer(str);
		System.out.println("Using String Buffer class reverse function: "+sf.reverse());
	
	}

}
