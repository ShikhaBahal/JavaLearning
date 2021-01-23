package JavaRevision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindDuplicateValueInArray {

	public static void main(String[] args) {
		
		String prgm[] = {"c++","java","c++","php"};
		
		List<String> list = new ArrayList<String>();
		list.add("mango");
		list.add("orange");
		list.add("orange");
		for(String fruite : list) {
			System.out.println(fruite);
		}
		
		Set<String> set = new HashSet<String>();
		set.add("shikha");
		set.add("shikha");
		set.add("Ritesh");
		System.out.println(set);
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "shikha");
		map.put(2, "Ritesh");
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		
		for(int i=0;i<prgm.length;i++) {
			for(int j=i+1;j<prgm.length;j++) {
				if(prgm[i]==prgm[j]) {
					System.out.println("Duplicate values is "+prgm[i]);
				}
			}
		}
		
		Set<String> s = new HashSet<String>();
		for(String name : prgm) {
			if(s.add(name)==false) {
				System.out.println("Duplicate Value is "+name);
			}
		}

	}

}
