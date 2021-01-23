package project;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {

		// Dynamic Array -- ArrayList
		// 1. Can contain duplicate values/elements
		// 2. Maintains insertion order (stores values in the form of indexes)
		// 3. Synchronized
		// 4. Allows random access to fetch the elements because it stores the values on
		// the bases of index.

		ArrayList ar = new ArrayList(); // Dynamic Array
		ar.add("Shikha"); // 0
		ar.add(23); // 1
		ar.add("25/11/97"); // 2
		ar.add("Single"); // 3
		ar.add(4.5); // 4

		System.out.println(ar.size()); // Size of ArrayList
		System.out.println(ar.get(2)); // To get the values from an index

		System.out.println("********************************************");

		// To print all the values from ArrayList:
		// 1. For loop
		// 2. Using Iterator

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		// Generic in JAVA :
		// Before JDK 1.5 Generic were not supported in JAVA .
		// By using Generic you can define specified data type.

		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(10);

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("10");

		Employee e1 = new Employee("Shikha", 23, "Female");
		Employee e2 = new Employee("Ritesh", 25, "Male");
		Employee e3 = new Employee("Harsh", 20, "Male");

		ArrayList<Employee> ar3 = new ArrayList<Employee>();
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);

		// Iterator : To traverse the values in ArrayList

		Iterator<Employee> it = ar3.iterator();
		System.out.println("**************ITERAOR*******************");
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.Name);
			System.out.println(emp.age);
			System.out.println(emp.Gender);
		}

		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		Employee e4 = new Employee("Shikha", 23, "Female");
		Employee e5 = new Employee("Shivangi", 25, "Female");
		Employee e6 = new Employee("Pankaj", 20, "Male");
		ar4.add(e4);
		ar4.add(e5);
		ar4.add(e6);

		ar4.addAll(ar3); // merge two arrays ar4 and ar3
		// ar4.retainAll(ar3); // for getting common values between two arrays

		Iterator<Employee> it1 = ar4.iterator();
		System.out.println("**************addAll*******************");
		while (it1.hasNext()) {
			Employee emp1 = it1.next();
			System.out.println(emp1.Name);
			System.out.println(emp1.age);
			System.out.println(emp1.Gender);
		}

		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Shikha");
		ar5.add("Ritesh");
		ar5.add("Arti");

		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Shikha");
		ar6.add("Harsh");

		ar5.retainAll(ar6); // retain the common values in two arrays ar5 and ar6

		System.out.println("**************retainAll*******************");

		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}

	}

}
