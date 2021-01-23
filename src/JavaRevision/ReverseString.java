package JavaRevision;

public class ReverseString {

	public static void main(String[] args) {

		String name = "shikha";
		String temp = "";
		System.out.println(name.length());
		for (int i = name.length()-1; i >= 0; i--) {
		temp = temp + name.charAt(i);
		}
		System.out.println(temp);
	
	}

}
