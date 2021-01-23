package project;

import java.util.HashSet;
import java.util.Set;

public class DuplicateValueInArray {

	public static void main(String[] args) {
		
		String pgrm[] = {"Java","C","C++","Python","Java","C"};
		
		System.out.println("*******************Using For-loop********************");
		
		for(int i=0;i<pgrm.length;i++) {
			for(int j=i+1;j<pgrm.length;j++) {
				if(pgrm[i]==pgrm[j]) {
					System.out.println("The Duplicate Value is::"+pgrm[i]);
				}
			}
		}
		
		System.out.println("*******************Using HashSet********************");
		
		Set<String> unique = new HashSet<String>(); //stores unique values
		for(String name : pgrm) {
			if(unique.add(name)==false) {
				System.out.println("The Duplicate value is::"+name);
			}
		}
}
	
}
