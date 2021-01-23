package JavaRevision;

public class RemoveJunkChar {

	public static void main(String[] args) {
		
		String name = "#shikha@***";
		String newname = name.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(newname);

	}

}
