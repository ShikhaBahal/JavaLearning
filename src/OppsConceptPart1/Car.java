package OppsConceptPart1;

//Class : Class is a entity where we have to define the properties , we have to define number of methods and variables 
// what is a method and what is a variable : Variables and methods are the characteristics of any particular class
//My name is shikha and I am a class (I am a human class) 
//so what is my name ? my name is shikha (here shikha is an Object reference of my human class . 
//ex: who is representing me? : Shikha is representing me)
//What are the characteristics of me ? Shikha can walk , Shikha can talk , Shikha can write the code so these are properties these are my characteristics
// So Class is an entity where number of properties are there , we have to define these properties in the form of variable and methods


public class Car {
	String Model; //Global Variable
	int Wheel; //Global Variable

	public static void main(String[] args) {
		
		// new car() is a object of Car Class
		//new keyword is used to create the object
		//maruti , verna , honda -- are Object reference variable
		Car maruti = new Car();
		Car verna = new Car();
		Car honda = new Car();
		
		maruti.Model = "Maruti Suzuki Desire";
		maruti.Wheel = 4;
		
		verna.Model = "Verna 1.5 MPI S MT 1497 cc";
		verna.Wheel = 4;
		
		honda.Model = "Honda Amaze";
		honda.Wheel = 4;
		
		System.out.println("---------------Before referencing the variable-----------");
		System.out.println("Maruti Model : "+maruti.Model+", Wheel : "+maruti.Wheel);
		System.out.println("verna Model : "+verna.Model+", Wheel : "+verna.Wheel);
		System.out.println("honda Model : "+honda.Model+", Wheel : "+honda.Wheel);
		System.out.println("---------------After referencing the variable-----------");
		
		maruti = verna;
		verna = honda;
		honda = maruti;
		
		maruti.Model="20";
		System.out.println(maruti.Model);
		honda.Model="40";
		System.out.println(maruti.Model);

	}

}
