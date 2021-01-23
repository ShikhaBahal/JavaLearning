package OOpsConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		// Static Polymorphism
		HSBC hs = new HSBC();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.CarLoan();
		hs.EducationLoan();
		hs.houseLoan();
		System.out.println(USBank.i);

		// Dynamic polymorphism
		// Child class object can be referred by parent interface reference variable
		USBank us = new HSBC();
		us.credit();
		us.debit();
		us.transferMoney();		
	}

}
