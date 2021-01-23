package project;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "Hello I am learning JAVA";
		String str1 = "Hello I am learning JAVA";
		System.out.println(str.length());
		System.out.println(str.charAt(6));
		System.out.println(str.indexOf("I"));
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf("e"));
		System.out.println(str.indexOf("e", str.indexOf("e") + 1));
		int index3 = str.indexOf("l", str.indexOf("l") + 1);
		System.out.println(str.indexOf("l", index3 + 1));

		System.out.println(str.indexOf("JAVA"));

		System.out.println(str.indexOf("Shikha")); // It will return -1

		// String Compare
		System.out.println(str.equals(str1));

		// Sub-String
		System.out.println(str.substring(0));
		System.out.println(str.substring(0, 5));
		System.out.println(str.subSequence(6, 19));

		// Trim
		String str2 = " Hello World ";
		System.out.println(str2.trim());

		// Replace
		System.out.println(str2.replace(" ", ""));

		// Split
		String str3 = "Hello_I_am_learning_Selenium";
		String splitVal[] = str3.split("_");
		System.out.println(Arrays.toString(splitVal));
		for (int i = 0; i < splitVal.length; i++) {
			System.out.println(splitVal[i]);
		}

		// Concat
		System.out.println(str3.concat(str2));
		System.out.println(str3.concat(" Shikha is a good girl"));

		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;
		System.out.println(x + y + a + b);
		System.out.println(a + b + x + y);
		System.out.println(x + y + (a + b));

	}

}
