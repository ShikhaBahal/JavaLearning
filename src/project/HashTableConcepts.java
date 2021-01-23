package project;

import java.util.Hashtable;

public class HashTableConcepts {

	public static void main(String[] args) {
		
		Hashtable hs = new Hashtable();
		hs.put("A", "Shikha");
		hs.put(1, "One");
		hs.put(0.1, "C");
		hs.put("D", "value");
		System.out.println(hs.size());
		System.out.println(hs.get("A"));
		System.out.println(hs.get(1));
		System.out.println(hs.get(0.1));
		
		hs.remove("D");
		
		System.out.println("*************Restricting Value***************");
		Hashtable<Integer,Integer> hs1 = new Hashtable<Integer,Integer>();
		hs1.put(1, 1000);
		hs1.size();
		System.out.println(hs1.get(1));
		
		Hashtable<Integer,String> hs2 = new Hashtable<Integer,String>();
		hs2.put(2, "value2");
		hs2.size();
	    System.out.println(hs2.get(2));

}
}
