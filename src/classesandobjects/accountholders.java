package classesandobjects;

public class accountholders {

	String name;
	String lastname;
	int age;
	float accountbalance;
	boolean eligibleforcc;
	
	public void iseligibleforcc() {
		
		if(age>20 && accountbalance >= 20000 )
			
			eligibleforcc = true;
		}
	

}
