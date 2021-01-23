package project;

public class RemoveJUNKChar {

	public static void main(String[] args) {
		
		String str = "*&^%$#@)( Selenium with JAVA **&*******";
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);

	}

}
