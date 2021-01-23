package OOpsConceptPart2;

public class TestCAR {

	public static void main(String[] args) {
//Static Polymorphism or Compile time Polymorphism
//Why Compile time Polymorphism : Because at the time of compilation java will decide which method is need to call
//When methods you have created in parent class as well as child class we are achieving method overriding is called static Polymorphism
		BMW obj = new BMW();
		obj.start();
		obj.stop();
		obj.refuel();
		obj.theftsafety();
		obj.engine();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		//Only car class functions can be accessed 
	
	//Top Casting	
	Car c1 = new BMW();
	c1.start(); //It will call BMW start method (Overridden method)
	c1.engine();
	c1.stop();
	c1.refuel();
	//Child class object can be referred by parent class reference variable--This is called dynamic polymorphism
	//But only overridden methods will be called 
	//so common methods(Overridden method) plus parent class methods will be called in dynamic polymorphism
	
	//Down Casting
	 //BMW b1 = (BMW)new Car();
	 //But at run time it will give you exception of "Class Cast Exception"
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
