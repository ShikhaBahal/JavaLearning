package OOpsConceptPart2;

public class HSBC implements USBank,BrazilBank{ // We are achieving multiple inheritance
	// When a class implements a parent interface that relationship is called "Is A Relationship"
	// When child class extends a parent class that relationship is call "Has A Relationship"
	// If a class is implementing any interface then it is mandatory to define/override all the methods of interface 
	
	// Inherits from Parent USBank Interface
	public void credit() {
		System.out.println("HSBC --- Credit");
	}
	
	public void debit() {
		System.out.println("HSBC-- Debit");
	}
	
	public void transferMoney() {
		System.out.println("HSBC Trasfer Money");
	}
	
	// Self Methods of HSBC Class
	public void EducationLoan() {
		System.out.println("HSBC Education Loan");
	}
	
	public void CarLoan() {
		System.out.println("HSBC Car Loan");
	}
	
	// Inherits from Parent BrazilBank Interface
	public void houseLoan() {
		System.out.println("HSBC House Loan");
	}
}
