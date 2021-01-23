package OOpsConceptPart2;

public interface USBank {
	
	// In interface we can achieve multiple inheritance (A child class can implement multiple interfaces)
	// Only method declaration
	// No method body -- Only method prototype
	// In interface , we can define variables and by default these variables are static in nature
	// Variable value will not be changed 
	// No static method in interface because interface is a part of Object Oriented programming concept ,
	//its part of objects so Object can not handle static methods
	// No main method in inheritance
	// We can not create Object of Interface
	// Interface is abstract in nature
	
	
	int i = 100;
	public void credit();
	public void debit();
	public void transferMoney();

}
