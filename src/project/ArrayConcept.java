package project;

public class ArrayConcept {

	public static void main(String[] args) {
		//array : to store similar data type of values in array variable
		//Lowest Bound/index = 0
		//Upper Bound/index = n-1 (n is the size of array)
		
		// Advantages of array : you can store multiple values in a single variable with similar data types
		//Disadvantages of array : 
		//1-Size is fixed (Static Array) - To overcome this problem we use collection - ArrayList , HashTable (Dynamic Array)
		//2-Stores only similar data types- To overcome this problem we use Object array
		
		String x[] = new String[6];
		System.out.println(x.length); //size or length of array
		x[0] = "R";
		x[1] = "I";
		x[2] = "T";
		x[3] = "E";
		x[4] = "S";
		x[5] = "H";
		
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i]);
		}
		
		System.out.println();
		
		// if you try to access a value which is not exist for example :
		//System.out.println(x[6]); // It will give you ArrayIndexOutOfBoundsException
		
		//Object Array : Object is a super class available in java
		Object obj[] = new Object[5];
		obj[0] = "Shikha";
		obj[1] = "Bahal";
		obj[2] = "25/11/97";
		obj[3] = "Female";
		obj[4] = "London";
		
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
		
		
		// Two Dimensional Array
		
		String i[][] = new String[3][4];
		System.out.println(i.length); // return number of rows
		System.out.println(i[0].length); // return the number of columns
		
		i[0][0] = "A";
		i[0][1] = "B";
		i[0][2] = "C";
		i[0][3] = "D";
		i[1][0] = "E";
		i[1][1] = "F";
		i[1][2] = "G";
		i[1][3] = "H";
		i[2][0] = "I";
		i[2][1] = "J";
		i[2][2] = "K";
		i[2][3] = "L";
		
		for(int row=0;row<i.length;row++) {
			for(int col=0;col<i[0].length;col++) {
				System.out.println(i[row][col]);
			}
		}
		

	}

}
