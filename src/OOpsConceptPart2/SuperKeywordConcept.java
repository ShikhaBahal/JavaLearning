package OOpsConceptPart2;

public class SuperKeywordConcept extends ConstructorWithThisKeyword{
	
	SuperKeywordConcept(){
		super(); // used to call the parent class constructor
		System.out.println("Default Constructor");
	}
	
	SuperKeywordConcept(int i){
		super(i); // used to call the parent class constructor
		System.out.println("One Parameter Constructor");
	}
	
	SuperKeywordConcept(int i,int j){
		super(i,j); // used to call the parent class constructor
		System.out.println("Two Parameter Constructor");
	}
	
	

	public static void main(String[] args) {
		SuperKeywordConcept obj = new SuperKeywordConcept();
		SuperKeywordConcept obj1 = new SuperKeywordConcept(100);
		SuperKeywordConcept obj2 = new SuperKeywordConcept(200,300);

	}

}
