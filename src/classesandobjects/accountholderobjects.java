package classesandobjects;

public class accountholderobjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		accountholders Ritesh = new accountholders();
		accountholders Shikha = new accountholders();
		accountholders Harsh = new accountholders();
		
		Ritesh.name="Ritesh";
		Ritesh.lastname="Aidasani";
		Ritesh.age=26;
		Ritesh.accountbalance=50000;
		Ritesh.iseligibleforcc();
		System.out.println("Is Ritesh eligible for CC :"+Ritesh.eligibleforcc);
		
		Shikha.name="Shikha";
		Shikha.lastname="Bahal";
		Shikha.age=24;
		Shikha.accountbalance=10000;
		Shikha.iseligibleforcc();
		System.out.println("Is Shikha eligible for CC :"+Shikha.eligibleforcc);

		Harsh.name="Harsh";
		Harsh.lastname="Kumar";
		Harsh.age=22;
		Harsh.accountbalance=21000;
		Harsh.iseligibleforcc();
		System.out.println("Is Harsh eligible for CC :"+Harsh.eligibleforcc);
	}

}
