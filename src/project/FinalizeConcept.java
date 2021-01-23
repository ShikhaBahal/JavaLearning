package project;

public class FinalizeConcept {
	
	public void finalize(){
		System.out.println("Finalise method");
	}

	public static void main(String[] args) {
		
		// finalize is a method
		// Used to clean-up processing of the object 
		// Just before the garbage collector finalize method will be automatically called
		// No need to call from main method 
		
		FinalizeConcept fc = new FinalizeConcept();
		//FinalizeConcept fc1 = new FinalizeConcept();
		
		fc = null;
		//fc1 = null;
		
		System.gc();
		

	}
	
	

}
